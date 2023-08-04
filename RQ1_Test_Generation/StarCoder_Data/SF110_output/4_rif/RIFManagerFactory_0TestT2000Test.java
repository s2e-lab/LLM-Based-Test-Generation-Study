// RIFManagerFactory_0Test.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains ten unit test cases for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactory_0Test {

    /**
    * Test method for {@link RIFManagerFactory#getInstance()}.
    * @throws RemoteException
    */
    @Test
    void testGetInstance() throws RemoteException {
        RIFManagerFactory.getInstance();
    }
}

// RIFManagerFactory_1Test.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains ten unit test cases for the {@link RIFManagerFactory#getManager(String)} method.
*/
class RIFManagerFactory_1Test {
		
    /**
    * Test method for {@link RIFManagerFactory#getManager(String)}.
    * @throws RemoteException
    */
    @Test
    void testGetManager() throws RemoteException {
        RIFManagerFactory.getInstance().getManager("http://localhost:8080");
    }
}

// RIFManagerFactory_2Test.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains ten unit test cases for the {@link RIFManagerFactory#getInvoker(String, Class)} method.
*/
class RIFManagerFactory_2Test {
		
    /**
    * Test method for {@link RIFManagerFactory#getInvoker(String, Class)}.
    * @throws RemoteException
    */
    @Test
    void testGetInvoker() throws RemoteException {
        RIFManagerFactory.getInstance().getInvoker("http://localhost:8080", RIFManager.class);
    }
}

// RIFManagerFactory_3Test.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains ten unit test cases for the {@link RIFManagerFactory#getImpl(String, Class)} method.
*/
class RIFManagerFactory_3Test {
		
    /**
    * Test method for {@link RIFManagerFactory#getImpl(String, Class)}.
    * @throws RemoteException
    */
    @Test
    void testGetImpl() throws RemoteException {
        RIFManagerFactory.getInstance().getImpl("http://localhost:8080", RIFManager.class);
    }
}
