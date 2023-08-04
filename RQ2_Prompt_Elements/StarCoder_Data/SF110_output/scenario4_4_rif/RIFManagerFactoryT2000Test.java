// RIFManagerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains ten unit test cases for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactoryTest {

    /**
     * Test case for {@link RIFManagerFactory#getInstance()}
     * @throws RemoteException
     */
    @Test
    void testGetInstance() throws RemoteException {
        RIFManagerFactory.getInstance();
    }

    /**
     * Test case for {@link RIFManagerFactory#getManager(String)}
     * @throws RemoteException
     */
    @Test
    void testGetManager() throws RemoteException {
        RIFManagerFactory.getManager("http://localhost:8080");
    }

    /**
     * Test case for {@link RIFManagerFactory#getInvoker(Class)}
     * @throws RemoteException
     */
    @Test
    void testGetInvoker() throws RemoteException {
        RIFManagerFactory.getInvoker("http://localhost:8080", RIFManager.class);
    }

    /**
     * Test case for {@link RIFManagerFactory#getImpl(Class)}
     * @throws RemoteException
     */
    @Test
    void testGetImpl() throws RemoteException {
        RIFManagerFactory.getImpl("http://localhost:8080", RIFManager.class);
    }
}
