// Job_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains ten unit test cases for the {@link Job#getTypeDesc()} method.
*/
class Job_1Test {

    /**
    * Test case number: 1
    * Test case values:
    * id:
    * name:
    * discriminators:
    * dependencies:
    * context:
    * progress: 0
    * broadcasted: false
    * currentEngineId:
    * status:
    */
    @Test
    void test1() {
        Job obj = new Job();
        obj.setId(null);
        obj.setName(null);
        obj.setDiscriminators(null);
        obj.setDependencies(null);
        obj.setContext(null);
        obj.setProgress(0);
        obj.setBroadcasted(false);
        obj.setCurrentEngineId(null);
        obj.setStatus(null);
        assertEquals(null, obj.getId());
        assertEquals(null, obj.getName());
        assertEquals(null, obj.getDiscriminators());
        assertEquals(null, obj.getDependencies());
        assertEquals(null, obj.getContext());
        assertEquals(0, obj.getProgress());
        assertEquals(false, obj.isBroadcasted());
        assertEquals(null, obj.getCurrentEngineId());
        assertEquals(null, obj.getStatus());
    }

    /**
    * Test case number: 2
    * Test case values:
    * id:
    * name:
    * discriminators:
    * dependencies:
    * context:
    * progress: 0
    * broadcasted: false
    * currentEngineId:
    * status:
    */
    @Test
    void test2() {
        Job obj = new Job();
        obj.setId("");
        obj.setName("");
        obj.setDiscriminators(null);
        obj.setDependencies(null);
        obj.setContext(null);
        obj.setProgress(0);
        obj.setBroadcasted(false);
        obj.setCurrentEngineId(null);
        obj.setStatus(null);
        assertEquals("", obj.getId());
        assertEquals("", obj.getName());
        assertEquals(null, obj.getDiscriminators());
        assertEquals(null, obj.getDependencies());
        assertEquals(null, obj.getContext());
        assertEquals(0, obj.getProgress());
        assertEquals(false, obj.isBroadcasted());
        assertEquals(null, obj.getCurrentEngineId());
        assertEquals(null, obj.getStatus());
    }

    /**
    * Test case number: 3
    * Test case values:
    * id:
    * name:
    * discriminators:
    * dependencies:
    * context:
    * progress: 0
    * broadcasted: false
    * currentEngineId:
    * status:
    */
    @Test
    void test3() {
        Job obj = new Job();
        obj.setId("id");
        obj.setName("name");
        obj.setDiscriminators(null);
        obj.setDependencies(null);
        obj.setContext(null);
        obj.setProgress(0);
        obj.setBroadcasted(false);
        obj.setCurrentEngineId(null);
        obj.setStatus(null);
        assertEquals("id", obj.getId());
        assertEquals("name", obj.getName());
        assertEquals(null, obj.getDiscriminators());
        assertEquals(null, obj.getDependencies());
        assertEquals(null, obj.getContext());
        assertEquals(0, obj.getProgress());
        assertEquals(false, obj.isBroadcasted());
        assertEquals(null, obj.getCurrentEngineId());
        assertEquals(null, obj.getStatus());
    }

    /**
    * Test case number: 4
    * Test case values:
    * id:
    * name:
    * discriminators:
    * dependencies:
    * context:
    * progress: 0
    * broadcasted: false
    * currentEngineId:
    * status:
    */
    @Test
    void test4() {
        Job obj = new Job();
        obj.setId(null);
        obj.setName(null);
        obj.setDiscriminators(null);
        obj.setDependencies(null);
        obj.setContext(null);
        obj.setProgress(0);
        obj.setBroadcasted(false);
        obj.setCurrentEngineId(null);
        obj.setStatus(null);
        assertEquals(null, obj.getId());
        assertEquals(null, obj.getName());
        assertEquals(null, obj.getDiscriminators());
        assertEquals(null, obj.getDependencies());
        assertEquals(null, obj.getContext());
        assertEquals(0, obj.getProgress());
        assertEquals(false, obj.isBroadcasted());
        assertEquals(null, obj.getCurrentEngineId());
        assertEquals(null, obj.getStatus());
    }

    /**
    * Test case number: 5
    * Test case values:
    * id:
    * name:
    * discriminators:
    * dependencies:
    * context:
    * progress: 0
    * broadcasted: false
    * currentEngineId:
    * status:
    */
    @Test
    void test5() {
        Job obj = new Job();
        obj.setId("");
        obj.setName("");
        obj.setDiscriminators(null);
        obj.setDependencies(null);
        obj.setContext(null);
        obj.setProgress(0);
        obj.setBroadcasted(false);
        obj.setCurrentEngineId(null);
        obj.setStatus(null);
        assertEquals("", obj.getId());
        assertEquals("", obj.getName());
        assertEquals(null, obj.getDiscriminators());
        assertEquals(null, obj.getDependencies());
        assertEquals(null, obj.getContext());
        assertEquals(0, obj.getProgress());
        assertEquals(false, obj.isBroadcasted());
        assertEquals(null, obj.getCurrentEngineId());
        assertEquals(null, obj.getStatus());
    }

    /**
    * Test case number: 6
    * Test case values:
    * id:
    * name:
    * discriminators:
    * dependencies:
    * context:
    * progress: 0
    * broadcasted: false
    * currentEngineId:
    * status:
    */
    @Test
    void test6() {
        Job obj = new Job();
        obj.setId("id");
        obj.setName("name");
        obj.setDiscriminators(null);
        obj.setDependencies(null);
        obj.setContext(null);
        obj.setProgress(0);
        obj.setBroadcasted(false);
        obj.setCurrentEngineId(null);
        obj.setStatus(null);
        assertEquals("id", obj.getId());
        assertEquals("name", obj.getName());
        assertEquals(null, obj.getDiscriminators());
        assertEquals(null, obj.getDependencies());
        assertEquals(null, obj.getContext());
        assertEquals(0, obj.getProgress());
        assertEquals(false, obj.isBroadcasted());
        assertEquals(null, obj.getCurrentEngineId());
        assertEquals(null, obj.getStatus());
    }

    /**
    * Test case number: 7
    * Test case values:
    * id:
    * name:
    * discriminators:
    * dependencies:
    * context:
    * progress: 0
    * broadcasted: false
    * currentEngineId:
    * status:
    */
    @Test
    void test7() {
        Job obj = new Job();
        obj.setId(null);
        obj.setName(null);
        obj.setDiscriminators(null);
        obj.setDependencies(null);
        obj.setContext(null);
        obj.setProgress(0);
        obj.setBroadcasted(false);
        obj.setCurrentEngineId(null);
        obj.setStatus(null);
        assertEquals(null, obj.getId());
        assertEquals(null, obj.getName());
        assertEquals(null, obj.getDiscriminators());
        assertEquals(null, obj.getDependencies());
        assertEquals(null, obj.getContext());
        assertEquals(0, obj.getProgress());
        assertEquals(false, obj.isBroadcasted());
        assertEquals(null, obj.getCurrentEngineId());
        assertEquals(null, obj.getStatus());
    }

    /**
    * Test case number: 8
    * Test case values:
    * id:
    * name:
    * discriminators:
    * dependencies:
    * context:
    * progress: 0
    * broadcasted: false
    * currentEngineId:
    * status:
    */
    @Test
    void test8() {
        Job obj = new Job();
        obj.setId("");
        obj.setName("");
        obj.setDiscriminators(null);
        obj.setDependencies(null);
        obj.setContext(null);
        obj.setProgress(0);
        obj.setBroadcasted(false);
        obj.setCurrentEngineId(null);
        obj.setStatus(null);
        assertEquals("", obj.getId());
        assertEquals("", obj.getName());
        assertEquals(null, obj.getDiscriminators());
        assertEquals(null, obj.getDependencies());
        assertEquals(null, obj.getContext());
        assertEquals(0, obj.getProgress());
        assertEquals(false, obj.isBroadcasted());
        assertEquals(null, obj.getCurrentEngineId());
        assertEquals(null, obj.getStatus());
    }

    /**
    * Test case number: 9
    * Test case values:
    * id:
    * name:
    * discriminators:
    * dependencies:
    * context:
    * progress: 0
    * broadcasted: false
    * currentEngineId:
    * status:
    */
    @Test
    void test9() {
        Job obj = new Job();
        obj