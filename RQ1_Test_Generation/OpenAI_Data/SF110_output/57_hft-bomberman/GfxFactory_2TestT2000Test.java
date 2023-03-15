// GfxFactory_2Test.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GfxFactory}.
* It contains ten unit test cases for the {@link GfxFactory#getBombImage(int)} method.
*/
class GfxFactory_2Test {

		private GfxFactory gfxFactory;
		
		/**
		* Test case 1 for {@link GfxFactory#getBombImage(int)} method.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_1() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1);
				assertEquals(image, gfxFactory.getBombImage(1));
		}
		
		/**
		* Test case 2 for {@link GfxFactory#getBombImage(int)} method.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_2() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(2);
				assertEquals(image, gfxFactory.getBombImage(2));
		}
		
		/**
		* Test case 3 for {@link GfxFactory#getBombImage(int)} method.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_3() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(3);
				assertEquals(image, gfxFactory.getBombImage(3));
		}
		
		/**
		* Test case 4 for {@link GfxFactory#getBombImage(int)} method.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_4() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(4);
				assertEquals(image, gfxFactory.getBombImage(4));
		}
		
		/**
		* Test case 5 for {@link GfxFactory#getBombImage(int)} method.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_5() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(5);
				assertEquals(image, gfxFactory.getBombImage(5));
		}
		
		/**
		* Test case 6 for {@link GfxFactory#getBombImage(int)} method.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_6() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(6);
				assertEquals(image, gfxFactory.getBombImage(6));
		}
		
		/**
		* Test case 7 for {@link GfxFactory#getBombImage(int)} method.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_7() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(7);
				assertEquals(image, gfxFactory.getBombImage(7));
		}
		
		/**
		* Test case 8 for {@link GfxFactory#getBombImage(int)} method.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_8() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(8);
				assertEquals(image, gfxFactory.getBombImage(8));
		}
		
		/**
		* Test case 9 for {@link GfxFactory#getBombImage(int)} method.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_9() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(9);
				assertEquals(image, gfxFactory.getBombImage(9));
		}
		
		/**
		* Test case 10 for {@link GfxFactory#getBombImage(int)} method.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_10() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(10);
				assertEquals(image, gfxFactory.getBombImage(10));
		}
}

// GfxFactory_3Test.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GfxFactory}.
* It contains ten unit test cases for the {@link GfxFactory#getBombImage(int, int)} method.
*/
class GfxFactory_3Test {
		
		private GfxFactory gfxFactory;
		
		/**
		* Test case 1 for {@link GfxFactory#getBombImage(int, int)} method.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_1() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 1);
				assertEquals(image, gfxFactory.getBombImage(1, 1));
		}
		
		/**
		* Test case 2 for {@link GfxFactory#getBombImage(int, int)} method.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_2() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(2, 2);
				assertEquals(image, gfxFactory.getBombImage(2, 2));
		}
		
		/**
		* Test case 3 for {@link GfxFactory#getBombImage(int, int)} method.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_3() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(3, 3);
				assertEquals(image, gfxFactory.getBombImage(3, 3));
		}
		
		/**
		* Test case 4 for {@link GfxFactory#getBombImage(int, int)} method.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_4() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(4, 4);
				assertEquals(image, gfxFactory.getBombImage(4, 4));
		}
		
		/**