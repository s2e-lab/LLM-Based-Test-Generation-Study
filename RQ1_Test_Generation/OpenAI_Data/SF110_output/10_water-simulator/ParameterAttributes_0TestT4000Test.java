// ParameterAttributes_0Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(int)} method.
*/
class ParameterAttributes_0Test {

	private static final Logger log = Logger.getLogger(ParameterAttributes_0Test.class);
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_0() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(1);
		
		assertEquals(0.0f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_1() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(2);
		
		assertEquals(0.69314718f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_2() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(3);
		
		assertEquals(1.09861229f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_3() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(4);
		
		assertEquals(1.38629436f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_4() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(5);
		
		assertEquals(1.60943791f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_5() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(6);
		
		assertEquals(1.79175947f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_6() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(7);
		
		assertEquals(1.94591015f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_7() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(8);
		
		assertEquals(2.07944154f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_8() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(9);
		
		assertEquals(2.19722458f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_9() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(10);
		
		assertEquals(2.30258509f, result);
	}
}

// ParameterAttributes_1Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(int)} method.
*/
class ParameterAttributes_1Test {
		
	private static final Logger log = Logger.getLogger(ParameterAttributes_1Test.class);
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_0() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(1);
		
		assertEquals(0.0f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_1() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(2);
		
		assertEquals(0.69314718f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_2() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(3);
		
		assertEquals(1.09861229f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_3() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(4);
		
		assertEquals(1.38629436f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * <p>
	 * Test if the value of the parameter is the logarithm of parameter's function
	 * </p>
	 */
	@Test
	void testValueFor_4() {
		log.info("Test if the value of the parameter is the logarithm of parameter's function");
		
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		parameterAttributes.setLn(true);
		parameterAttributes.setElasticity(1.0f);
		parameterAttributes.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "x";
			}
		});
		
		float result = parameterAttributes.valueFor(5);
		
		assertEquals(1.60943791f, result);
	}
	
	/**
	 * Test case for {