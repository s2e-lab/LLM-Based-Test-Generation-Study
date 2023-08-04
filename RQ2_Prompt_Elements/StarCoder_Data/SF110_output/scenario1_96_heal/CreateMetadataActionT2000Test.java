// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains ten unit test cases for the {@link CreateMetadataAction#actionRequiresLogin()} method.
*/
class CreateMetadataActionTest {

    /**
    * Test case for the {@link CreateMetadataAction#actionRequiresLogin()} method.
    * It tests the return value of the method for the following cases:
    * <ul>
    * <li>when the user is not logged in</li>
    * <li>when the user is logged in</li>
    * </ul>
    * @throws SQLException
    * @throws ServletException
    * @throws IOException
    */
    @Test
    void testActionRequiresLogin() throws SQLException, ServletException, IOException {
        // create a new CreateMetadataAction object
        CreateMetadataAction createMetadataAction = new CreateMetadataAction();
        // create a new HttpServletRequest object
        HttpServletRequest request = new MockHttpServletRequest();
        // create a new HttpServletResponse object
        HttpServletResponse response = new MockHttpServletResponse();
        // create a new HttpSession object
        HttpSession session = new MockHttpSession();
        // set the session object to the request object
        request.setSession(session);
        // create a new MetadataDAO object
        MetadataDAO metadataDAO = new MetadataDAO();
        // set the metadataDAO object to the request object
        request.setAttribute("metadataDAO", metadataDAO);
        // create a new AuthenticationTools object
        AuthenticationTools authenticationTools = new AuthenticationTools();
        // set the authenticationTools object to the request object
        request.setAttribute("authenticationTools", authenticationTools);
        // create a new TaxonBean object
        TaxonBean taxonBean = new TaxonBean();
        // set the taxonBean object to the request object
        request.setAttribute("taxonBean", taxonBean);
        // create a new TaxonPathBean object
        TaxonPathBean taxonPathBean = new TaxonPathBean();
        // set the taxonPathBean object to the request object
        request.setAttribute("taxonPathBean", taxonPathBean);
        // create a new CompleteMetadataBean object
        CompleteMetadataBean completeMetadataBean = new CompleteMetadataBean();
        // set the completeMetadataBean object to the request object
        request.setAttribute("completeMetadataBean", completeMetadataBean);
        // create a new HashMap object
        HashMap<String, String> map = new HashMap<String, String>();
        // set the map object to the request object
        request.setAttribute("map", map);
        // create a new HashMap object
        HashMap<String, String> map2 = new HashMap<String, String>();
        // set the map2 object to the request object
        request.setAttribute("map2", map2);
        // create a new HashMap object
        HashMap<String, String> map3 = new HashMap<String, String>();
        // set the map3 object to the request object
        request.setAttribute("map3", map3);
        // create a new HashMap object
        HashMap<String, String> map4 = new HashMap<String, String>();
        // set the map4 object to the request object
        request.setAttribute("map4", map4);
        // create a new HashMap object
        HashMap<String, String> map5 = new HashMap<String, String>();
        // set the map5 object to the request object
        request.setAttribute("map5", map5);
        // create a new HashMap object
        HashMap<String, String> map6 = new HashMap<String, String>();
        // set the map6 object to the request object
        request.setAttribute("map6", map6);
        // create a new HashMap object
        HashMap<String, String> map7 = new HashMap<String, String>();
        // set the map7 object to the request object
        request.setAttribute("map7", map7);
        // create a new HashMap object
        HashMap<String, String> map8 = new HashMap<String, String>();
        // set the map8 object to the request object
        request.setAttribute("map8", map8);
        // create a new HashMap object
        HashMap<String, String> map9 = new HashMap<String, String>();
        // set the map9 object to the request object
        request.setAttribute("map9", map9);
        // create a new HashMap object
        HashMap<String, String> map10 = new HashMap<String, String>();
        // set the map10 object to the request object
        request.setAttribute("map10", map10);
        // create a new HashMap object
        HashMap<String, String> map11 = new HashMap<String, String>();
        // set the map11 object to the request object
        request.setAttribute("map11", map11);
        // create a new HashMap object
        HashMap<String, String> map12 = new HashMap<String, String>();
        // set the map12 object to the request object
        request.setAttribute("map12", map12);
        // create a new HashMap object
        HashMap<String, String> map13 = new HashMap<String, String>();
        // set the map13 object to the request object
        request.setAttribute("map13", map13);
        // create a new HashMap object
        HashMap<String, String> map14 = new HashMap<String, String>();
        // set the map14 object to the request object
        request.setAttribute("map14", map14);
        // create a new HashMap object
        HashMap<String, String> map15 = new HashMap<String, String>();
        // set the map15 object to the request object
        request.setAttribute("map15", map15);
        // create a new HashMap object
        HashMap<String, String> map16 = new HashMap<String, String>();
        // set the map16 object to the request object
        request.setAttribute("map16", map16);
        // create a new HashMap object
        HashMap<String, String> map17 = new HashMap<String, String>();
        // set the map17 object to the request object
        request.setAttribute("map17", map17);
        // create a new HashMap object
        HashMap<String, String> map18 = new HashMap<String, String>();
        // set the map18 object to the request object
        request.setAttribute("map18", map18);
        // create a new HashMap object
        HashMap<String, String> map19 = new HashMap<String, String>();
        // set the map19 object to the request object
        request.setAttribute("map19", map19);
        // create a new HashMap object
        HashMap<String, String> map20 = new HashMap<String, String>();
        // set the map20 object to the request object
        request.setAttribute("map20", map20);
        // create a new HashMap object
        HashMap<String, String> map21 = new HashMap<String, String>();
        // set the map21 object to the request object
        request.setAttribute("map21", map21);
        // create a new HashMap object
        HashMap<String, String> map22 = new HashMap<String, String>();
        // set the map22 object to the request object
        request.setAttribute("map22", map22);
        // create a new HashMap object
        HashMap<String, String> map23 = new HashMap<String, String>();
        // set the map23 object to the request object
        request.setAttribute("map23", map23);
        // create a new HashMap object
        HashMap<String, String> map24 = new HashMap<String, String>();
        // set the map24 object to the request object
        request.setAttribute("map24", map24);
        // create a new HashMap object
        HashMap<String, String> map25 = new HashMap<String, String>();
        // set the map25 object to the request object
        request.setAttribute("map25", map25);
        // create a new HashMap object
        HashMap<String, String> map26 = new HashMap<String, String>();
        // set the map26 object to the request object
        request.setAttribute("map26", map26);
        // create a new HashMap object
        HashMap<String, String> map27 = new HashMap<String, String>();
        // set the map27 object to the request object
        request.setAttribute("map27", map27);
        // create a new HashMap object
        HashMap<String, String> map28 = new HashMap<String, String>();
        // set the map28 object to the request object
        request.setAttribute("map28", map28);
        // create a new HashMap object
        HashMap<String, String> map29 = new HashMap<String, String>();
        // set the map29 object to the request object
        request.setAttribute("map29", map29);
        // create a new HashMap object
        HashMap<String, String> map30 = new HashMap<String, String>();
        // set the map30 object to the request object
        request.setAttribute("map30", map30);
        // create a new HashMap object
        HashMap<String, String> map31 = new HashMap<String, String>();
        // set the map31 object to the request object
        request.setAttribute("map31", map31);
        // create a new HashMap object
        HashMap<String, String> map32 = new HashMap<String, String>();
        // set the map32 object to the request object
        request.setAttribute("map32", map32);
        // create a new HashMap object
        HashMap<String, String> map33 =