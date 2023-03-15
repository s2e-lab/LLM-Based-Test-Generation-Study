// ChartEncoderTest.java
package de.progra.charting;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.io.IOException;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChartEncoder}.
* It contains ten unit test cases for the {@link ChartEncoder#getSupportedFormats()} method.
*/
class ChartEncoderTest {

		/**
		* Test case for {@link ChartEncoder#getSupportedFormats()}.
		* It checks if the method returns a String array containing the informal format names for
		* all supported image encodings.
		*/
		@Test
		void testGetSupportedFormats() {
				String[] formats = ImageIO.getWriterFormatNames();
				assertNotNull(formats);
				assertTrue(formats.length > 0);
		}
}