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

    @Test
    void testSaveData1() {
        Main main = new Main();
        main.pqrFile1.setText("test1.pqr");
        main.gridDimx.setText("10");
        main.gridDimy.setText("10");
        main.gridDimz.setText("10");
        main.gridLen1a.setText("10");
        main.gridLen2a.setText("10");
        main.gridLen3a.setText("10");
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
        assertTrue(main.SaveData());
    }

    @Test
    void testSaveData2() {
        Main main = new Main();
        main.pqrFile1.setText("test1.pqr");
        main.gridDimx.setText("10");
        main.gridDimy.setText("10");
        main.gridDimz.setText("10");
        main.gridLen1a.setText("10");
        main.gridLen2a.setText("10");
        main.gridLen3a.setText("10");
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
        main.centerCombo.setSelectedIndex(1);
        assertTrue(main.SaveData());
    }

    @Test
    void testSaveData3() {
        Main main = new Main();
        main.pqrFile1.setText("test1.pqr");
        main.gridDimx.setText("10");
        main.gridDimy.setText("10");
        main.gridDimz.setText("10");
        main.gridLen1a.setText("10");
        main.gridLen2a.setText("10");
        main.gridLen3a.setText("10");
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
        assertTrue(main.SaveData());
    }

    @Test
    void testSaveData4() {
        Main main = new Main();
        main.pqrFile1.setText("test1.pqr");
        main.gridDimx.setText("10");
        main.gridDimy.setText("10");
        main.gridDimz.setText("10");
        main.gridLen1a.setText("10");
        main.gridLen2a.setText("10");
        main.gridLen3a.setText("10");
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
        main.centerCombo.setSelectedIndex(1);
        assertTrue(main.SaveData());
    }

    @Test
    void testSaveData5() {
        Main main = new Main();
        main.pqrFile1.setText("test1.pqr");
        main.gridDimx.setText("10");
        main.gridDimy.setText("10");
        main.gridDimz.setText("10");
        main.gridLen1a.setText("10");
        main.gridLen2a.setText("10");
        main.gridLen3a.setText("10");
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
        assertTrue(main.SaveData());
    }

    @Test
    void testSaveData6() {
        Main main = new Main();
        main.pqrFile1.setText("test1.pqr");
        main.gridDimx.setText("10");
        main.gridDimy.setText("10");
        main.gridDimz.setText("10");
        main.gridLen1a.setText("10");
        main.gridLen2a.setText("10");
        main.gridLen3a.setText("