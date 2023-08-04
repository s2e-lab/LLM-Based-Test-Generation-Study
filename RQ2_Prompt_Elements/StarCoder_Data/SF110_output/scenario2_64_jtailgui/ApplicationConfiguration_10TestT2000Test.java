// ApplicationConfiguration_10Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfiguration_10Test {

    /**
    * Test case number: 1
    * Test case values:
    *   expected: "Quit"
    *   actual: "Quit"
    * Test case success:
    *   yes
    */
    @Test
    void quitAction_1() {
        // Test case number: 1
        // Test case values:
        //   expected: "Quit"
        //   actual: "Quit"
        // Test case success:
        //   yes
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        String expected = "Quit";
        String actual = quitAction.getValue(null);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 2
    * Test case values:
    *   expected: "Quit"
    *   actual: "Quit"
    * Test case success:
    *   yes
    */
    @Test
    void quitAction_2() {
        // Test case number: 2
        // Test case values:
        //   expected: "Quit"
        //   actual: "Quit"
        // Test case success:
        //   yes
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        String expected = "Quit";
        String actual = quitAction.getValue(ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.view.Bundle"));
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 3
    * Test case values:
    *   expected: "Quit"
    *   actual: "Quit"
    * Test case success:
    *   yes
    */
    @Test
    void quitAction_3() {
        // Test case number: 3
        // Test case values:
        //   expected: "Quit"
        //   actual: "Quit"
        // Test case success:
        //   yes
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        String expected = "Quit";
        String actual = quitAction.getValue(ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.view.Bundle", new Locale("fr", "FR")));
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 4
    * Test case values:
    *   expected: "Quit"
    *   actual: "Quit"
    * Test case success:
    *   yes
    */
    @Test
    void quitAction_4() {
        // Test case number: 4
        // Test case values:
        //   expected: "Quit"
        //   actual: "Quit"
        // Test case success:
        //   yes
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        String expected = "Quit";
        String actual = quitAction.getValue(ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.view.Bundle", new Locale("fr", "FR", "fr")));
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 5
    * Test case values:
    *   expected: "Quit"
    *   actual: "Quit"
    * Test case success:
    *   yes
    */
    @Test
    void quitAction_5() {
        // Test case number: 5
        // Test case values:
        //   expected: "Quit"
        //   actual: "Quit"
        // Test case success:
        //   yes
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        String expected = "Quit";
        String actual = quitAction.getValue(ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.view.Bundle", new Locale("fr", "FR", "fr", "FR")));
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 6
    * Test case values:
    *   expected: "Quit"
    *   actual: "Quit"
    * Test case success:
    *   yes
    */
    @Test
    void quitAction_6() {
        // Test case number: 6
        // Test case values:
        //   expected: "Quit"
        //   actual: "Quit"
        // Test case success:
        //   yes
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        String expected = "Quit";
        String actual = quitAction.getValue(ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.view.Bundle", new Locale("fr", "FR", "fr", "FR", "fr")));
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 7
    * Test case values:
    *   expected: "Quit"
    *   actual: "Quit"
    * Test case success:
    *   yes
    */
    @Test
    void quitAction_7() {
        // Test case number: 7
        // Test case values:
        //   expected: "Quit"
        //   actual: "Quit"
        // Test case success:
        //   yes
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        String expected = "Quit";
        String actual = quitAction.getValue(ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.view.Bundle", new Locale("fr", "FR", "fr", "FR", "fr", "FR")));
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 8
    * Test case values:
    *   expected: "Quit"
    *   actual: "Quit"
    * Test case success:
    *   yes
    */
    @Test
    void quitAction_8() {
        // Test case number: 8
        // Test case values:
        //   expected: "Quit"
        //   actual: "Quit"
        // Test case success:
        //   yes
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        String expected = "Quit";
        String actual = quitAction.getValue(ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.view.Bundle", new Locale("fr", "FR", "fr", "FR", "fr", "FR", "fr")));
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 9
    * Test case values:
    *   expected: "Quit"
    *   actual: "Quit"
    * Test case success:
    *   yes
    */
    @Test
    void quitAction_9() {
        // Test case number: 9
        // Test case values:
        //   expected: "Quit"
        //   actual: "Quit"
        // Test case success:
        //   yes
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        String expected = "Quit";
        String actual = quitAction.getValue(ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.view.Bundle", new Locale("fr", "FR", "fr", "FR", "fr", "FR", "fr", "FR")));
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 10
    * Test case values:
    *   expected: "Quit"
    *   actual: "Quit"
    * Test case success:
    *   yes
    */
    @Test
    void quitAction_10() {
        // Test case number: 10
        // Test case values:
        //   expected: "Quit"
        //   actual: "Quit"
        // Test case success:
        //   yes
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        String expected = "Quit";
        String actual = quitAction.getValue(ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.view.Bundle", new Locale("fr", "FR", "fr", "FR", "fr", "FR", "fr", "FR", "fr")));
        assertEquals(expected, actual);
    }
}

// ApplicationConfiguration_11Test.java
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
* It