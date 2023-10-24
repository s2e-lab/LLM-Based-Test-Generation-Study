// _SetEngineInfo_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains ten unit test cases for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfo_1Test {

    /**
    * Test {@link _SetEngineInfo#getTypeDesc()} for the case when the typeDesc field is null.
    */
    @Test
    void getTypeDesc_0() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        assertNull(_setEngineInfo.getTypeDesc());
    }

    /**
    * Test {@link _SetEngineInfo#getTypeDesc()} for the case when the typeDesc field is not null.
    */
    @Test
    void getTypeDesc_1() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        assertNotNull(_setEngineInfo.getTypeDesc());
    }
}

// _SetEngineInfo_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains ten unit test cases for the {@link _SetEngineInfo#equals(java.lang.Object)} method.
*/
class _SetEngineInfo_2Test {
		
    /**
    * Test {@link _SetEngineInfo#equals(java.lang.Object)} for the case when the obj parameter is null.
    */
    @Test
    void equals_0() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        _setEngineInfo.setName("name");
        _setEngineInfo.setCpu((float) 1.0);
        _setEngineInfo.setRam((float) 1.0);
        _setEngineInfo.setOs("os");
        _SetEngineInfo _setEngineInfo1 = new _SetEngineInfo();
        _setEngineInfo1.setName("name");
        _setEngineInfo1.setCpu((float) 1.0);
        _setEngineInfo1.setRam((float) 1.0);
        _setEngineInfo1.setOs("os");
        assertTrue(_setEngineInfo.equals(_setEngineInfo1));
    }

    /**
    * Test {@link _SetEngineInfo#equals(java.lang.Object)} for the case when the obj parameter is not null.
    */
    @Test
    void equals_1() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        _setEngineInfo.setName("name");
        _setEngineInfo.setCpu((float) 1.0);
        _setEngineInfo.setRam((float) 1.0);
        _setEngineInfo.setOs("os");
        _SetEngineInfo _setEngineInfo1 = new _SetEngineInfo();
        _setEngineInfo1.setName("name");
        _setEngineInfo1.setCpu((float) 1.0);
        _setEngineInfo1.setRam((float) 1.0);
        _setEngineInfo1.setOs("os");
        assertTrue(_setEngineInfo.equals(_setEngineInfo1));
    }

    /**
    * Test {@link _SetEngineInfo#equals(java.lang.Object)} for the case when the obj parameter is not null.
    */
    @Test
    void equals_2() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        _setEngineInfo.setName("name");
        _setEngineInfo.setCpu((float) 1.0);
        _setEngineInfo.setRam((float) 1.0);
        _setEngineInfo.setOs("os");
        _SetEngineInfo _setEngineInfo1 = new _SetEngineInfo();
        _setEngineInfo1.setName("name");
        _setEngineInfo1.setCpu((float) 1.0);
        _setEngineInfo1.setRam((float) 1.0);
        _setEngineInfo1.setOs("os");
        assertTrue(_setEngineInfo.equals(_setEngineInfo1));
    }

    /**
    * Test {@link _SetEngineInfo#equals(java.lang.Object)} for the case when the obj parameter is not null.
    */
    @Test
    void equals_3() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        _setEngineInfo.setName("name");
        _setEngineInfo.setCpu((float) 1.0);
        _setEngineInfo.setRam((float) 1.0);
        _setEngineInfo.setOs("os");
        _SetEngineInfo _setEngineInfo1 = new _SetEngineInfo();
        _setEngineInfo1.setName("name");
        _setEngineInfo1.setCpu((float) 1.0);
        _setEngineInfo1.setRam((float) 1.0);
        _setEngineInfo1.setOs("os");
        assertTrue(_setEngineInfo.equals(_setEngineInfo1));
    }

    /**
    * Test {@link _SetEngineInfo#equals(java.lang.Object)} for the case when the obj parameter is not null.
    */
    @Test
    void equals_4() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        _setEngineInfo.setName("name");
        _setEngineInfo.setCpu((float) 1.0);
        _setEngineInfo.setRam((float) 1.0);
        _setEngineInfo.setOs("os");
        _SetEngineInfo _setEngineInfo1 = new _SetEngineInfo();
        _setEngineInfo1.setName("name");
        _setEngineInfo1.setCpu((float) 1.0);
        _setEngineInfo1.setRam((float) 1.0);
        _setEngineInfo1.setOs("os");
        assertTrue(_setEngineInfo.equals(_setEngineInfo1));
    }

    /**
    * Test {@link _SetEngineInfo#equals(java.lang.Object)} for the case when the obj parameter is not null.
    */
    @Test
    void equals_5() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        _setEngineInfo.setName("name");
        _setEngineInfo.setCpu((float) 1.0);
        _setEngineInfo.setRam((float) 1.0);
        _setEngineInfo.setOs("os");
        _SetEngineInfo _setEngineInfo1 = new _SetEngineInfo();
        _setEngineInfo1.setName("name");
        _setEngineInfo1.setCpu((float) 1.0);
        _setEngineInfo1.setRam((float) 1.0);
        _setEngineInfo1.setOs("os");
        assertTrue(_setEngineInfo.equals(_setEngineInfo1));
    }

    /**
    * Test {@link _SetEngineInfo#equals(java.lang.Object)} for the case when the obj parameter is not null.
    */
    @Test
    void equals_6() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        _setEngineInfo.setName("name");
        _setEngineInfo.setCpu((float) 1.0);
        _setEngineInfo.setRam((float) 1.0);
        _setEngineInfo.setOs("os");
        _SetEngineInfo _setEngineInfo1 = new _SetEngineInfo();
        _setEngineInfo1.setName("name");
        _setEngineInfo1.setCpu((float) 1.0);
        _setEngineInfo1.setRam((float) 1.0);
        _setEngineInfo1.setOs("os");
        assertTrue(_setEngineInfo.equals(_setEngineInfo1));
    }

    /**
    * Test {@link _SetEngineInfo#equals(java.lang.Object)} for the case when the obj parameter is not null.
    */
    @Test
    void equals_7() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        _setEngineInfo.setName("name");
        _setEngineInfo.setCpu((float) 1.0);
        _setEngineInfo.setRam((float) 1.0);
        _setEngineInfo.setOs("os");
        _SetEngineInfo _setEngineInfo1 = new _SetEngineInfo();
        _setEngineInfo1.setName("name");
        _setEngineInfo1.setCpu((float) 1.0);
        _setEngineInfo1.setRam((float) 1.0);
        _setEngineInfo1.setOs("os");
        assertTrue(_setEngineInfo.equals(_setEngineInfo1));
    }

    /**
    * Test {@link _SetEngineInfo#equals(java.lang.Object)} for the case when the obj parameter is not null.
    */
    @Test
    void equals_8() {
        _SetEngineInfo _setEngineInfo = new _SetEngineInfo();
        _setEngineInfo.setName("name");
        _setEngineInfo.setCpu((float) 1.0);
        _setEngineInfo.setRam((float) 1.0);
        _setEngineInfo.setOs("os");
        _SetEngineInfo _setEngineInfo1 = new _SetEngineInfo();
        _setEngineInfo1.setName("name");
        _setEngineInfo1.set