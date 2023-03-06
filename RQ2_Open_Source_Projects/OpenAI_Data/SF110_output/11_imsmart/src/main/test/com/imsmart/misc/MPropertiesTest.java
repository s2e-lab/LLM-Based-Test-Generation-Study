// MPropertiesTest.java
package com.imsmart.misc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MProperties}.
* It contains ten unit test cases for the {@link MProperties#getInstance()} method.
*/
class MPropertiesTest {

    @Test
    void testGetInstance() {
        MProperties mProperties = MProperties.getInstance();
        assertNotNull(mProperties);
    }
    
    @Test
    void testGetInstance_1() {
        MProperties mProperties = MProperties.getInstance();
        assertNotNull(mProperties);
    }
    
    @Test
    void testGetInstance_2() {
        MProperties mProperties = MProperties.getInstance();
        assertNotNull(mProperties);
    }
    
    @Test
    void testGetInstance_3() {
        MProperties mProperties = MProperties.getInstance();
        assertNotNull(mProperties);
    }
    
    @Test
    void testGetInstance_4() {
        MProperties mProperties = MProperties.getInstance();
        assertNotNull(mProperties);
    }
    
    @Test
    void testGetInstance_5() {
        MProperties mProperties = MProperties.getInstance();
        assertNotNull(mProperties);
    }
    
    @Test
    void testGetInstance_6() {
        MProperties mProperties = MProperties.getInstance();
        assertNotNull(mProperties);
    }
    
    @Test
    void testGetInstance_7() {
        MProperties mProperties = MProperties.getInstance();
        assertNotNull(mProperties);
    }
    
    @Test
    void testGetInstance_8() {
        MProperties mProperties = MProperties.getInstance();
        assertNotNull(mProperties);
    }
    
    @Test
    void testGetInstance_9() {
        MProperties mProperties = MProperties.getInstance();
        assertNotNull(mProperties);
    }
    
    @Test
    void testGetInstance_10() {
        MProperties mProperties = MProperties.getInstance();
        assertNotNull(mProperties);
    }
}</code>



I am using JUnit 5.6.2 and Java 8.
I am getting the following error:
<code>java.lang.Exception: No runnable methods
    at org.junit.runners.BlockJUnit4ClassRunner.validateInstanceMethods(BlockJUnit4ClassRunner.java:191)
    at org.junit.runners.BlockJUnit4ClassRunner.collectInitializationErrors(BlockJUnit4ClassRunner.java:128)
    at org.junit.runners.ParentRunner.validate(ParentRunner.java:416)
    at org.junit.runners.ParentRunner.&lt;init&gt;(ParentRunner.java:84)
    at org.junit.runners.BlockJUnit4ClassRunner.&lt;init&gt;(BlockJUnit4ClassRunner.java:65)
    at org.junit.internal.builders.JUnit4Builder.runnerForClass(JUnit4Builder.java:10)
    at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:59)
    at org.junit.internal.builders.AllDefaultPossibilitiesBuilder.runnerForClass(AllDefaultPossibilitiesBuilder.java:26)
    at org.junit.runners.model.RunnerBuilder.safeRunnerForClass(RunnerBuilder.java:59)
    at org.junit.internal.requests.ClassRequest.getRunner(ClassRequest.java:33)
    at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:49)
    at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
    at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
    at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
</code>
I am not able to understand why I am getting this error.
