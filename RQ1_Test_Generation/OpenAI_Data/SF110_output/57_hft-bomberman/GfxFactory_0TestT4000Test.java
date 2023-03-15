// GfxFactory_0Test.java
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
class GfxFactory_0Test {

		private GfxFactory gfxFactory;
		
		private Image image;
		
		private int id;
		
		private int state;
		
		private Logger logger = Logger.getLogger(GfxFactory_0Test.class);
		
		/**
		* Test case 1 for method {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_1() {
				gfxFactory = new GfxFactory();
				id = 1;
				state = 0;
				image = gfxFactory.getPlayerImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/1/0.png"));
		}
		
		/**
		* Test case 2 for method {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_2() {
				gfxFactory = new GfxFactory();
				id = 2;
				state = 1;
				image = gfxFactory.getPlayerImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/2/1.png"));
		}
		
		/**
		* Test case 3 for method {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_3() {
				gfxFactory = new GfxFactory();
				id = 3;
				state = 2;
				image = gfxFactory.getPlayerImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/3/2.png"));
		}
		
		/**
		* Test case 4 for method {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_4() {
				gfxFactory = new GfxFactory();
				id = 4;
				state = 3;
				image = gfxFactory.getPlayerImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/4/3.png"));
		}
		
		/**
		* Test case 5 for method {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_5() {
				gfxFactory = new GfxFactory();
				id = 5;
				state = 4;
				image = gfxFactory.getPlayerImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/5/4.png"));
		}
		
		/**
		* Test case 6 for method {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_6() {
				gfxFactory = new GfxFactory();
				id = 6;
				state = 5;
				image = gfxFactory.getPlayerImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/6/5.png"));
		}
		
		/**
		* Test case 7 for method {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_7() {
				gfxFactory = new GfxFactory();
				id = 7;
				state = 6;
				image = gfxFactory.getPlayerImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/7/6.png"));
		}
		
		/**
		* Test case 8 for method {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_8() {
				gfxFactory = new GfxFactory();
				id = 8;
				state = 7;
				image = gfxFactory.getPlayerImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/8/7.png"));
		}
		
		/**
		* Test case 9 for method {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_9() {
				gfxFactory = new GfxFactory();
				id = 9;
				state = 8;
				image = gfxFactory.getPlayerImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/9/8.png"));
		}
		
		/**
		* Test case 10 for method {@link GfxFactory#getPlayerImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetPlayerImage_10() {
				gfxFactory = new GfxFactory();
				id = 10;
				state = 9;
				image = gfxFactory.getPlayerImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/10/9.png"));
		}
}

// GfxFactory_1Test.java
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
class GfxFactory_1Test {
		
		private GfxFactory gfxFactory;
		
		private Image image;
		
		private int id;
		
		private Logger logger = Logger.getLogger(GfxFactory_1Test.class);
		
		/**
		* Test case 1 for method {@link GfxFactory#getBombImage(int)}.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_1() {
				gfxFactory = new GfxFactory();
				id = 1;
				image = gfxFactory.getBombImage(id);
				assertEquals(image, ResourceService.getImage("/gfx/player/1/bomb.png"));
		}
		
		/**
		* Test case 2 for method {@link GfxFactory#getBombImage(int)}.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_2() {
				gfxFactory = new GfxFactory();
				id = 2;
				image = gfxFactory.getBombImage(id);
				assertEquals(image, ResourceService.getImage("/gfx/player/2/bomb.png"));
		}
		
		/**
		* Test case 3 for method {@link GfxFactory#getBombImage(int)}.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_3() {
				gfxFactory = new GfxFactory();
				id = 3;
				image = gfxFactory.getBombImage(id);
				assertEquals(image, ResourceService.getImage("/gfx/player/3/bomb.png"));
		}
		
		/**
		* Test case 4 for method {@link GfxFactory#getBombImage(int)}.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_4() {
				gfxFactory = new GfxFactory();
				id = 4;
				image = gfxFactory.getBombImage(id);
				assertEquals(image, ResourceService.getImage("/gfx/player/4/bomb.png"));
		}
		
		/**
		* Test case 5 for method {@link GfxFactory#getBombImage(int)}.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_5() {
				gfxFactory = new GfxFactory();
				id = 5;
				image = gfxFactory.getBombImage(id);
				assertEquals(image, ResourceService.getImage("/gfx/player/5/bomb.png"));
		}
		
		/**
		* Test case 6 for method {@link GfxFactory#getBombImage(int)}.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_6() {
				gfxFactory = new GfxFactory();
				id = 6;
				image = gfxFactory.getBombImage(id);
				assertEquals(image, ResourceService.getImage("/gfx/player/6/bomb.png"));
		}
		
		/**
		* Test case 7 for method {@link GfxFactory#getBombImage(int)}.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_7() {
				gfxFactory = new GfxFactory();
				id = 7;
				image = gfxFactory.getBombImage(id);
				assertEquals(image, ResourceService.getImage("/gfx/player/7/bomb.png"));
		}
		
		/**
		* Test case 8 for method {@link GfxFactory#getBombImage(int)}.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_8() {
				gfxFactory = new GfxFactory();
				id = 8;
				image = gfxFactory.getBombImage(id);
				assertEquals(image, ResourceService.getImage("/gfx/player/8/bomb.png"));
		}
		
		/**
		* Test case 9 for method {@link GfxFactory#getBombImage(int)}.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_9() {
				gfxFactory = new GfxFactory();
				id = 9;
				image = gfxFactory.getBombImage(id);
				assertEquals(image, ResourceService.getImage("/gfx/player/9/bomb.png"));
		}
		
		/**
		* Test case 10 for method {@link GfxFactory#getBombImage(int)}.
		* It tests if the method returns the correct image for the given id.
		*/
		@Test
		void testGetBombImage_10() {
				gfxFactory = new GfxFactory();
				id = 10;
				image = gfxFactory.getBombImage(id);
				assertEquals(image, ResourceService.getImage("/gfx/player/10/bomb.png"));
		}
}

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
* It contains ten unit test cases for the {@link GfxFactory#getBombImage(int, int)} method.
*/
class GfxFactory_2Test {
		
		private GfxFactory gfxFactory;
		
		private Image image;
		
		private int id;
		
		private int state;
		
		private Logger logger = Logger.getLogger(GfxFactory_2Test.class);
		
		/**
		* Test case 1 for method {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_1() {
				gfxFactory = new GfxFactory();
				id = 1;
				state = 0;
				image = gfxFactory.getBombImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/1/bomb0.png"));
		}
		
		/**
		* Test case 2 for method {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_2() {
				gfxFactory = new GfxFactory();
				id = 2;
				state = 1;
				image = gfxFactory.getBombImage(id, state);
				assertEquals(image, ResourceService.getImage("/gfx/player/2/bomb1.png"));
		}
		
		/**
		* Test case 3 for method {@link GfxFactory#getBombImage(int, int)}.
		* It tests if the method returns the correct image for the given id and state.
		*/
		@Test
		void testGetBombImage_3() {
				gfxFactory = new GfxFactory();
				id = 3;
				state = 2;
				image = gfxFactory.getBombImage(id, state);
				assert