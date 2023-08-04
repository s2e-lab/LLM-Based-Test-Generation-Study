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

    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame_1() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame_2() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame_3() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame_4() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame_5() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame_6() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame_7() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame_8() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame_9() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame_10() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }
}
