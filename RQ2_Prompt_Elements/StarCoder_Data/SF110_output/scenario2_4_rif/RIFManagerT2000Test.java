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
     * It tests the case where the RIFInvoker does not exist in the map.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        assertNotNull(invoker);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the map.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker2() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFService.class);
        assertEquals(invoker, invoker2);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the map.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker3() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFServiceStub.class);
        assertNotEquals(invoker, invoker2);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the map.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker4() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFService.class);
        assertEquals(invoker, invoker2);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the map.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker5() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFService.class);
        assertEquals(invoker, invoker2);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the map.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker6() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFService.class);
        assertEquals(invoker, invoker2);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the map.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker7() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFService.class);
        assertEquals(invoker, invoker2);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the map.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker8() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFService.class);
        assertEquals(invoker, invoker2);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the map.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker9() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFService.class);
        assertEquals(invoker, invoker2);
    }

    /**
     * Test case for {@link RIFManager#getInvoker(Class)} method.
     * It tests the case where the RIFInvoker exists in the map.
     *
     * @throws RemoteException
     */
    @Test
    void testGetInvoker10() throws RemoteException {
        RIFManager manager = new RIFManager();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFService.class);
        assertEquals(invoker, invoker2);
    }
}
