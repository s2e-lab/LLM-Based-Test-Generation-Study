// GameView_0Test.java
package client.view;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.util.Vector;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameView}.
* It contains ten unit test cases for the {@link GameView#addGameObjectView(GameObjectView)} method.
*/
class GameView_0Test {

		private static final Logger logger = Logger.getLogger(GameView_0Test.class);
		
		private static final AffineTransform NEUTRAL_TF = AffineTransform.getTranslateInstance(0., 0.);
		
		/**
		 * Test case for {@link GameView#addGameObjectView(GameObjectView)}
		 * 
		 * @see GameView#addGameObjectView(GameObjectView)
		 */
		@Test
		void testAddGameObjectView_0() {
				GameCanvas gameCanvas = new GameCanvas();
				GameView gameView = new GameView(gameCanvas);
				GameObjectView gameObjectView = new GameObjectView();
				boolean result = gameView.addGameObjectView(gameObjectView);
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link GameView#addGameObjectView(GameObjectView)}
		 * 
		 * @see GameView#addGameObjectView(GameObjectView)
		 */
		@Test
		void testAddGameObjectView_1() {
				GameCanvas gameCanvas = new GameCanvas();
				GameView gameView = new GameView(gameCanvas);
				GameObjectView gameObjectView = new GameObjectView();
				boolean result = gameView.addGameObjectView(gameObjectView);
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link GameView#addGameObjectView(GameObjectView)}
		 * 
		 * @see GameView#addGameObjectView(GameObjectView)
		 */
		@Test
		void testAddGameObjectView_2() {
				GameCanvas gameCanvas = new GameCanvas();
				GameView gameView = new GameView(gameCanvas);
				GameObjectView gameObjectView = new GameObjectView();
				boolean result = gameView.addGameObjectView(gameObjectView);
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link GameView#addGameObjectView(GameObjectView)}
		 * 
		 * @see GameView#addGameObjectView(GameObjectView)
		 */
		@Test
		void testAddGameObjectView_3() {
				GameCanvas gameCanvas = new GameCanvas();
				GameView gameView = new GameView(gameCanvas);
				GameObjectView gameObjectView = new GameObjectView();
				boolean result = gameView.addGameObjectView(gameObjectView);
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link GameView#addGameObjectView(GameObjectView)}
		 * 
		 * @see GameView#addGameObjectView(GameObjectView)
		 */
		@Test
		void testAddGameObjectView_4() {
				GameCanvas gameCanvas = new GameCanvas();
				GameView gameView = new GameView(gameCanvas);
				GameObjectView gameObjectView = new GameObjectView();
				boolean result = gameView.addGameObjectView(gameObjectView);
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link GameView#addGameObjectView(GameObjectView)}
		 * 
		 * @see GameView#addGameObjectView(GameObjectView)
		 */
		@Test
		void testAddGameObjectView_5() {
				GameCanvas gameCanvas = new GameCanvas();
				GameView gameView = new GameView(gameCanvas);
				GameObjectView gameObjectView = new GameObjectView();
				boolean result = gameView.addGameObjectView(gameObjectView);
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link GameView#addGameObjectView(GameObjectView)}
		 * 
		 * @see GameView#addGameObjectView(GameObjectView)
		 */
		@Test
		void testAddGameObjectView_6() {
				GameCanvas gameCanvas = new GameCanvas();
				GameView gameView = new GameView(gameCanvas);
				GameObjectView gameObjectView = new GameObjectView();
				boolean result = gameView.addGameObjectView(gameObjectView);
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link GameView#addGameObjectView(GameObjectView)}
		 * 
		 * @see GameView#addGameObjectView(GameObjectView)
		 */
		@Test
		void testAddGameObjectView_7() {
				GameCanvas gameCanvas = new GameCanvas();
				GameView gameView = new GameView(gameCanvas);
				GameObjectView gameObjectView = new GameObjectView();
				boolean result = gameView.addGameObjectView(gameObjectView);
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link GameView#addGameObjectView(GameObjectView)}
		 * 
		 * @see GameView#addGameObjectView(GameObjectView)
		 */
		@Test
		void testAddGameObjectView_8() {
				GameCanvas gameCanvas = new GameCanvas();
				GameView gameView = new GameView(gameCanvas);
				GameObjectView gameObjectView = new GameObjectView();
				boolean result = gameView.addGameObjectView(gameObjectView);
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link GameView#addGameObjectView(GameObjectView)}
		 * 
		 * @see GameView#addGameObjectView(GameObjectView)
		 */
		@Test
		void testAddGameObjectView_9() {
				GameCanvas gameCanvas = new GameCanvas();
				GameView gameView = new GameView(gameCanvas);
				GameObjectView gameObjectView = new GameObjectView();
				boolean result = gameView.addGameObjectView(gameObjectView);
				assertTrue(result);
		}
		
}

// GameView_1Test.java
package client.view;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.util.Vector;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameView}.
* It contains ten unit test cases for the {@link GameView#paint()} method.
*/
class GameView_1Test {
		
		private static final Logger logger = Logger.getLogger(GameView_1Test.class);
		
		private static final AffineTransform NEUTRAL_TF = AffineTransform.getTranslateInstance(0., 0.);
		
		/**
		 * Test case for {@link GameView#paint()}
		 * 
		 * @see GameView#paint()
		 */
		@Test
		void testPaint_0() {
				GameCanvas gameCanvas = new GameCanvas();
				GameView gameView = new GameView(gameCanvas);
				gameView.paint();
		}
		
		/**
		 * Test case for {@