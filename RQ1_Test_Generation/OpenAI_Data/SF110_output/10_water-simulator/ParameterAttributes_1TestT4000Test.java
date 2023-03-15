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
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the parameter is not social and the input value is a float number.
	 * The expected result is the value of the parameter.
	 */
	@Test
	void testValueFor_1() {
		log.info("Test case for valueFor(float) method. It tests the case where the parameter is not social and the input value is a float number.");
		
		// Create a new ParameterAttributes object
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		
		// Set the name of the parameter
		parameterAttributes.setName("test");
		
		// Set the elasticity of the parameter
		parameterAttributes.setElasticity(1.0f);
		
		// Set the ln of the parameter
		parameterAttributes.setLn(false);
		
		// Set the demand curve function of the parameter
		parameterAttributes.setDemandCurveFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social function of the parameter
		parameterAttributes.setSocialFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social of the parameter
		parameterAttributes.setSocial(false);
		
		// Calculate the value of the parameter
		float result = parameterAttributes.valueFor(1.0f);
		
		// Check if the result is the expected
		assertEquals(1.0f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the parameter is not social and the input value is a float number.
	 * The expected result is the value of the parameter.
	 */
	@Test
	void testValueFor_2() {
		log.info("Test case for valueFor(float) method. It tests the case where the parameter is not social and the input value is a float number.");
		
		// Create a new ParameterAttributes object
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		
		// Set the name of the parameter
		parameterAttributes.setName("test");
		
		// Set the elasticity of the parameter
		parameterAttributes.setElasticity(1.0f);
		
		// Set the ln of the parameter
		parameterAttributes.setLn(false);
		
		// Set the demand curve function of the parameter
		parameterAttributes.setDemandCurveFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social function of the parameter
		parameterAttributes.setSocialFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social of the parameter
		parameterAttributes.setSocial(false);
		
		// Calculate the value of the parameter
		float result = parameterAttributes.valueFor(2.0f);
		
		// Check if the result is the expected
		assertEquals(2.0f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the parameter is not social and the input value is a float number.
	 * The expected result is the value of the parameter.
	 */
	@Test
	void testValueFor_3() {
		log.info("Test case for valueFor(float) method. It tests the case where the parameter is not social and the input value is a float number.");
		
		// Create a new ParameterAttributes object
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		
		// Set the name of the parameter
		parameterAttributes.setName("test");
		
		// Set the elasticity of the parameter
		parameterAttributes.setElasticity(1.0f);
		
		// Set the ln of the parameter
		parameterAttributes.setLn(false);
		
		// Set the demand curve function of the parameter
		parameterAttributes.setDemandCurveFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social function of the parameter
		parameterAttributes.setSocialFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social of the parameter
		parameterAttributes.setSocial(false);
		
		// Calculate the value of the parameter
		float result = parameterAttributes.valueFor(3.0f);
		
		// Check if the result is the expected
		assertEquals(3.0f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the parameter is not social and the input value is a float number.
	 * The expected result is the value of the parameter.
	 */
	@Test
	void testValueFor_4() {
		log.info("Test case for valueFor(float) method. It tests the case where the parameter is not social and the input value is a float number.");
		
		// Create a new ParameterAttributes object
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		
		// Set the name of the parameter
		parameterAttributes.setName("test");
		
		// Set the elasticity of the parameter
		parameterAttributes.setElasticity(1.0f);
		
		// Set the ln of the parameter
		parameterAttributes.setLn(false);
		
		// Set the demand curve function of the parameter
		parameterAttributes.setDemandCurveFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social function of the parameter
		parameterAttributes.setSocialFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social of the parameter
		parameterAttributes.setSocial(false);
		
		// Calculate the value of the parameter
		float result = parameterAttributes.valueFor(4.0f);
		
		// Check if the result is the expected
		assertEquals(4.0f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the parameter is not social and the input value is a float number.
	 * The expected result is the value of the parameter.
	 */
	@Test
	void testValueFor_5() {
		log.info("Test case for valueFor(float) method. It tests the case where the parameter is not social and the input value is a float number.");
		
		// Create a new ParameterAttributes object
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		
		// Set the name of the parameter
		parameterAttributes.setName("test");
		
		// Set the elasticity of the parameter
		parameterAttributes.setElasticity(1.0f);
		
		// Set the ln of the parameter
		parameterAttributes.setLn(false);
		
		// Set the demand curve function of the parameter
		parameterAttributes.setDemandCurveFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social function of the parameter
		parameterAttributes.setSocialFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social of the parameter
		parameterAttributes.setSocial(false);
		
		// Calculate the value of the parameter
		float result = parameterAttributes.valueFor(5.0f);
		
		// Check if the result is the expected
		assertEquals(5.0f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the parameter is not social and the input value is a float number.
	 * The expected result is the value of the parameter.
	 */
	@Test
	void testValueFor_6() {
		log.info("Test case for valueFor(float) method. It tests the case where the parameter is not social and the input value is a float number.");
		
		// Create a new ParameterAttributes object
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		
		// Set the name of the parameter
		parameterAttributes.setName("test");
		
		// Set the elasticity of the parameter
		parameterAttributes.setElasticity(1.0f);
		
		// Set the ln of the parameter
		parameterAttributes.setLn(false);
		
		// Set the demand curve function of the parameter
		parameterAttributes.setDemandCurveFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social function of the parameter
		parameterAttributes.setSocialFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social of the parameter
		parameterAttributes.setSocial(false);
		
		// Calculate the value of the parameter
		float result = parameterAttributes.valueFor(6.0f);
		
		// Check if the result is the expected
		assertEquals(6.0f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the parameter is not social and the input value is a float number.
	 * The expected result is the value of the parameter.
	 */
	@Test
	void testValueFor_7() {
		log.info("Test case for valueFor(float) method. It tests the case where the parameter is not social and the input value is a float number.");
		
		// Create a new ParameterAttributes object
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		
		// Set the name of the parameter
		parameterAttributes.setName("test");
		
		// Set the elasticity of the parameter
		parameterAttributes.setElasticity(1.0f);
		
		// Set the ln of the parameter
		parameterAttributes.setLn(false);
		
		// Set the demand curve function of the parameter
		parameterAttributes.setDemandCurveFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social function of the parameter
		parameterAttributes.setSocialFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social of the parameter
		parameterAttributes.setSocial(false);
		
		// Calculate the value of the parameter
		float result = parameterAttributes.valueFor(7.0f);
		
		// Check if the result is the expected
		assertEquals(7.0f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the parameter is not social and the input value is a float number.
	 * The expected result is the value of the parameter.
	 */
	@Test
	void testValueFor_8() {
		log.info("Test case for valueFor(float) method. It tests the case where the parameter is not social and the input value is a float number.");
		
		// Create a new ParameterAttributes object
		ParameterAttributes parameterAttributes = new ParameterAttributes();
		
		// Set the name of the parameter
		parameterAttributes.setName("test");
		
		// Set the elasticity of the parameter
		parameterAttributes.setElasticity(1.0f);
		
		// Set the ln of the parameter
		parameterAttributes.setLn(false);
		
		// Set the demand curve function of the parameter
		parameterAttributes.setDemandCurveFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
			}
			public String getFunctionName() {
				return "test";
			}
		});
		
		// Set the social function of the parameter
		parameterAttributes.setSocialFunction(new Function() {
			private static final long serialVersionUID = 1L;
			public float valueFor(float x) {
				return x;
