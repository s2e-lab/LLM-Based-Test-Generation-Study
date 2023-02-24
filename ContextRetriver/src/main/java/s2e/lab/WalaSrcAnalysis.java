package s2e.lab;

import com.ibm.wala.cast.ir.ssa.AstIRFactory;
import com.ibm.wala.cast.java.ipa.callgraph.JavaSourceAnalysisScope;
import com.ibm.wala.cast.java.translator.jdt.ecj.ECJClassLoaderFactory;
import com.ibm.wala.classLoader.*;
import com.ibm.wala.ipa.callgraph.*;
import com.ibm.wala.ipa.callgraph.cha.CHACallGraph;
import com.ibm.wala.ipa.callgraph.impl.Util;
import com.ibm.wala.ipa.callgraph.propagation.SSAPropagationCallGraphBuilder;
import com.ibm.wala.ipa.cha.ClassHierarchyFactory;
import com.ibm.wala.ipa.cha.IClassHierarchy;
import com.ibm.wala.ssa.SSAOptions;
import com.ibm.wala.ssa.SymbolTable;
import com.ibm.wala.util.CancelException;
import com.ibm.wala.util.WalaException;
import com.ibm.wala.util.config.FileOfClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.jar.JarFile;

@Deprecated
public class WalaSrcAnalysis {

    public static String EXCLUSION_FILE = "./resources/Java60RegressionExclusions.txt";
    public static String JAVA_RUNTIME_17 = "./resources/jdk-17.0.1/rt.jar";
    public static String JAVA_RUNTIME_8 = "./resources/jre1.8.0_121_debug/lib/rt.jar";


    public static JavaSourceAnalysisScope createScope(File sourceFile) throws IOException {
        JavaSourceAnalysisScope scope = new JavaSourceAnalysisScope();
        // adds primordial (built-in) classes
        scope.addToScope(scope.getPrimordialLoader(), new JarFileModule(new JarFile(JAVA_RUNTIME_17, false)));

        // add the source directory
        if (sourceFile.isDirectory())
            scope.addToScope(JavaSourceAnalysisScope.SOURCE, new SourceDirectoryTreeModule(sourceFile));
        else
            scope.addToScope(JavaSourceAnalysisScope.SOURCE, new SourceFileModule(sourceFile, sourceFile.getName(), null));

        // sets exclusion file
        scope.setExclusions(new FileOfClasses(new FileInputStream(EXCLUSION_FILE)));
        return scope;
    }


    public static CallGraph buildNCfaCallGraph(JavaSourceAnalysisScope scope, IClassHierarchy classHierarchy, int n) throws CallGraphBuilderCancelException {
        AnalysisOptions options = new AnalysisOptions();
        options.setAnalysisScope(scope);

        SSAOptions ssaOptions = new SSAOptions();
        ssaOptions.setDefaultValues(SymbolTable::getDefaultValue);

        options.setSSAOptions(ssaOptions);
        Iterable<Entrypoint> entrypoints = Util.makeMainEntrypoints(scope.getSourceLoader(), classHierarchy);
        options.setEntrypoints(entrypoints);
        AnalysisCache analysisCache = new AnalysisCacheImpl(AstIRFactory.makeDefaultFactory(), options.getSSAOptions());
        SSAPropagationCallGraphBuilder builder = Util.makeNCFABuilder(n, options, analysisCache, classHierarchy, scope);

        return builder.makeCallGraph(options, null);
    }

    public static CallGraph buildChaCallGraph(JavaSourceAnalysisScope scope, IClassHierarchy classHierarchy) throws CancelException {
        CHACallGraph cg = new CHACallGraph(classHierarchy, true);
        Iterable<Entrypoint> entrypoints = Util.makeMainEntrypoints(scope.getSourceLoader(), classHierarchy);
        cg.init(entrypoints);
        return cg;
    }

    public static void main(String[] args) throws IOException, CancelException, WalaException {
        File project = new File("/Users/lsiddiqsunny/Documents/Notre Dame/Research/Deep-Context-Aware-CodeGeneration/EvoSuiteBenchmark/1_tullibee/src/main/java/com/ib/client/");
        //       File project = new File("./resources/Example1.java");
//        System.out.println(new File(".").getAbsolutePath());
//
//        ECJJavaSourceAnalysisEngine engine = new ECJJavaSourceAnalysisEngine();
//        engine.addSystemModule(new JarFileModule(new JarFile(JAVA_RUNTIME_17, false)));
//        engine.setExclusionsFile(EXCLUSION_FILE);
//
//        engine.addSourceModule(new SourceFileModule(project, project.getName(), null));
//
//        // add the source directory
//        if (project.isDirectory())
//        {
//            List<File> javaFiles = JavaSearcher.findJavaFiles(project);
//            for (File javaFile : javaFiles)
//                engine.addSourceModule(new SourceFileModule(javaFile, javaFile.getName(), null));
//        }
//        else
//            engine.addSourceModule(new SourceFileModule(project, project.getName(), null));
//
//        engine.buildAnalysisScope();
//
//        IClassHierarchy cha = engine.buildClassHierarchy();
//        System.out.println("Classes: " + cha.getNumberOfClasses());
//        System.out.println(cha.getScope().toString());
////        CallGraph callGraph = engine.buildDefaultCallGraph();
//        CallGraphBuilder<InstanceKey> builder = engine.defaultCallGraphBuilder();
////        CallGraphBuilder<InstanceKey> builder = engine.defaultCallGraphBuilder();
////        AnalysisOptions options = engine.getOptions();
//
//        CallGraph callGraph = builder.makeCallGraph(engine.getOptions(), null);
//
//        new WalaViewer(callGraph, builder.getPointerAnalysis());

        // creates analysis scope
        JavaSourceAnalysisScope scope = createScope(project);

        // creates class hierarchy
        ClassLoaderFactory factory = new ECJClassLoaderFactory(scope.getExclusions());
        IClassHierarchy classHierarchy = ClassHierarchyFactory.make(scope, factory);
        System.out.println("Classes: " + classHierarchy.getNumberOfClasses());


        // CHA Call Graph
        CallGraph chaCallGraph = buildChaCallGraph(scope, classHierarchy);
        System.out.println("CHA Call Graph: " + chaCallGraph.getNumberOfNodes());

    }
}


///**
// * This is a simple example WALA application that uses WALA to build a call graph from a source file.
// *
// * @author Joanna C. S. Santos
// */
//public class WalaExampleSrcAnalysis {
//    private static String EXCLUSION_FILE = "./src/main/resources/Java60RegressionExclusions.txt";
//    private static String JAVA_RUNTIME = "./src/main/resources/jdk-17.0.1/rt.jar";
//
//    public static JavaSourceAnalysisScope createScope(File sourceFile) throws IOException {
//        JavaSourceAnalysisScope scope = new JavaSourceAnalysisScope();
//        // adds primordial (built-in) classes
//        scope.addToScope(scope.getPrimordialLoader(), new JarFile(JAVA_RUNTIME, false));
//        // adds application classes (source code)
//        scope.addToScope(scope.getSourceLoader(), new SourceFileModule(sourceFile, sourceFile.getName(), null));
//        // sets exclusion file
//        scope.setExclusions(new FileOfClasses(new FileInputStream(EXCLUSION_FILE)));
//        return scope;
//    }
//
//    public static CallGraph buildChaCallGraph(JavaSourceAnalysisScope scope, IClassHierarchy classHierarchy) throws CancelException {
//        CHACallGraph cg = new CHACallGraph(classHierarchy, true);
//        Iterable<Entrypoint> entrypoints = Util.makeMainEntrypoints(scope.getSourceLoader(), classHierarchy);
//        cg.init(entrypoints);
//        return cg;
//    }
//
//    public static CallGraph buildRtaCallGraph(AnalysisScope scope, IClassHierarchy classHierarchy) throws CallGraphBuilderCancelException {
//        AnalysisOptions options = new AnalysisOptions();
//        Iterable<Entrypoint> entrypoints = Util.makeMainEntrypoints(scope, classHierarchy);
//        options.setEntrypoints(entrypoints);
//        AnalysisCache analysisCache = new AnalysisCacheImpl();
//        CallGraphBuilder<InstanceKey> cgBuilder = Util.makeRTABuilder(options, analysisCache, classHierarchy, scope);
//        return cgBuilder.makeCallGraph(options, null);
//    }
//
//    public static CallGraph buildNCfaCallGraph(AnalysisScope scope, IClassHierarchy classHierarchy, int n) throws CallGraphBuilderCancelException {
//        AnalysisOptions options = new AnalysisOptions();
//        Iterable<Entrypoint> entrypoints = Util.makeMainEntrypoints(scope, classHierarchy);
//        options.setEntrypoints(entrypoints);
//        AnalysisCache analysisCache = new AnalysisCacheImpl();
//        SSAPropagationCallGraphBuilder builder = Util.makeNCFABuilder(n, options, analysisCache, classHierarchy, scope);
//
//        return builder.makeCallGraph(options, null);
//    }
//
//    public static void main(String[] args) throws Exception {
//        String exampleFile = "./src/main/resources/Example1.java";
//
//        // creates analysis scope
//        JavaSourceAnalysisScope scope = createScope(new File(exampleFile));
//
//        // creates class hierarchy
//        IClassHierarchy classHierarchy = ClassHierarchyFactory.make(scope);
//
//
//        // CHA Call Graph
//        CallGraph chaCallGraph = buildChaCallGraph(scope, classHierarchy);
//
//        // Converts to DOT format
//        DotUtil.dotify(chaCallGraph,
//                cgNode -> cgNode.getMethod().getSignature()
//                , "cha-cg-" + exampleFile.split("/")[4] + ".dot",
//                null,
//                null);
//
//
//        for (CGNode node : chaCallGraph.getEntrypointNodes()) {
//            System.out.println(node.getIR());
//        }
//
//        // RTA
//        CallGraph rtaCallGraph = buildRtaCallGraph(scope, classHierarchy);
//        Graph<CGNode> prunedRta = GraphSlicer.prune(rtaCallGraph, n -> n.getMethod().getDeclaringClass().getClassLoader().getReference().equals(ClassLoaderReference.Application));
//        DotUtil.dotify(prunedRta,
//                cgNode -> cgNode.getMethod().getSignature(),
//                "rta-cg-" + exampleFile.split("/")[4] + ".dot",
//                null,
//                null);
//
//
//        // n-CFA
//        CallGraph oneCFA = buildNCfaCallGraph(scope, classHierarchy, 1);
//        Graph<CGNode> prunedCFA = GraphSlicer.prune(oneCFA, n -> n.getMethod().getDeclaringClass().getClassLoader().getReference().equals(ClassLoaderReference.Application));
//        DotUtil.dotify(prunedCFA,
//                cgNode -> cgNode.getMethod().getSignature() + "@" + cgNode.getContext(),
//                "1-cfa-cg-" + exampleFile.split("/")[4] + ".dot",
//                null,
//                null);
//
//    }
//
//
//}