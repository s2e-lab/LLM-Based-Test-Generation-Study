// ParameterAttributes_1Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_1Test {

    private static final Logger log = Logger.getLogger(ParameterAttributes_1Test.class);

    /**
    * Test of {@link ParameterAttributes#valueFor(float)} method, of class ParameterAttributes.
    */
    @Test
    void testValueFor() {
        log.info("valueFor");
        ParameterAttributes instance = new ParameterAttributes();
        instance.setElasticity(new Float(0.5));
        instance.setDemandCurveFunction(new LinearFunction());
        instance.setLn(new Boolean(true));
        float expResult = 0.5f;
        float result = instance.valueFor(1.0f);
        assertEquals(expResult, result, 0.0);
    }
}

// ParameterAttributes_2Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_2Test {
		
    private static final Logger log = Logger.getLogger(ParameterAttributes_2Test.class);

    /**
    * Test of {@link ParameterAttributes#valueFor(float)} method, of class ParameterAttributes.
    */
    @Test
    void testValueFor() {
        log.info("valueFor");
        ParameterAttributes instance = new ParameterAttributes();
        instance.setElasticity(new Float(0.5));
        instance.setDemandCurveFunction(new LinearFunction());
        instance.setLn(new Boolean(false));
        float expResult = 0.5f;
        float result = instance.valueFor(1.0f);
        assertEquals(expResult, result, 0.0);
    }
}

// ParameterAttributes_3Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_3Test {
		
    private static final Logger log = Logger.getLogger(ParameterAttributes_3Test.class);

    /**
    * Test of {@link ParameterAttributes#valueFor(float)} method, of class ParameterAttributes.
    */
    @Test
    void testValueFor() {
        log.info("valueFor");
        ParameterAttributes instance = new ParameterAttributes();
        instance.setElasticity(new Float(0.5));
        instance.setDemandCurveFunction(new LinearFunction());
        instance.setLn(new Boolean(true));
        float expResult = 0.5f;
        float result = instance.valueFor(1.0f);
        assertEquals(expResult, result, 0.0);
    }
}

// ParameterAttributes_4Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_4Test {
		
    private static final Logger log = Logger.getLogger(ParameterAttributes_4Test.class);

    /**
    * Test of {@link ParameterAttributes#valueFor(float)} method, of class ParameterAttributes.
    */
    @Test
    void testValueFor() {
        log.info("valueFor");
        ParameterAttributes instance = new ParameterAttributes();
        instance.setElasticity(new Float(0.5));
        instance.setDemandCurveFunction(new LinearFunction());
        instance.setLn(new Boolean(false));
        float expResult = 0.5f;
        float result = instance.valueFor(1.0f);
        assertEquals(expResult, result, 0.0);
    }
}

// ParameterAttributes_5Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_5Test {
		
    private static final Logger log = Logger.getLogger(ParameterAttributes_5Test.class);

    /**
    * Test of {@link ParameterAttributes#valueFor(float)} method, of class ParameterAttributes.
    */
    @Test
    void testValueFor() {
        log.info("valueFor");
        ParameterAttributes instance = new ParameterAttributes();
        instance.setElasticity(new Float(0.5));
        instance.setDemandCurveFunction(new LinearFunction());
        instance.setLn(new Boolean(true));
        float expResult = 0.5f;
        float result = instance.valueFor(1.0f);
        assertEquals(expResult, result, 0.0);
    }
}

// ParameterAttributes_6Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_6Test {
		
    private static final Logger log = Logger.getLogger(ParameterAttributes_6Test.class);

    /**
    * Test of {@link ParameterAttributes#valueFor(float)} method, of class ParameterAttributes.
    */
    @Test
    void testValueFor() {
        log.info("valueFor");
        ParameterAttributes instance = new ParameterAttributes();
        instance.setElasticity(new Float(0.5));
        instance.setDemandCurveFunction(new LinearFunction());
        instance.setLn(new Boolean(false));
        float expResult = 0.5f;
        float result = instance.valueFor(1.0f);
        assertEquals(expResult, result, 0.0);
    }
}

// ParameterAttributes_7Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_7Test {
		
    private static final Logger log = Logger.getLogger(ParameterAttributes_7Test.class);

    /**
    * Test of {@link ParameterAttributes#valueFor(float)} method, of class ParameterAttributes.
    */
    @Test
    void testValueFor() {
        log.info("valueFor");
        ParameterAttributes instance = new ParameterAttributes();
        instance.setElasticity(new Float(0.5));
        instance.setDemandCurveFunction(new LinearFunction());
        instance.setLn(new Boolean(true));
        float expResult = 0.5f;
        float result = instance.valueFor(1.0f);
        assertEquals(expResult, result, 0.0);
    }
}

// ParameterAttributes_8Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_8Test {
		
    private static final Logger log = Logger.getLogger(ParameterAttributes_8Test.class);

    /**
    * Test of {@link ParameterAttributes#valueFor(float)} method, of class ParameterAttributes.
    */
    @Test
    void testValueFor() {
        log.info("valueFor");
        ParameterAttributes instance = new ParameterAttributes();
        instance.setElasticity(new Float(0.5));
        instance.setDemandCurveFunction(new LinearFunction());
        instance.setLn(new Boolean(false));
        float expResult = 0.5f;
        float result = instance.valueFor(1.0f);
        assertEquals(expResult, result, 0.0);
    }
}

// ParameterAttributes_9Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter