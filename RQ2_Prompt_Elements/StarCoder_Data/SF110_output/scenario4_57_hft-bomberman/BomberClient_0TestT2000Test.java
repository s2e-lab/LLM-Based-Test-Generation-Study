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
* It contains ten unit test cases for the {@link BomberClient#connectToSrv()} method.
*/
class BomberClient_1Test {
		
    /**
    * Test method for {@link BomberClient#connectToSrv()}.
    */
    @Test
    void testConnectToSrv() {
        BomberClient instance = BomberClient.getInstance();
        instance.setServerName("localhost");
        instance.setServerPort(6666);
        boolean result = instance.connectToSrv();
        assertTrue(result);
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
* It contains ten unit test cases for the {@link BomberClient#sendMsg(messages.Message)} method.
*/
class BomberClient_2Test {
		
    /**
    * Test method for {@link BomberClient#sendMsg(messages.Message)}.
    */
    @Test
    void testSendMsg() {
        BomberClient instance = BomberClient.getInstance();
        instance.setServerName("localhost");
        instance.setServerPort(6666);
        instance.connectToSrv();
        Message msg = new InfoRequestMsg();
        instance.sendMsg(msg);
    }
}

// BomberClient_3Test.java
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
* It contains ten unit test cases for the {@link BomberClient#getNextId()} method.
*/
class BomberClient_3Test {
		
    /**
    * Test method for {@link BomberClient#getNextId()}.
    */
    @Test
    void testGetNextId() {
        BomberClient instance = BomberClient.getInstance();
        instance.setServerName("localhost");
        instance.setServerPort(6666);
        instance.connectToSrv();
        int result = instance.getNextId();
        assertEquals(0, result);
    }
}

// BomberClient_4Test.java
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
* It contains ten unit test cases for the {@link BomberClient#setCurrentSession(client.ClientGameSession)} method.
*/
class BomberClient_4Test {
		
    /**
    * Test method for {@link BomberClient#setCurrentSession(client.ClientGameSession)}.
    */
    @Test
    void testSetCurrentSession() {
        BomberClient instance = BomberClient.getInstance();
        instance.setServerName("localhost");
        instance.setServerPort(6666);
        instance.connectToSrv();
        ClientGameSession currentSession = new ClientGameSession();
        instance.setCurrentSession(currentSession);
    }
}

// BomberClient_5Test.java
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
* It contains ten unit test cases for the {@link BomberClient#createSession(java.lang.String, java.util.List, int, int)} method.
*/
class BomberClient_5Test {
		
    /**
    * Test method for {@link BomberClient#createSession(java.lang.String, java.util.List, int, int)}.
    */
    @Test
    void testCreateSession() {
        BomberClient instance = BomberClient.getInstance();
        instance.setServerName("localhost");
        instance.setServerPort(6666);
        instance.connectToSrv();
        List<String> maps = new ArrayList<String>();
        maps.add("map1");
        maps.add("map2");
        ImageIcon mapPreview = new ImageIcon("src/main/resources/images/map1.png");
        int totalPlayers = 2;
        int rounds = 1;
        instance.createSession("session1", maps, mapPreview, totalPlayers, rounds);
    }
}

// BomberClient_6Test.java
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
import messages.