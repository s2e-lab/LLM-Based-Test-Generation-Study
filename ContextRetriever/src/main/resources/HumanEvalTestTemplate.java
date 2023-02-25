package ${packageName};

${importedPackages}
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ${className}Test {

    @Test
    public void test() throws Exception{
        ${assertions}
    }

}