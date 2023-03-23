package s2e.lab.generators;

import com.ibm.wala.cast.java.client.ECJJavaSourceAnalysisEngine;
import com.ibm.wala.cast.java.ipa.callgraph.JavaSourceAnalysisScope;
import com.ibm.wala.classLoader.IClass;
import com.ibm.wala.classLoader.JarFileModule;
import com.ibm.wala.classLoader.SourceDirectoryTreeModule;
import com.ibm.wala.ipa.callgraph.AnalysisOptions;
import com.ibm.wala.ipa.callgraph.CallGraph;
import com.ibm.wala.ipa.callgraph.CallGraphBuilder;
import com.ibm.wala.ipa.callgraph.CallGraphBuilderCancelException;
import com.ibm.wala.ipa.callgraph.impl.AllApplicationEntrypoints;
import com.ibm.wala.ipa.callgraph.propagation.InstanceKey;
import com.ibm.wala.ipa.cha.IClassHierarchy;
import com.ibm.wala.types.ClassLoaderReference;

import java.io.File;
import java.io.IOException;
import java.util.function.Function;
import java.util.jar.JarFile;

public class CallGraphGenerator {
    public static String EXCLUSION_FILE = "./src/main/resources/Java60RegressionExclusions.txt";
    public static String JAVA_RUNTIME_17 = "./src/main/resources/jdk-17.0.1/rt.jar";

    public static CallGraph computeCallGraph(File project) throws IOException, CallGraphBuilderCancelException {
        ECJJavaSourceAnalysisEngine engine = new ECJJavaSourceAnalysisEngine();
        engine.addSystemModule(new JarFileModule(new JarFile(JAVA_RUNTIME_17, false)));
        engine.setExclusionsFile(EXCLUSION_FILE);

        engine.addSourceModule(new SourceDirectoryTreeModule(project));
        engine.buildAnalysisScope();
        IClassHierarchy cha = engine.buildClassHierarchy();


        Function<IClass, Boolean> isApplicationClass = c ->
                c.getClassLoader().getReference().equals(ClassLoaderReference.Application) || c.getClassLoader().getReference().equals(JavaSourceAnalysisScope.SOURCE);
        AllApplicationEntrypoints entrypoints = new AllApplicationEntrypoints(cha.getScope(), cha, isApplicationClass);


        CallGraphBuilder<InstanceKey> builder = engine.defaultCallGraphBuilder();
        AnalysisOptions options = engine.getOptions();
        options.setEntrypoints(entrypoints);

        return builder.makeCallGraph(engine.getOptions(), null);
    }


}
