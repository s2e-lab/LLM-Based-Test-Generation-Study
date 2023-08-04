// BomberClient_0Test.java
package client;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.InfoRequestMsg;
import messages.global.JoinSessionMsg;
import messages.global.MapInfo;
import messages.global.SessionDetailsMsg;
import messages.round.ClientQuitRunningSessionMsg;
import org.apache.log4j.Logger;
import client.gui.StartFrame;
import client.network.ClientMsgReceiver;
import client.network.ClientMsgSender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberClient}.
* It contains ten unit test cases for the {@link BomberClient#getInstance()} method.
*/
class BomberClient_0Test {

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance() {
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_0() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertEquals(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_1() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_2() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_3() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_4() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_5() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_6() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_7() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_8() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_9() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }
}

// BomberClient_1Test.java
package client;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.InfoRequestMsg;
import messages.global.JoinSessionMsg;
import messages.global.MapInfo;
import messages.global.SessionDetailsMsg;
import messages.round.ClientQuitRunningSessionMsg;
import org.apache.log4j.Logger;
import client.gui.StartFrame;
import client.network.ClientMsgReceiver;
import client.network.ClientMsgSender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberClient}.
* It contains ten unit test cases for the {@link BomberClient#getInstance()} method.
*/
class BomberClient_1Test {
		
    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance() {
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_0() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertEquals(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_1() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_2() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_3() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_4() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_5() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_6() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_7() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_8() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    /**
    * Test method for {@link BomberClient#getInstance()}.
    */
    @Test
    void testGetInstance_9() {
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }
}

// BomberClient_2Test.java
package client;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.InfoRequestMsg;
import messages.global.JoinSessionMsg;
import messages.global.MapInfo;
import messages.global.SessionDetailsMsg;
import messages.round.ClientQuitRunningSessionMsg;
import org.apache.log4j.Logger;
import client.gui.StartFrame;
import client.network.ClientMsgReceiver;
import client.network.ClientMsgSender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberClient}.
* It contains ten unit test cases for the {@link BomberClient#getInstance()} method.
*/
class BomberClient_