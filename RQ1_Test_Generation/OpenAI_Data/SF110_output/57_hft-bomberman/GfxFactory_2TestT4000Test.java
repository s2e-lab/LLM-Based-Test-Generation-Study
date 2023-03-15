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
		
		private Logger logger = Logger.getLogger(GfxFactory_2Test.class);
		
		/**
		* Test case 1 for {@link GfxFactory#getBombImage(int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_1() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1);
				assertNotNull(image);
		}
		
		/**
		* Test case 2 for {@link GfxFactory#getBombImage(int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_2() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(2);
				assertNotNull(image);
		}
		
		/**
		* Test case 3 for {@link GfxFactory#getBombImage(int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_3() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(3);
				assertNotNull(image);
		}
		
		/**
		* Test case 4 for {@link GfxFactory#getBombImage(int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_4() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(4);
				assertNotNull(image);
		}
		
		/**
		* Test case 5 for {@link GfxFactory#getBombImage(int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_5() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(5);
				assertNotNull(image);
		}
		
		/**
		* Test case 6 for {@link GfxFactory#getBombImage(int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_6() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(6);
				assertNotNull(image);
		}
		
		/**
		* Test case 7 for {@link GfxFactory#getBombImage(int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_7() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(7);
				assertNotNull(image);
		}
		
		/**
		* Test case 8 for {@link GfxFactory#getBombImage(int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_8() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(8);
				assertNotNull(image);
		}
		
		/**
		* Test case 9 for {@link GfxFactory#getBombImage(int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_9() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(9);
				assertNotNull(image);
		}
		
		/**
		* Test case 10 for {@link GfxFactory#getBombImage(int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_10() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(10);
				assertNotNull(image);
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
		
		private Logger logger = Logger.getLogger(GfxFactory_3Test.class);
		
		/**
		* Test case 1 for {@link GfxFactory#getBombImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_1() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(1, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 2 for {@link GfxFactory#getBombImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_2() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(2, 2);
				assertNotNull(image);
		}
		
		/**
		* Test case 3 for {@link GfxFactory#getBombImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_3() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(3, 3);
				assertNotNull(image);
		}
		
		/**
		* Test case 4 for {@link GfxFactory#getBombImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_4() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(4, 4);
				assertNotNull(image);
		}
		
		/**
		* Test case 5 for {@link GfxFactory#getBombImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_5() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(5, 5);
				assertNotNull(image);
		}
		
		/**
		* Test case 6 for {@link GfxFactory#getBombImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_6() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(6, 6);
				assertNotNull(image);
		}
		
		/**
		* Test case 7 for {@link GfxFactory#getBombImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_7() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(7, 7);
				assertNotNull(image);
		}
		
		/**
		* Test case 8 for {@link GfxFactory#getBombImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_8() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(8, 8);
				assertNotNull(image);
		}
		
		/**
		* Test case 9 for {@link GfxFactory#getBombImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_9() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(9, 9);
				assertNotNull(image);
		}
		
		/**
		* Test case 10 for {@link GfxFactory#getBombImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetBombImage_10() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getBombImage(10, 10);
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
		* Test case 1 for {@link GfxFactory#getExplosionImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetExplosionImage_1() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(1, 1);
				assertNotNull(image);
		}
		
		/**
		* Test case 2 for {@link GfxFactory#getExplosionImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetExplosionImage_2() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(2, 2);
				assertNotNull(image);
		}
		
		/**
		* Test case 3 for {@link GfxFactory#getExplosionImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetExplosionImage_3() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(3, 3);
				assertNotNull(image);
		}
		
		/**
		* Test case 4 for {@link GfxFactory#getExplosionImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetExplosionImage_4() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(4, 4);
				assertNotNull(image);
		}
		
		/**
		* Test case 5 for {@link GfxFactory#getExplosionImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetExplosionImage_5() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(5, 5);
				assertNotNull(image);
		}
		
		/**
		* Test case 6 for {@link GfxFactory#getExplosionImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetExplosionImage_6() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(6, 6);
				assertNotNull(image);
		}
		
		/**
		* Test case 7 for {@link GfxFactory#getExplosionImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetExplosionImage_7() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(7, 7);
				assertNotNull(image);
		}
		
		/**
		* Test case 8 for {@link GfxFactory#getExplosionImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetExplosionImage_8() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(8, 8);
				assertNotNull(image);
		}
		
		/**
		* Test case 9 for {@link GfxFactory#getExplosionImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetExplosionImage_9() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(9, 9);
				assertNotNull(image);
		}
		
		/**
		* Test case 10 for {@link GfxFactory#getExplosionImage(int, int)}
		*
		* @throws IOException
		*/
		@Test
		void testGetExplosionImage_10() throws IOException {
				gfxFactory = new GfxFactory();
				Image image = gfxFactory.getExplosionImage(10, 10);
				assertNotNull(image);
		}
}

// GfxFactory_5Test.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.Image