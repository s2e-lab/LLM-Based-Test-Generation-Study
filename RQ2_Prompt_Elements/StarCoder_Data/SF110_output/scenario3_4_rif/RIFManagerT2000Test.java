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
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker does not exist in the cache.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker_new() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        assertNotNull(invoker);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the cache.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker_cached() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFService.class);
        assertEquals(invoker, invoker2);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the cache but the interface is different.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker_cached_differentInterface() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFServiceStub.class);
        assertNotEquals(invoker, invoker2);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the cache but the interface is different.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker_cached_differentInterface_sameName() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFServiceStub.class);
        assertNotEquals(invoker, invoker2);
    }
}
