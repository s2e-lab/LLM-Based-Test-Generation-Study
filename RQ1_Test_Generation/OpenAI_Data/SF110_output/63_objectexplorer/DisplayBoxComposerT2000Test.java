// DisplayBoxComposerTest.java
package de.paragon.explorer.gui;

import org.apache.log4j.Logger;
import de.paragon.explorer.excp.FigureException;
import de.paragon.explorer.figure.CompositeFigure;
import de.paragon.explorer.figure.Figure;
import de.paragon.explorer.util.LoggerFactory;
import de.paragon.explorer.util.ResourceBundlePurchaser;
import de.paragon.explorer.util.StandardEnumeration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DisplayBoxComposer}.
* It contains ten unit test cases for the {@link DisplayBoxComposer#compose(CompositeFigure)} method.
*/
class DisplayBoxComposerTest {

	private static final Logger logger = LoggerFactory.make();
	
	private static final String ERROR_IN_THIS_OBJECT = "displayboxcomposer.error_in_this_object";
	
	/**
	 * Test case 1:
	 * 
	 * <pre>
	 * 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							