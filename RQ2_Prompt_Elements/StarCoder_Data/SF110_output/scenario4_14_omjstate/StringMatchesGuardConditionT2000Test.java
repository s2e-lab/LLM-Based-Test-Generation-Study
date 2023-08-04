// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains ten unit test cases for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {
	/**
			* Test case for {@link StringMatchesGuardCondition#evaluate(Object)}
			* @throws Exception
			*/
			@Test
			void testEvaluate() throws Exception {
					StringMatchesGuardCondition testObj = new StringMatchesGuardCondition("test");
					assertTrue(testObj.evaluate("test"));
					assertFalse(testObj.evaluate("test2"));
					assertFalse(testObj.evaluate(null));
					assertFalse(testObj.evaluate(new Integer(1)));
					assertFalse(testObj.evaluate(new Double(1.0)));
					assertFalse(testObj.evaluate(new Boolean(true)));
					assertFalse(testObj.evaluate(new Boolean(false)));
					assertFalse(testObj.evaluate(new Character('a')));
					assertFalse(testObj.evaluate(new Character(' ')));
					assertFalse(testObj.evaluate(new Character('\n')));
					assertFalse(testObj.evaluate(new Character('\t')));
					assertFalse(testObj.evaluate(new Character('\r')));
					assertFalse(testObj.evaluate(new Character('\f')));
					assertFalse(testObj.evaluate(new Character('\b')));
					assertFalse(testObj.evaluate(new Character('\0')));
					assertFalse(testObj.evaluate(new Character('\1')));
					assertFalse(testObj.evaluate(new Character('\2')));
					assertFalse(testObj.evaluate(new Character('\3')));
					assertFalse(testObj.evaluate(new Character('\4')));
					assertFalse(testObj.evaluate(new Character('\5')));
					assertFalse(testObj.evaluate(new Character('\6')));
					assertFalse(testObj.evaluate(new Character('\7')));
					assertFalse(testObj.evaluate(new Character('\10')));
					assertFalse(testObj.evaluate(new Character('\11')));
					assertFalse(testObj.evaluate(new Character('\12')));
					assertFalse(testObj.evaluate(new Character('\13')));
					assertFalse(testObj.evaluate(new Character('\14')));
					assertFalse(testObj.evaluate(new Character('\15')));
					assertFalse(testObj.evaluate(new Character('\16')));
					assertFalse(testObj.evaluate(new Character('\17')));
					assertFalse(testObj.evaluate(new Character('\20')));
					assertFalse(testObj.evaluate(new Character('\21')));
					assertFalse(testObj.evaluate(new Character('\22')));
					assertFalse(testObj.evaluate(new Character('\23')));
					assertFalse(testObj.evaluate(new Character('\24')));
					assertFalse(testObj.evaluate(new Character('\25')));
					assertFalse(testObj.evaluate(new Character('\26')));
					assertFalse(testObj.evaluate(new Character('\27')));
					assertFalse(testObj.evaluate(new Character('\30')));
					assertFalse(testObj.evaluate(new Character('\31')));
					assertFalse(testObj.evaluate(new Character('\32')));
					assertFalse(testObj.evaluate(new Character('\33')));
					assertFalse(testObj.evaluate(new Character('\34')));
					assertFalse(testObj.evaluate(new Character('\35')));
					assertFalse(testObj.evaluate(new Character('\36')));
					assertFalse(testObj.evaluate(new Character('\37')));
					assertFalse(testObj.evaluate(new Character('\40')));
					assertFalse(testObj.evaluate(new Character('\41')));
					assertFalse(testObj.evaluate(new Character('\42')));
					assertFalse(testObj.evaluate(new Character('\43')));
					assertFalse(testObj.evaluate(new Character('\44')));
					assertFalse(testObj.evaluate(new Character('\45')));
					assertFalse(testObj.evaluate(new Character('\46')));
					assertFalse(testObj.evaluate(new Character('\47')));
					assertFalse(testObj.evaluate(new Character('\50')));
					assertFalse(testObj.evaluate(new Character('\51')));
					assertFalse(testObj.evaluate(new Character('\52')));
					assertFalse(testObj.evaluate(new Character('\53')));
					assertFalse(testObj.evaluate(new Character('\54')));
					assertFalse(testObj.evaluate(new Character('\55')));
					assertFalse(testObj.evaluate(new Character('\56')));
					assertFalse(testObj.evaluate(new Character('\57')));
					assertFalse(testObj.evaluate(new Character('\60')));
					assertFalse(testObj.evaluate(new Character('\61')));
					assertFalse(testObj.evaluate(new Character('\62')));
					assertFalse(testObj.evaluate(new Character('\63')));
					assertFalse(testObj.evaluate(new Character('\64')));
					assertFalse(testObj.evaluate(new Character('\65')));
					assertFalse(testObj.evaluate(new Character('\66')));
					assertFalse(testObj.evaluate(new Character('\67')));
					assertFalse(testObj.evaluate(new Character('\70')));
					assertFalse(testObj.evaluate(new Character('\71')));
					assertFalse(testObj.evaluate(new Character('\72')));
					assertFalse(testObj.evaluate(new Character('\73')));
					assertFalse(testObj.evaluate(new Character('\74')));
					assertFalse(testObj.evaluate(new Character('\75')));
					assertFalse(testObj.evaluate(new Character('\76')));
					assertFalse(testObj.evaluate(new Character('\77')));
					assertFalse(testObj.evaluate(new Character('\100')));
					assertFalse(testObj.evaluate(new Character('\101')));
					assertFalse(testObj.evaluate(new Character('\102')));
					assertFalse(testObj.evaluate(new Character('\103')));
					assertFalse(testObj.evaluate(new Character('\104')));
					assertFalse(testObj.evaluate(new Character('\105')));
					assertFalse(testObj.evaluate(new Character('\106')));
					assertFalse(testObj.evaluate(new Character('\107')));
					assertFalse(testObj.evaluate(new Character('\110')));
					assertFalse(testObj.evaluate(new Character('\111')));
					assertFalse(testObj.evaluate(new Character('\112')));
					assertFalse(testObj.evaluate(new Character('\113')));
					assertFalse(testObj.evaluate(new Character('\114')));
					assertFalse(testObj.evaluate(new Character('\115')));
					assertFalse(testObj.evaluate(new Character('\116')));
					assertFalse(testObj.evaluate(new Character('\117')));
					assertFalse(testObj.evaluate(new Character('\120')));
					assertFalse(testObj.evaluate(new Character('\121')));
					assertFalse(testObj.evaluate(new Character('\122')));
					assertFalse(testObj.evaluate(new Character('\123')));
					assertFalse(testObj.evaluate(new Character('\124')));
					assertFalse(testObj.evaluate(new Character('\125')));
					assertFalse(testObj.evaluate(new Character('\126')));
					assertFalse(testObj.evaluate(new Character('\127')));
					assertFalse(testObj.evaluate(new Character('\130')));
					assertFalse(testObj.evaluate(new Character('\131')));
					assertFalse(testObj.evaluate(new Character('\132')));
					assertFalse(testObj.evaluate(new Character('\133')));
					assertFalse(testObj.evaluate(new Character('\134')));
					assertFalse(testObj.evaluate(new Character('\135')));
					assertFalse(testObj.evaluate(new Character('\136')));
					assertFalse(testObj.evaluate(new Character('\137')));
					assertFalse(testObj.evaluate(new Character('\140')));
					assertFalse(testObj.evaluate(new Character('\141')));
					assertFalse(testObj.evaluate(new Character('\142')));
					assertFalse(testObj.evaluate(new Character('\143')));
					assertFalse(testObj.evaluate(new Character('\144')));
					assertFalse(testObj.evaluate(new Character('\145')));
					assertFalse(testObj.evaluate(new Character('\146')));
					assertFalse(testObj.evaluate(new Character('\147')));
					assertFalse(testObj.evaluate(new Character('\150')));
					assertFalse(testObj.evaluate(new Character('\151')));
					assertFalse(testObj.evaluate(new Character('\152')));
					assertFalse(testObj.evaluate(new Character('\153')));
					assertFalse(testObj.evaluate(new Character('\154')));
					assertFalse(testObj.evaluate(new Character('\155')));
					assertFalse(testObj.evaluate(new Character('\156')));
					assertFalse(testObj.evaluate(new Character('\157')));
					assertFalse(testObj.evaluate(new Character('\160')));
					assertFalse(testObj.evaluate(new Character('\161')));