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

    private static final Logger logger = Logger.getLogger(BomberClient_0Test.class);

    @Test
    void getInstance_0() {
        logger.info("Executing getInstance_0 test case");
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance);
    }

    @Test
    void getInstance_1() {
        logger.info("Executing getInstance_1 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertEquals(instance, instance2);
    }

    @Test
    void getInstance_2() {
        logger.info("Executing getInstance_2 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_3() {
        logger.info("Executing getInstance_3 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_4() {
        logger.info("Executing getInstance_4 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_5() {
        logger.info("Executing getInstance_5 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_6() {
        logger.info("Executing getInstance_6 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_7() {
        logger.info("Executing getInstance_7 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_8() {
        logger.info("Executing getInstance_8 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_9() {
        logger.info("Executing getInstance_9 test case");
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
		
    private static final Logger logger = Logger.getLogger(BomberClient_1Test.class);

    @Test
    void getInstance_0() {
        logger.info("Executing getInstance_0 test case");
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance);
    }

    @Test
    void getInstance_1() {
        logger.info("Executing getInstance_1 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertEquals(instance, instance2);
    }

    @Test
    void getInstance_2() {
        logger.info("Executing getInstance_2 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_3() {
        logger.info("Executing getInstance_3 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_4() {
        logger.info("Executing getInstance_4 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_5() {
        logger.info("Executing getInstance_5 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_6() {
        logger.info("Executing getInstance_6 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_7() {
        logger.info("Executing getInstance_7 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_8() {
        logger.info("Executing getInstance_8 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_9() {
        logger.info("Executing getInstance_9 test case");
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
class BomberClient_2Test {
		
    private static final Logger logger = Logger.getLogger(BomberClient_2Test.class);

    @Test
    void getInstance_0() {
        logger.info("Executing getInstance_0 test case");
        BomberClient instance = BomberClient.getInstance();
        assertNotNull(instance);
    }

    @Test
    void getInstance_1() {
        logger.info("Executing getInstance_1 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertEquals(instance, instance2);
    }

    @Test
    void getInstance_2() {
        logger.info("Executing getInstance_2 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance2 = BomberClient.getInstance();
        assertNotSame(instance, instance2);
    }

    @Test
    void getInstance_3() {
        logger.info("Executing getInstance_3 test case");
        BomberClient instance = BomberClient.getInstance();
        BomberClient instance