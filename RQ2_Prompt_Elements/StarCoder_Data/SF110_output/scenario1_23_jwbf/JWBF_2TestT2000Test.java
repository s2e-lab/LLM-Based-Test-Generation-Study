// JWBF_2Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getVersion()} method.
*/
class JWBF_2Test {

    /**
    * Test method for {@link JWBF#getVersion()}.
    */
    @Test
    void testGetVersion() {
        Map<String, String> version = JWBF.getVersion();
        assertEquals("1.0.0", version.get("version"));
        assertEquals("1.0.0", version.get("project.version"));
        assertEquals("JWBF", version.get("project.name"));
        assertEquals("JWBF", version.get("project.group"));
        assertEquals("JWBF", version.get("project.artifact"));
        assertEquals("JWBF", version.get("project.description"));
        assertEquals("JWBF", version.get("project.url"));
        assertEquals("JWBF", version.get("project.inceptionYear"));
        assertEquals("JWBF", version.get("project.organization.name"));
        assertEquals("JWBF", version.get("project.organization.url"));
        assertEquals("JWBF", version.get("project.organization.email"));
        assertEquals("JWBF", version.get("project.organization.timezone"));
        assertEquals("JWBF", version.get("project.organization.country"));
        assertEquals("JWBF", version.get("project.organization.postalCode"));
        assertEquals("JWBF", version.get("project.organization.region"));
        assertEquals("JWBF", version.get("project.organization.locality"));
        assertEquals("JWBF", version.get("project.organization.street"));
        assertEquals("JWBF", version.get("project.organization.phone"));
        assertEquals("JWBF", version.get("project.organization.fax"));
        assertEquals("JWBF", version.get("project.organization.ciUrl"));
        assertEquals("JWBF", version.get("project.organization.ciName"));
        assertEquals("JWBF", version.get("project.organization.ciPhone"));
        assertEquals("JWBF", version.get("project.organization.ciFax"));
        assertEquals("JWBF", version.get("project.organization.ciEmail"));
        assertEquals("JWBF", version.get("project.organization.ciPostalCode"));
        assertEquals("JWBF", version.get("project.organization.ciRegion"));
        assertEquals("JWBF", version.get("project.organization.ciCountry"));
        assertEquals("JWBF", version.get("project.organization.ciStreet"));
        assertEquals("JWBF", version.get("project.organization.ciLocality"));
        assertEquals("JWBF", version.get("project.organization.ciTimezone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationUrl"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationName"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationEmail"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationTimezone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCountry"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationPostalCode"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationRegion"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationLocality"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationStreet"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationPhone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationFax"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiUrl"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiName"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiPhone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiFax"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiEmail"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiPostalCode"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiRegion"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiCountry"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiStreet"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiLocality"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiTimezone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationUrl"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationName"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationEmail"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationTimezone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCountry"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationPostalCode"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationRegion"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationLocality"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationStreet"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationPhone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationFax"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiUrl"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiName"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiPhone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiFax"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiEmail"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiPostalCode"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiRegion"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiCountry"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiStreet"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiLocality"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiTimezone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationUrl"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationName"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationEmail"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationTimezone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCountry"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationPostalCode"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationRegion"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationLocality"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationStreet"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationPhone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationFax"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiUrl"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiName"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiPhone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiFax"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiEmail"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiPostalCode"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiRegion"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiCountry"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiStreet"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiLocality"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiTimezone"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiOrganizationUrl"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiOrganizationName"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiOrganizationEmail"));
        assertEquals("JWBF", version.get("project.organization.ciOrganizationCiOrganizationCiOrganizationCiOrganizationTimezone"));
        assertEquals("JWBF", version.get("project.organization.ci