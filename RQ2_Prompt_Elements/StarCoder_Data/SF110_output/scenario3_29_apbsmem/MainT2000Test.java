// MainTest.java
package apbs_mem_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import com.jgoodies.forms.layout.*;
import com.jgoodies.forms.builder.*;
import org.jmol.api.JmolViewer;
import org.jmol.api.JmolAdapter;
import org.jmol.popup.JmolPopup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#SaveData()} method.
*/
class MainTest {

    /**
     * Test case for {@link Main#SaveData()} method.
     *
     * @throws IOException
     */
    @Test
    void testSaveData() throws IOException {
        Main main = new Main();
        main.inFile = new InFile();
        main.inFile.setInFileName("test.in");
        main.inFile.setInFileTitle("test");
        main.inFile.setInFileFormat("test");
        main.inFile.setInFileDate("test");
        main.inFile.setInFileAuthor("test");
        main.inFile.setInFileEmail("test");
        main.inFile.setInFileDescription("test");
        main.inFile.setInFileKeywords("test");
        main.inFile.setInFileCharge("test");
        main.inFile.setInFileSolute("test");
        main.inFile.setInFileSolvent("test");
        main.inFile.setInFileSurface("test");
        main.inFile.setInFileMembrane("test");
        main.inFile.setInFileChargeMethod("test");
        main.inFile.setInFileSoluteMethod("test");
        main.inFile.setInFileSolventMethod("test");
        main.inFile.setInFileSurfaceMethod("test");
        main.inFile.setInFileMembraneMethod("test");
        main.inFile.setInFileChargeCalc("test");
        main.inFile.setInFileSoluteCalc("test");
        main.inFile.setInFileSolventCalc("test");
        main.inFile.setInFileSurfaceCalc("test");
        main.inFile.setInFileMembraneCalc("test");
        main.inFile.setInFileChargeCalcMethod("test");
        main.inFile.setInFileSoluteCalcMethod("test");
        main.inFile.setInFileSolventCalcMethod("test");
        main.inFile.setInFileSurfaceCalcMethod("test");
        main.inFile.setInFileMembraneCalcMethod("test");
        main.inFile.setInFileChargeCalcDetails("test");
        main.inFile.setInFileSoluteCalcDetails("test");
        main.inFile.setInFileSolventCalcDetails("test");
        main.inFile.setInFileSurfaceCalcDetails("test");
        main.inFile.setInFileMembraneCalcDetails("test");
        main.inFile.setInFileChargeCalcRef("test");
        main.inFile.setInFileSoluteCalcRef("test");
        main.inFile.setInFileSolventCalcRef("test");
        main.inFile.setInFileSurfaceCalcRef("test");
        main.inFile.setInFileMembraneCalcRef("test");
        main.inFile.setInFileChargeCalcRefDetails("test");
        main.inFile.setInFileSoluteCalcRefDetails("test");
        main.inFile.setInFileSolventCalcRefDetails("test");
        main.inFile.setInFileSurfaceCalcRefDetails("test");
        main.inFile.setInFileMembraneCalcRefDetails("test");
        main.inFile.setInFileChargeCalcRefLink("test");
        main.inFile.setInFileSoluteCalcRefLink("test");
        main.inFile.setInFileSolventCalcRefLink("test");
        main.inFile.setInFileSurfaceCalcRefLink("test");
        main.inFile.setInFileMembraneCalcRefLink("test");
        main.inFile.setInFileChargeCalcRefLinkDetails("test");
        main.inFile.setInFileSoluteCalcRefLinkDetails("test");
        main.inFile.setInFileSolventCalcRefLinkDetails("test");
        main.inFile.setInFileSurfaceCalcRefLinkDetails("test");
        main.inFile.setInFileMembraneCalcRefLinkDetails("test");
        main.inFile.setInFileChargeCalcRefLinkLink("test");
        main.inFile.setInFileSoluteCalcRefLinkLink("test");
        main.inFile.setInFileSolventCalcRefLinkLink("test");
        main.inFile.setInFileSurfaceCalcRefLinkLink("test");
        main.inFile.setInFileMembraneCalcRefLinkLink("test");
        main.inFile.setInFileChargeCalcRefLinkLinkDetails("test");
        main.inFile.setInFileSoluteCalcRefLinkLinkDetails("test");
        main.inFile.setInFileSolventCalcRefLinkLinkDetails("test");
        main.inFile.setInFileSurfaceCalcRefLinkLinkDetails("test");
        main.inFile.setInFileMembraneCalcRefLinkLinkDetails("test");
        main.inFile.setInFileChargeCalcRefLinkLinkLink("test");
        main.inFile.setInFileSoluteCalcRefLinkLinkLink("test");
        main.inFile.setInFileSolventCalcRefLinkLinkLink("test");
        main.inFile.setInFileSurfaceCalcRefLinkLinkLink("test");
        main.inFile.setInFileMembraneCalcRefLinkLinkLink("test");
        main.inFile.setInFileChargeCalcRefLinkLinkLinkDetails("test");
        main.inFile.setInFileSoluteCalcRefLinkLinkLinkDetails("test");
        main.inFile.setInFileSolventCalcRefLinkLinkLinkDetails("test");
        main.inFile.setInFileSurfaceCalcRefLinkLinkLinkDetails("test");
        main.inFile.setInFileMembraneCalcRefLinkLinkLinkDetails("test");
        main.inFile.setInFileChargeCalcRefLinkLinkLinkLink("test");
        main.inFile.setInFileSoluteCalcRefLinkLinkLinkLink("test");
        main.inFile.setInFileSolventCalcRefLinkLinkLinkLink("test");
        main.inFile.setInFileSurfaceCalcRefLinkLinkLinkLink("test");
        main.inFile.setInFileMembraneCalcRefLinkLinkLinkLink("test");
        main.inFile.setInFileChargeCalcRefLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileSoluteCalcRefLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileSolventCalcRefLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileSurfaceCalcRefLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileMembraneCalcRefLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileChargeCalcRefLinkLinkLinkLinkLink("test");
        main.inFile.setInFileSoluteCalcRefLinkLinkLinkLinkLink("test");
        main.inFile.setInFileSolventCalcRefLinkLinkLinkLinkLink("test");
        main.inFile.setInFileSurfaceCalcRefLinkLinkLinkLinkLink("test");
        main.inFile.setInFileMembraneCalcRefLinkLinkLinkLinkLink("test");
        main.inFile.setInFileChargeCalcRefLinkLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileSoluteCalcRefLinkLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileSolventCalcRefLinkLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileSurfaceCalcRefLinkLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileMembraneCalcRefLinkLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileChargeCalcRefLinkLinkLinkLinkLinkLink("test");
        main.inFile.setInFileSoluteCalcRefLinkLinkLinkLinkLinkLink("test");
        main.inFile.setInFileSolventCalcRefLinkLinkLinkLinkLinkLink("test");
        main.inFile.setInFileSurfaceCalcRefLinkLinkLinkLinkLinkLink("test");
        main.inFile.setInFileMembraneCalcRefLinkLinkLinkLinkLinkLink("test");
        main.inFile.setInFileChargeCalcRefLinkLinkLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileSoluteCalcRefLinkLinkLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileSolventCalcRefLinkLinkLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileSurfaceCalcRefLinkLinkLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileMembraneCalcRefLinkLinkLinkLinkLinkLinkDetails("test");
        main.inFile.setInFileChargeCalcRefLinkLinkLinkLinkLinkLinkLink("test");
        main.inFile.setInFileSoluteCalcRefLinkLinkLinkLinkLinkLinkLink("test");
        main.inFile.setInFileSolventCalcRefLinkLinkLinkLinkLinkLinkLink("test");
        main.inFile.setInFileSurfaceCalcRefLinkLinkLinkLinkLinkLinkLink("test");
        main.inFile.setInFileMembraneCalcRefLinkLinkLinkLinkLinkLinkLink("test");
        main.inFile.setInFileChargeCalcRefLinkLinkLinkLinkLinkLinkLinkDetails("test");