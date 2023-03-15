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
		
		private Logger logger = Logger.getLogger(GfxFactory_3Test.class);
		
		/**
		* Test case 1 for {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_1() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 0);
				assertNotNull(image);
		}
		
		/**
		* Test case 2 for {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_2() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 3 for {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_3() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 2);
				assertNotNull(image);
		}
		
		/**
		* Test case 4 for {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_4() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 3);
				assertNotNull(image);
		}
		
		/**
		* Test case 5 for {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_5() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 4);
				assertNotNull(image);
		}
		
		/**
		* Test case 6 for {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_6() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 5);
				assertNotNull(image);
		}
		
		/**
		* Test case 7 for {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_7() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 6);
				assertNotNull(image);
		}
		
		/**
		* Test case 8 for {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_8() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 7);
				assertNotNull(image);
		}
		
		/**
		* Test case 9 for {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_9() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 8);
				assertNotNull(image);
		}
		
		/**
		* Test case 10 for {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_10() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 9);
				assertNotNull(image);
		}
}

// GfxFactory_4Test.java
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
* It contains ten unit test cases for the {@link GfxFactory#getExplosionImage(int, int)} method.
*/
class GfxFactory_4Test {
		
		private GfxFactory gfxFactory;
		
		private Logger logger = Logger.getLogger(GfxFactory_4Test.class);
		
		/**
		* Test case 1 for {@link GfxFactory#getExplosionImage(int, int)}.
		* It tests if the method returns the correct image for the given diameter and id.
		*/
		@Test
		void testGetExplosionImage_1() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(1, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 2 for {@link GfxFactory#getExplosionImage(int, int)}.
		* It tests if the method returns the correct image for the given diameter and id.
		*/
		@Test
		void testGetExplosionImage_2() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(2, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 3 for {@link GfxFactory#getExplosionImage(int, int)}.
		* It tests if the method returns the correct image for the given diameter and id.
		*/
		@Test
		void testGetExplosionImage_3() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(3, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 4 for {@link GfxFactory#getExplosionImage(int, int)}.
		* It tests if the method returns the correct image for the given diameter and id.
		*/
		@Test
		void testGetExplosionImage_4() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(4, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 5 for {@link GfxFactory#getExplosionImage(int, int)}.
		* It tests if the method returns