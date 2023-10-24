// FilePolicyModuleTest.java
package com.browsersoft.aacs.xacml;

import com.browsersoft.aacs.Login;
import com.sun.xacml.AbstractPolicy;
import com.sun.xacml.EvaluationCtx;
import com.sun.xacml.MatchResult;
import com.sun.xacml.ParsingException;
import com.sun.xacml.Policy;
import com.sun.xacml.ctx.Status;
import com.sun.xacml.PolicyReference;
import com.sun.xacml.PolicySet;
import com.sun.xacml.finder.PolicyFinder;
import com.sun.xacml.finder.PolicyFinderModule;
import com.sun.xacml.finder.PolicyFinderResult;
import com.sun.xacml.PolicyMetaData;
import com.sun.xacml.PolicyReference;
import com.sun.xacml.PolicySet;
import com.sun.xacml.VersionConstraints;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import com.sun.xacml.support.finder.PolicyReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilePolicyModule}.
* It contains ten unit test cases for the {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
*/
class FilePolicyModuleTest {

    /**
     * Test of {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
     * It tests the case when the reference is a valid URL.
     */
    @Test
    void testFindPolicy_validURL() {
        FilePolicyModule filePolicyModule = new FilePolicyModule();
        PolicyFinder finder = new PolicyFinder();
        finder.addPolicyFinderModule(filePolicyModule);
        PolicyMetaData metaData = new PolicyMetaData(new com.sun.xacml.ctx.Status(com.sun.xacml.ctx.Status.STATUS_OK, "OK"));
        PolicyFinderResult result = finder.findPolicy(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), PolicyReference.POLICY_REFERENCE, null, metaData);
        assertNotNull(result);
        assertEquals(1, result.getMatches().size());
        assertEquals(PolicyReference.POLICY_REFERENCE, result.getMatches().get(0).getType());
        assertEquals(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), result.getMatches().get(0).getReference());
        assertEquals(1, result.getModules().size());
        assertEquals(filePolicyModule, result.getModules().get(0));
    }

    /**
     * Test of {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
     * It tests the case when the reference is not a valid URL.
     */
    @Test
    void testFindPolicy_invalidURL() {
        FilePolicyModule filePolicyModule = new FilePolicyModule();
        PolicyFinder finder = new PolicyFinder();
        finder.addPolicyFinderModule(filePolicyModule);
        PolicyMetaData metaData = new PolicyMetaData(new com.sun.xacml.ctx.Status(com.sun.xacml.ctx.Status.STATUS_OK, "OK"));
        PolicyFinderResult result = finder.findPolicy(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), PolicyReference.POLICY_REFERENCE, null, metaData);
        assertNotNull(result);
        assertEquals(1, result.getMatches().size());
        assertEquals(PolicyReference.POLICY_REFERENCE, result.getMatches().get(0).getType());
        assertEquals(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), result.getMatches().get(0).getReference());
        assertEquals(1, result.getModules().size());
        assertEquals(filePolicyModule, result.getModules().get(0));
    }

    /**
     * Test of {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
     * It tests the case when the reference is not a valid URL.
     */
    @Test
    void testFindPolicy_invalidURL2() {
        FilePolicyModule filePolicyModule = new FilePolicyModule();
        PolicyFinder finder = new PolicyFinder();
        finder.addPolicyFinderModule(filePolicyModule);
        PolicyMetaData metaData = new PolicyMetaData(new com.sun.xacml.ctx.Status(com.sun.xacml.ctx.Status.STATUS_OK, "OK"));
        PolicyFinderResult result = finder.findPolicy(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), PolicyReference.POLICY_REFERENCE, null, metaData);
        assertNotNull(result);
        assertEquals(1, result.getMatches().size());
        assertEquals(PolicyReference.POLICY_REFERENCE, result.getMatches().get(0).getType());
        assertEquals(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), result.getMatches().get(0).getReference());
        assertEquals(1, result.getModules().size());
        assertEquals(filePolicyModule, result.getModules().get(0));
    }

    /**
     * Test of {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
     * It tests the case when the reference is not a valid URL.
     */
    @Test
    void testFindPolicy_invalidURL3() {
        FilePolicyModule filePolicyModule = new FilePolicyModule();
        PolicyFinder finder = new PolicyFinder();
        finder.addPolicyFinderModule(filePolicyModule);
        PolicyMetaData metaData = new PolicyMetaData(new com.sun.xacml.ctx.Status(com.sun.xacml.ctx.Status.STATUS_OK, "OK"));
        PolicyFinderResult result = finder.findPolicy(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), PolicyReference.POLICY_REFERENCE, null, metaData);
        assertNotNull(result);
        assertEquals(1, result.getMatches().size());
        assertEquals(PolicyReference.POLICY_REFERENCE, result.getMatches().get(0).getType());
        assertEquals(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), result.getMatches().get(0).getReference());
        assertEquals(1, result.getModules().size());
        assertEquals(filePolicyModule, result.getModules().get(0));
    }

    /**
     * Test of {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
     * It tests the case when the reference is not a valid URL.
     */
    @Test
    void testFindPolicy_invalidURL4() {
        FilePolicyModule filePolicyModule = new FilePolicyModule();
        PolicyFinder finder = new PolicyFinder();
        finder.addPolicyFinderModule(filePolicyModule);
        PolicyMetaData metaData = new PolicyMetaData(new com.sun.xacml.ctx.Status(com.sun.xacml.ctx.Status.STATUS_OK, "OK"));
        PolicyFinderResult result = finder.findPolicy(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), PolicyReference.POLICY_REFERENCE, null, metaData);
        assertNotNull(result);
        assertEquals(1, result.getMatches().size());
        assertEquals(PolicyReference.POLICY_REFERENCE, result.getMatches().get(0).getType());
        assertEquals(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), result.getMatches().get(0).getReference());
        assertEquals(1, result.getModules().size());
        assertEquals(filePolicyModule, result.getModules().get(0));
    }

    /**
     * Test of {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
     * It tests the case when the reference is not a valid URL.
     */
    @Test
    void testFindPolicy_invalidURL5() {
        FilePolicyModule filePolicyModule = new FilePolicyModule();
        PolicyFinder finder = new PolicyFinder();
        finder.addPolicyFinderModule(filePolicyModule);
        PolicyMetaData metaData = new PolicyMetaData(new com.sun.xacml.ctx.Status(com.sun.xacml.ctx.Status.STATUS_OK, "OK"));
        PolicyFinderResult result = finder.findPolicy(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), PolicyReference.POLICY_REFERENCE, null, metaData);
        assertNotNull(result);
        assertEquals(1, result.getMatches().size());
        assertEquals(PolicyReference.POLICY_REFERENCE, result.getMatches().get(0).getType());
        assertEquals(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), result.getMatches().get(0).getReference());
        assertEquals(1, result.getModules().size());
        assertEquals(filePolicyModule, result.getModules().get(0));
    }

    /**
     * Test of {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints, PolicyMetaData)} method.
     * It tests the case when the reference is not a valid URL.
     */
    @Test
    void testFindPolicy_invalidURL6() {
        FilePolicyModule filePolicyModule = new FilePolicyModule();
        PolicyFinder finder = new PolicyFinder();
        finder.addPolicyFinderModule(filePolicyModule);
        PolicyMetaData metaData = new PolicyMetaData(new com.sun.xacml.ctx.Status(com.sun.xacml.ctx.Status.STATUS_OK, "OK"));
        PolicyFinderResult result = finder.findPolicy(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), PolicyReference.POLICY_REFERENCE, null, metaData);
        assertNotNull(result);
        assertEquals(1, result.getMatches().size());
        assertEquals(PolicyReference.POLICY_REFERENCE, result.getMatches().get(0).getType());
        assertEquals(URI.create("http://localhost:8080/aacs/authorization/policies/policy.xml"), result.getMatches().get(0).getReference());
        assertEquals(1, result.getModules().size());
        assertEquals(filePolicyModule, result.getModules().get(0));
    }

    /**
     * Test of {@link FilePolicyModule#findPolicy(URI, int, VersionConstraints,