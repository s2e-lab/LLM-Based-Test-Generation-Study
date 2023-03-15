// HeadUpDisplayTest.java
package gui.gl;

import com.xith3d.scenegraph.Node;
import com.xith3d.scenegraph.BoundingSphere;
import com.xith3d.scenegraph.Canvas3D;
import com.xith3d.scenegraph.Shape3D;
import com.xith3d.userinterface.UIOverlay;
import com.xith3d.userinterface.UIOverlayInterface;
import com.xith3d.userinterface.UIWindow;
import com.xith3d.userinterface.UIWindowManager;
import com.xith3d.userinterface.UIPositionedWindow;
import javax.vecmath.Point3f;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeadUpDisplay}.
* It contains ten unit test cases for the {@link HeadUpDisplay#addOverlay(UIOverlayInterface)} method.
*/
class HeadUpDisplayTest {

	/**
	* Test case for {@link HeadUpDisplay#addOverlay(UIOverlayInterface)} method.
	* It tests if the method returns a {@link UIPositionedWindow} object.
	*/
	@Test
	void testAddOverlay() {
		Canvas3D c = new Canvas3D();
		HeadUpDisplay hud = new HeadUpDisplay(c);
		UIOverlayInterface o = new SwingTextOverlay(100, 100);
		UIPositionedWindow w = hud.addOverlay(o);
		assertTrue(w instanceof UIPositionedWindow);
	}
	
	/**
	* Test case for {@link HeadUpDisplay#addOverlay(UIOverlayInterface)} method.
	* It tests if the method returns a {@link UIPositionedWindow} object.
	*/
	@Test
	void testAddOverlay2() {
		Canvas3D c = new Canvas3D();
		HeadUpDisplay hud = new HeadUpDisplay(c);
		UIOverlayInterface o = new SwingTextOverlay(100, 100);
		UIPositionedWindow w = hud.addOverlay(o);
		assertTrue(w instanceof UIPositionedWindow);
	}
	
	/**
	* Test case for {@link HeadUpDisplay#addOverlay(UIOverlayInterface)} method.
	* It tests if the method returns a {@link UIPositionedWindow} object.
	*/
	@Test
	void testAddOverlay3() {
		Canvas3D c = new Canvas3D();
		HeadUpDisplay hud = new HeadUpDisplay(c);
		UIOverlayInterface o = new SwingTextOverlay(100, 100);
		UIPositionedWindow w = hud.addOverlay(o);
		assertTrue(w instanceof UIPositionedWindow);
	}
	
	/**
	* Test case for {@link HeadUpDisplay#addOverlay(UIOverlayInterface)} method.
	* It tests if the method returns a {@link UIPositionedWindow} object.
	*/
	@Test
	void testAddOverlay4() {
		Canvas3D c = new Canvas3D();
		HeadUpDisplay hud = new HeadUpDisplay(c);
		UIOverlayInterface o = new SwingTextOverlay(100, 100);
		UIPositionedWindow w = hud.addOverlay(o);
		assertTrue(w instanceof UIPositionedWindow);
	}
	
	/**
	* Test case for {@link HeadUpDisplay#addOverlay(UIOverlayInterface)} method.
	* It tests if the method returns a {@link UIPositionedWindow} object.
	*/
	@Test
	void testAddOverlay5() {
		Canvas3D c = new Canvas3D();
		HeadUpDisplay hud = new HeadUpDisplay(c);
		UIOverlayInterface o = new SwingTextOverlay(100, 100);
		UIPositionedWindow w = hud.addOverlay(o);
		assertTrue(w instanceof UIPositionedWindow);
	}
	
	/**
	* Test case for {@link HeadUpDisplay#addOverlay(UIOverlayInterface)} method.
	* It tests if the method returns a {@link UIPositionedWindow} object.
	*/
	@Test
	void testAddOverlay6() {
		Canvas3D c = new Canvas3D();
		HeadUpDisplay hud = new HeadUpDisplay(c);
		UIOverlayInterface o = new SwingTextOverlay(100, 100);
		UIPositionedWindow w = hud.addOverlay(o);
		assertTrue(w instanceof UIPositionedWindow);
	}
	
	/**
	* Test case for {@link HeadUpDisplay#addOverlay(UIOverlayInterface)} method.
	* It tests if the method returns a {@link UIPositionedWindow} object.
	*/
	@Test
	void testAddOverlay7() {
		Canvas3D c = new Canvas3D();
		HeadUpDisplay hud = new HeadUpDisplay(c);
		UIOverlayInterface o = new SwingTextOverlay(100, 100);
		UIPositionedWindow w = hud.addOverlay(o);
		assertTrue(w instanceof UIPositionedWindow);
	}
	
	/**
	* Test case for {@link HeadUpDisplay#addOverlay(UIOverlayInterface)} method.
	* It tests if the method returns a {@link UIPositionedWindow} object.
	*/
	@Test
	void testAddOverlay8() {
		Canvas3D c = new Canvas3D();
		HeadUpDisplay hud = new HeadUpDisplay(c);
		UIOverlayInterface o = new SwingTextOverlay(100, 100);
		UIPositionedWindow w = hud.addOverlay(o);
		assertTrue(w instanceof UIPositionedWindow);
	}
	
	/**
	* Test case for {@link HeadUpDisplay#addOverlay(UIOverlayInterface)} method.
	* It tests if the method returns a {@link UIPositionedWindow} object.
	*/
	@Test
	void testAddOverlay9() {
		Canvas3D c = new Canvas3D();
		HeadUpDisplay hud = new HeadUpDisplay(c);
		UIOverlayInterface o = new SwingTextOverlay(100, 100);
		UIPositionedWindow w = hud.addOverlay(o);
		assertTrue(w instanceof UIPositionedWindow);
	}
	
	/**
	* Test case for {@link HeadUpDisplay#addOverlay(UIOverlayInterface)} method.
	* It tests if the method returns a {@link UIPositionedWindow} object.
	*/
	@Test
	void testAddOverlay10() {
		Canvas3D c = new Canvas3D();
		HeadUpDisplay hud = new HeadUpDisplay(c);
		UIOverlayInterface o = new SwingTextOverlay(100, 100);
		UIPositionedWindow w = hud.addOverlay(o);
		assertTrue(w instanceof UIPositionedWindow);
	}
}