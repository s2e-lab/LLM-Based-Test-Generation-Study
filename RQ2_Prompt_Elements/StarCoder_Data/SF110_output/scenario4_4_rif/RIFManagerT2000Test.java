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

    /**
     * Test case for {@link RIFManager#getInvoker(Class)}
     * @throws RemoteException
     */
    @Test
    void testGetInvoker() throws RemoteException {
        RIFManager manager = new RIFManager("http://localhost:8080/rif-service");
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        assertNotNull(invoker);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)}
     * @throws RemoteException
     */
    @Test
    void testGetInvokerWithNull() throws RemoteException {
        RIFManager manager = new RIFManager("http://localhost:8080/rif-service");
        assertThrows(NullPointerException.class, () -> manager.getInvoker(null));
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)}
     * @throws RemoteException
     */
    @Test
    void testGetInvokerWithNonInterface() throws RemoteException {
        RIFManager manager = new RIFManager("http://localhost:8080/rif-service");
        assertThrows(IllegalArgumentException.class, () -> manager.getInvoker(String.class));
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)}
     * @throws RemoteException
     */
    @Test
    void testGetInvokerWithNonRIFInterface() throws RemoteException {
        RIFManager manager = new RIFManager("http://localhost:8080/rif-service");
        assertThrows(IllegalArgumentException.class, () -> manager.getInvoker(RIFServiceStub.class));
    }
}
