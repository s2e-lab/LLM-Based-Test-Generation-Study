package s2e.lab;

import com.github.javaparser.resolution.TypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;

import java.io.File;

public class JavaParserTypeSolver {
    public static void main(String[] args) {

        TypeSolver typeSolver = new CombinedTypeSolver(new ReflectionTypeSolver(), new com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver(new File("/Users/lsiddiqsunny/Documents/Notre Dame/Research/Deep-Context-Aware-CodeGeneration/EvoSuiteBenchmark/1_tullibee/src/main/java/com/ib/client")));
        System.out.println(typeSolver.solveType("AnyWrapperMsgGenerator"));

    }
}
