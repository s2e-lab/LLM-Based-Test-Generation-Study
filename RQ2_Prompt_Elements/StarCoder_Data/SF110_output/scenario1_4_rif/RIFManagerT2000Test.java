// RIFManagerTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import com.densebrain.rif.client.service.RIFService;
import com.densebrain.rif.client.service.RIFServiceStub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManager}.
* It contains ten unit test cases for the {@link RIFManager#getInvoker(Class)} method.
*/
class RIFManagerTest {

    @Test
    void testGetInvoker() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        assertNotNull(invoker);
        assertTrue(invoker instanceof RIFInvoker);
        assertTrue(invoker.getInterfaceClazz() == RIFService.class);
        assertTrue(invoker.getRIFService() instanceof RIFServiceStub);
    }

    @Test
    void testGetInvokerWithNull() throws RemoteException {
        RIFManager manager = new RIFManager();
        assertThrows(NullPointerException.class, () -> manager.getInvoker(null));
    }

    @Test
    void testGetInvokerWithNonRIFInterface() throws RemoteException {
        RIFManager manager = new RIFManager();
        assertThrows(IllegalArgumentException.class, () -> manager.getInvoker(String.class));
    }

    @Test
    void testGetInvokerWithRIFInterface() throws RemoteException {
        RIFManager manager = new RIFManager();
        assertThrows(IllegalArgumentException.class, () -> manager.getInvoker(RIFServiceStub.class));
    }

    @Test
    void testGetInvokerWithRIFInterfaceSubclass() throws RemoteException {
        RIFManager manager = new RIFManager();
        assertThrows(IllegalArgumentException.class, () -> manager.getInvoker(RIFServiceStub.class));
    }

    @Test
    void testGetInvokerWithRIFInterfaceSuperclass() throws RemoteException {
        RIFManager manager = new RIFManager();
        assertThrows(IllegalArgumentException.class, () -> manager.getInvoker(RIFServiceStub.class));
    }
}
