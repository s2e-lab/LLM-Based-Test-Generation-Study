package tests;

${importedPackages}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ${className}Test {

    @Test
    public  void testScenario1() throws Exception{
        ${scenario1}
    }

    @Test
    public  void testScenario2() throws Exception{
        ${scenario2}
    }

    @Test
    public  void testScenario3() throws Exception{
        ${scenario3}
    }
}