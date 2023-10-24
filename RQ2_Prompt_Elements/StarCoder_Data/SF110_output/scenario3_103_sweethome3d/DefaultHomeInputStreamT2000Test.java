// DefaultHomeInputStreamTest.java
package com.eteks.sweethome3d.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.URLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultHomeInputStream}.
* It contains ten unit test cases for the {@link DefaultHomeInputStream#readHome()} method.
*/
class DefaultHomeInputStreamTest {

  /**
  * Test method for {@link DefaultHomeInputStream#readHome()}.
  */
  @Test
  void testReadHome() throws IOException, ClassNotFoundException {
    // Create a home
    Home home = new Home();
    home.setName("Home");
    home.setAuthor("Author");
    home.setCreationDate(1000000000000L);
    home.setModificationDate(2000000000000L);
    home.setFurnitureCatalogName("Furniture catalog");
    home.setFurnitureCatalogURL(new URL("http://www.example.com/catalog.xml"));
    home.setFurnitureRentalPeriod(1000000000000L);
    home.setFurnitureRentalCost(1000000000000.0);
    home.setFurnitureReplacementCost(1000000000000.0);
    home.setFurnitureSets(new String[] {"Set 1", "Set 2"});
    home.setFurnitureSetsProperties(new String[] {"Set 1 properties", "Set 2 properties"});
    home.setFurnitureCatalogURLs(new URL[] {new URL("http://www.example.com/catalog1.xml"), new URL("http://www.example.com/catalog2.xml")});
    home.setFurnitureCatalogNames(new String[] {"Catalog 1", "Catalog 2"});
    home.setFurnitureCatalogDates(new long[] {1000000000000L, 2000000000000L});
    home.setFurnitureCatalogFurnitureIds(new int[][] {{1, 2}, {3, 4}});
    home.setFurnitureCatalogFurnitureNames(new String[][] {"Furniture 1", "Furniture 2"});
    home.setFurnitureCatalogFurnitureURLs(new URL[][] {new URL[] {new URL("http://www.example.com/furniture1.xml"), new URL("http://www.example.com/furniture2.xml")}, new URL[] {new URL("http://www.example.com/furniture3.xml"), new URL("http://www.example.com/furniture4.xml")}});
    home.setFurnitureCatalogFurnitureCreationDates(new long[][] {{1000000000000L, 2000000000000L}, {3000000000000L, 4000000000000L}});
    home.setFurnitureCatalogFurnitureModificationDates(new long[][] {{1000000000000L, 2000000000000L}, {3000000000000L, 4000000000000L}});
    home.setFurnitureCatalogFurniturePrices(new double[][] {{1000000000000.0, 2000000000000.0}, {3000000000000.0, 4000000000000.0}});
    home.setFurnitureCatalogFurniturePricesCurrencyCodes(new String[][] {"USD", "EUR"});
    home.setFurnitureCatalogFurniturePricesTaxes(new double[][] {{1000000000000.0, 2000000000000.0}, {3000000000000.0, 4000000000000.0}});
    home.setFurnitureCatalogFurniturePricesTaxesCurrencyCodes(new String[][] {"USD", "EUR"});
    home.setFurnitureCatalogFurniturePricesTaxesDescriptions(new String[][] {"Tax 1", "Tax 2"});
    home.setFurnitureCatalogFurniturePricesTaxesPercentages(new double[][] {{1000000000000.0, 2000000000000.0}, {3000000000000.0, 4000000000000.0}});
    home.setFurnitureCatalogFurniturePricesTaxesPercentagesCurrencyCodes(new String[][] {"USD", "EUR"});
    home.setFurnitureCatalogFurniturePricesTaxesPercentagesDescriptions(new String[][] {"Tax 1", "Tax 2"});
    home.setFurnitureCatalogFurniturePricesTaxesIsAbsolute(new boolean[][] {{true, false}, {true, false}});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncluded(new boolean[][] {{true, false}, {true, false}});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedDescriptions(new String[][] {"Tax 1", "Tax 2"});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentages(new double[][] {{1000000000000.0, 2000000000000.0}, {3000000000000.0, 4000000000000.0}});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesCurrencyCodes(new String[][] {"USD", "EUR"});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesDescriptions(new String[][] {"Tax 1", "Tax 2"});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsAbsolute(new boolean[][] {{true, false}, {true, false}});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncluded(new boolean[][] {{true, false}, {true, false}});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedDescriptions(new String[][] {"Tax 1", "Tax 2"});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentages(new double[][] {{1000000000000.0, 2000000000000.0}, {3000000000000.0, 4000000000000.0}});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesCurrencyCodes(new String[][] {"USD", "EUR"});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesDescriptions(new String[][] {"Tax 1", "Tax 2"});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesIsAbsolute(new boolean[][] {{true, false}, {true, false}});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesIsIncluded(new boolean[][] {{true, false}, {true, false}});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesIsIncludedDescriptions(new String[][] {"Tax 1", "Tax 2"});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesIsIncludedPercentages(new double[][] {{1000000000000.0, 2000000000000.0}, {3000000000000.0, 4000000000000.0}});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesIsIncludedPercentagesCurrencyCodes(new String[][] {"USD", "EUR"});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesIsIncludedPercentagesDescriptions(new String[][] {"Tax 1", "Tax 2"});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesIsIncludedPercentagesIsAbsolute(new boolean[][] {{true, false}, {true, false}});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesIsIncludedPercentagesIsIncluded(new boolean[][] {{true, false}, {true, false}});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesIsIncludedPercentagesIsIncludedDescriptions(new String[][] {"Tax 1", "Tax 2"});
    home.setFurnitureCatalogFurniturePricesTaxesIsIncludedPercentagesIsIncludedPercentagesIsIncludedPercentagesIsIncludedPercentages(new double[][] {{1000000000000.0, 20000