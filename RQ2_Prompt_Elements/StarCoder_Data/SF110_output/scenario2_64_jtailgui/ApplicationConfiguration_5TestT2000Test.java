// ApplicationConfiguration_5Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#selectIndexTypeListener()} method.
*/
class ApplicationConfiguration_5Test {

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void testSelectIndexTypeListener() {
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(openFileModel());
        // Create the "select index type" action event.
        SelectIndexTypeListener.SelectIndexTypeEvent selectIndexTypeEvent = new SelectIndexTypeListener.SelectIndexTypeEvent(null, 0);
        // Call the "select index type" action.
        selectIndexTypeListener.actionPerformed(selectIndexTypeEvent);
        // Check that the "select index type" action has been called.
        assertTrue(selectIndexTypeEvent.isSelectIndexTypeCalled());
    }

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void testSelectIndexTypeListener_2() {
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(openFileModel());
        // Create the "select index type" action event.
        SelectIndexTypeListener.SelectIndexTypeEvent selectIndexTypeEvent = new SelectIndexTypeListener.SelectIndexTypeEvent(null, 1);
        // Call the "select index type" action.
        selectIndexTypeListener.actionPerformed(selectIndexTypeEvent);
        // Check that the "select index type" action has been called.
        assertTrue(selectIndexTypeEvent.isSelectIndexTypeCalled());
    }

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void testSelectIndexTypeListener_3() {
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(openFileModel());
        // Create the "select index type" action event.
        SelectIndexTypeListener.SelectIndexTypeEvent selectIndexTypeEvent = new SelectIndexTypeListener.SelectIndexTypeEvent(null, 2);
        // Call the "select index type" action.
        selectIndexTypeListener.actionPerformed(selectIndexTypeEvent);
        // Check that the "select index type" action has been called.
        assertTrue(selectIndexTypeEvent.isSelectIndexTypeCalled());
    }

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void testSelectIndexTypeListener_4() {
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(openFileModel());
        // Create the "select index type" action event.
        SelectIndexTypeListener.SelectIndexTypeEvent selectIndexTypeEvent = new SelectIndexTypeListener.SelectIndexTypeEvent(null, 3);
        // Call the "select index type" action.
        selectIndexTypeListener.actionPerformed(selectIndexTypeEvent);
        // Check that the "select index type" action has been called.
        assertTrue(selectIndexTypeEvent.isSelectIndexTypeCalled());
    }

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void testSelectIndexTypeListener_5() {
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(openFileModel());
        // Create the "select index type" action event.
        SelectIndexTypeListener.SelectIndexTypeEvent selectIndexTypeEvent = new SelectIndexTypeListener.SelectIndexTypeEvent(null, 4);
        // Call the "select index type" action.
        selectIndexTypeListener.actionPerformed(selectIndexTypeEvent);
        // Check that the "select index type" action has been called.
        assertTrue(selectIndexTypeEvent.isSelectIndexTypeCalled());
    }

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void testSelectIndexTypeListener_6() {
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(openFileModel());
        // Create the "select index type" action event.
        SelectIndexTypeListener.SelectIndexTypeEvent selectIndexTypeEvent = new SelectIndexTypeListener.SelectIndexTypeEvent(null, 5);
        // Call the "select index type" action.
        selectIndexTypeListener.actionPerformed(selectIndexTypeEvent);
        // Check that the "select index type" action has been called.
        assertTrue(selectIndexTypeEvent.isSelectIndexTypeCalled());
    }

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void testSelectIndexTypeListener_7() {
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(openFileModel());
        // Create the "select index type" action event.
        SelectIndexTypeListener.SelectIndexTypeEvent selectIndexTypeEvent = new SelectIndexTypeListener.SelectIndexTypeEvent(null, 6);
        // Call the "select index type" action.
        selectIndexTypeListener.actionPerformed(selectIndexTypeEvent);
        // Check that the "select index type" action has been called.
        assertTrue(selectIndexTypeEvent.isSelectIndexTypeCalled());
    }

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void testSelectIndexTypeListener_8() {
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(openFileModel());
        // Create the "select index type" action event.
        SelectIndexTypeListener.SelectIndexTypeEvent selectIndexTypeEvent = new SelectIndexTypeListener.SelectIndexTypeEvent(null, 7);
        // Call the "select index type" action.
        selectIndexTypeListener.actionPerformed(selectIndexTypeEvent);
        // Check that the "select index type" action has been called.
        assertTrue(selectIndexTypeEvent.isSelectIndexTypeCalled());
    }

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void testSelectIndexTypeListener_9() {
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(openFileModel());
        // Create the "select index type" action event.
        SelectIndexTypeListener.SelectIndexTypeEvent selectIndexTypeEvent = new SelectIndexTypeListener.SelectIndexTypeEvent(null, 8);
        // Call the "select index type" action.
        selectIndexTypeListener.actionPerformed(selectIndexTypeEvent);
        // Check that the "select index type" action has been called.
        assertTrue(selectIndexTypeEvent.isSelectIndexTypeCalled());
    }

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void testSelectIndexTypeListener_10() {
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(openFileModel());
        // Create the "select index type" action event.
        SelectIndexTypeListener.SelectIndexTypeEvent selectIndexTypeEvent = new SelectIndexTypeListener.SelectIndexTypeEvent(null, 9);
        // Call the "select index type" action.
        selectIndexTypeListener.actionPerformed(selectIndexTypeEvent);
        // Check that the "select index type" action has been called.
        assertTrue(selectIndexTypeEvent.isSelectIndexTypeCalled());
    }

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method