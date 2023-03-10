// MsgContentModelTest1.java
package org.fixsuite.message.parsers.fpl;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MsgContentModel}.
* It contains ten unit test cases for the {@link MsgContentModel#compareTo(MsgContentModel)} method.
*/
class MsgContentModelTest1 {

		@Test
		void testCompareTo1() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(1.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(1);
				model2.setPosition(1.0);
				
				assertEquals(0, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo2() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(1.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(1);
				model2.setPosition(2.0);
				
				assertEquals(-1, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo3() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(2.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(1);
				model2.setPosition(1.0);
				
				assertEquals(1, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo4() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(1.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(2);
				model2.setPosition(1.0);
				
				assertEquals(-1, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo5() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(2);
				model1.setPosition(1.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(1);
				model2.setPosition(1.0);
				
				assertEquals(1, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo6() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(1.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(1);
				model2.setPosition(1.0);
				
				assertEquals(0, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo7() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(1.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(1);
				model2.setPosition(2.0);
				
				assertEquals(-1, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo8() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(2.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(1);
				model2.setPosition(1.0);
				
				assertEquals(1, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo9() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(1.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(2);
				model2.setPosition(1.0);
				
				assertEquals(-1, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo10() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(2);
				model1.setPosition(1.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(1);
				model2.setPosition(1.0);
				
				assertEquals(1, model1.compareTo(model2));
		}
}

// MsgContentModelTest2.java
package org.fixsuite.message.parsers.fpl;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MsgContentModel}.
* It contains ten unit test cases for the {@link MsgContentModel#compareTo(MsgContentModel)} method.
*/
class MsgContentModelTest2 {
		
		@Test
		void testCompareTo1() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(1.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(1);
				model2.setPosition(1.0);
				
				assertEquals(0, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo2() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(1.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(1);
				model2.setPosition(2.0);
				
				assertEquals(-1, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo3() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(2.0);
				
				MsgContentModel model2 = new MsgContentModel();
				model2.setId(1);
				model2.setPosition(1.0);
				
				assertEquals(1, model1.compareTo(model2));
		}
		
		@Test
		void testCompareTo4() {
				MsgContentModel model1 = new MsgContentModel();
				model1.setId(1);
				model1.setPosition(1.0);
				
				Msg