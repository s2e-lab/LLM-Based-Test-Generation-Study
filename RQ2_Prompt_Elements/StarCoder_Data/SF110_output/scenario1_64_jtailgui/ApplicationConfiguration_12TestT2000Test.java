// ApplicationConfiguration_12Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfiguration_12Test {

    @Test
    void jTailMainFrame_1() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    @Test
    void jTailMainFrame_2() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar());
    }

    @Test
    void jTailMainFrame_3() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0));
    }

    @Test
    void jTailMainFrame_4() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(0));
    }

    @Test
    void jTailMainFrame_5() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(1));
    }

    @Test
    void jTailMainFrame_6() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(2));
    }

    @Test
    void jTailMainFrame_7() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(3));
    }

    @Test
    void jTailMainFrame_8() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(4));
    }

    @Test
    void jTailMainFrame_9() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(5));
    }

    @Test
    void jTailMainFrame_10() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(6));
    }

    @Test
    void jTailMainFrame_11() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(7));
    }

    @Test
    void jTailMainFrame_12() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(8));
    }
}

// ApplicationConfiguration_13Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfiguration_13Test {
		
    @Test
    void jTailMainFrame_1() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    @Test
    void jTailMainFrame_2() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar());
    }

    @Test
    void jTailMainFrame_3() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0));
    }

    @Test
    void jTailMainFrame_4() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(0));
    }

    @Test
    void jTailMainFrame_5() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(1));
    }

    @Test
    void jTailMainFrame_6() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(2));
    }

    @Test
    void jTailMainFrame_7() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(3));
    }

    @Test
    void jTailMainFrame_8() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(4));
    }

    @Test
    void jTailMainFrame_9() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(5));
    }

    @Test
    void jTailMainFrame_10() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(6));
    }

    @Test
    void jTailMainFrame_11() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(7));
    }

    @Test
    void jTailMainFrame_12() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0).getItem(8));
    }
}

// ApplicationConfiguration_14Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfiguration_14Test {
		
    @Test
    void jTailMainFrame_1() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    @Test
    void jTailMainFrame_2() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar());
    }

    @Test
    void jTailMainFrame_3() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
        assertNotNull(jTailMainFrame.getJMenuBar().getMenu(0));
    }

    @Test
    void jTailMainFrame_4() {
        JTailMainFrame jTailMainFrame = new ApplicationConfiguration().jTailMainFrame();
       