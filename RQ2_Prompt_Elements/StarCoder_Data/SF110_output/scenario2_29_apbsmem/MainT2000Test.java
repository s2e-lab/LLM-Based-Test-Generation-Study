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
        main.pqrFile1.setText("test1.pqr");
        main.pqrFile2.setText("test2.pqr");
        main.gridDimx.setText("10");
        main.gridDimy.setText("10");
        main.gridDimz.setText("10");
        main.gridLen1a.setText("1");
        main.gridLen2a.setText("1");
        main.gridLen3a.setText("1");
        main.countIon1Charge.setText("1");
        main.countIon1Con.setText("1");
        main.countIon1Sz.setText("1");
        main.countIon2Charge.setText("1");
        main.countIon2Con.setText("1");
        main.countIon2Sz.setText("1");
        main.proteinDi.setText("1");
        main.solventDi.setText("1");
        main.srad.setText("1");
        main.sdens.setText("1");
        main.temp.setText("1");
        main.calcTypeCombo.setSelectedIndex(0);
        main.potential.setText("1");
        main.Lmem.setText("1");
        main.zmem.setText("1");
        main.membraneDi.setText("1");
        main.idie.setText("1");
        main.geoFactor1.setText("1");
        main.geoFactor2.setText("1");
        main.geoFactor3.setText("1");
        main.drawPot.setSelected(true);
        main.boundaryCondCombo.setSelectedIndex(0);
        main.solMethodCombo.setSelectedIndex(0);
        main.centerCombo.setSelectedIndex(0);
        main.SaveData();
        assertEquals("test1.pqr", main.inFile.getMol1());
        assertEquals("test2.pqr", main.inFile.getMol2());
        assertEquals("10 10 10", main.inFile.getDime());
        assertEquals("1 1 1", main.inFile.getGlen(0));
        assertEquals("1 1 1", main.inFile.getGlen(1));
        assertEquals("1 1 1", main.inFile.getGlen(2));
        assertEquals("1", main.inFile.getIon1Charge());
        assertEquals("1", main.inFile.getIon1Conc());
        assertEquals("1", main.inFile.getIon1Radius());
        assertEquals("1", main.inFile.getIon2Charge());
        assertEquals("1", main.inFile.getIon2Conc());
        assertEquals("1", main.inFile.getIon2Radius());
        assertEquals("1", main.inFile.getProteinDi());
        assertEquals("1", main.inFile.getSolventDi());
        assertEquals("1", main.inFile.getSrad());
        assertEquals("1", main.inFile.getSdens());
        assertEquals("1", main.inFile.getTemp());
        assertEquals(0, main.inFile.getType());
        assertEquals("1", main.inFile.getPotential());
        assertEquals("1", main.inFile.getLmem());
        assertEquals("1", main.inFile.getZmem());
        assertEquals("1", main.inFile.getMdie());
        assertEquals("1", main.inFile.getIdie());
        assertEquals("1", main.inFile.getGeo1());
        assertEquals("1", main.inFile.getGeo2());
        assertEquals("1", main.inFile.getGeo3());
        assertEquals(true, main.inFile.getDrawPot());
        assertEquals("zero", main.inFile.getBoundCond());
        assertEquals("lpbe", main.inFile.getSolMethod());
        assertEquals("0 0 0", main.inFile.getCenter());
    }
}
