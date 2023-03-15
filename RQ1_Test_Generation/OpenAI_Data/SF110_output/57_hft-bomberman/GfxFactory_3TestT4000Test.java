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
		* It tests if the method returns the correct image for the given diameter and id.
		*/
		@Test
		void testGetExplosionImage_5() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(5, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 6 for {@link GfxFactory#getExplosionImage(int, int)}.
		* It tests if the method returns the correct image for the given diameter and id.
		*/
		@Test
		void testGetExplosionImage_6() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(6, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 7 for {@link GfxFactory#getExplosionImage(int, int)}.
		* It tests if the method returns the correct image for the given diameter and id.
		*/
		@Test
		void testGetExplosionImage_7() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(7, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 8 for {@link GfxFactory#getExplosionImage(int, int)}.
		* It tests if the method returns the correct image for the given diameter and id.
		*/
		@Test
		void testGetExplosionImage_8() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(8, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 9 for {@link GfxFactory#getExplosionImage(int, int)}.
		* It tests if the method returns the correct image for the given diameter and id.
		*/
		@Test
		void testGetExplosionImage_9() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(9, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 10 for {@link GfxFactory#getExplosionImage(int, int)}.
		* It tests if the method returns the correct image for the given diameter and id.
		*/
		@Test
		void testGetExplosionImage_10() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(10, 1);
				assertNotNull(image);
		}
}

// GfxFactory_5Test.java
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
* It contains ten unit test cases for the {@link GfxFactory#getPlayerImage(int, int)} method.
*/
class GfxFactory_5Test {
		
		private GfxFactory gfxFactory;
		
		private Logger logger = Logger.getLogger(GfxFactory_5Test.class);
		
		/**
		* Test case 1 for {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_1() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPlayerImage(1, 0);
				assertNotNull(image);
		}
		
		/**
		* Test case 2 for {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_2() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPlayerImage(1, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 3 for {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_3() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPlayerImage(1, 2);
				assertNotNull(image);
		}
		
		/**
		* Test case 4 for {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_4() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPlayerImage(1, 3);
				assertNotNull(image);
		}
		
		/**
		* Test case 5 for {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_5() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPlayerImage(1, 4);
				assertNotNull(image);
		}
		
		/**
		* Test case 6 for {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_6() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPlayerImage(1, 5);
				assertNotNull(image);
		}
		
		/**
		* Test case 7 for {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_7() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPlayerImage(1, 6);
				assertNotNull(image);
		}
		
		/**
		* Test case 8 for {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_8() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPlayerImage(1, 7);
				assertNotNull(image);
		}
		
		/**
		* Test case 9 for {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_9() {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getPlayerImage(1, 8);
				assertNotNull(image);