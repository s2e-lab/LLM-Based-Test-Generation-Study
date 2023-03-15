// Search_11Test.java
package net.kencochrane.a4j.DAO;

import com.wutka.jox.JOXBeanInputStream;
import net.kencochrane.a4j.beans.BlendedSearch;
import net.kencochrane.a4j.beans.ProductInfo;
import net.kencochrane.a4j.beans.SellerSearch;
import net.kencochrane.a4j.file.FileUtil;
import java.io.FileInputStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#ThirdParty(String, String, String, String)} method.
*/
class Search_11Test {
/**
		* Test case for the {@link Search#ThirdParty(String, String, String, String)} method.
		*
		* @throws Exception
		*/
		@Test
		void testThirdParty_1() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
				SellerSearch sellerDetails = new SellerSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9CX7YB5Y4ZM", "lite", "1", "open");
						if (fileIn != null) {
								joxIn = new JOXBeanInputStream(fileIn);
								sellerDetails = (SellerSearch) joxIn.readObject(SellerSearch.class);
						} else {
								sellerDetails = null;
						}
				} catch (Exception exc) {
						exc.printStackTrace();
				}
				assertNotNull(sellerDetails);
		}
		/**
		* Test case for the {@link Search#ThirdParty(String, String, String, String)} method.
		*
		* @throws Exception
		*/
		@Test
		void testThirdParty_2() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
				SellerSearch sellerDetails = new SellerSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9CX7YB5Y4ZM", "lite", "1", "closed");
						if (fileIn != null) {
								joxIn = new JOXBeanInputStream(fileIn);
								sellerDetails = (SellerSearch) joxIn.readObject(SellerSearch.class);
						} else {
								sellerDetails = null;
						}
				} catch (Exception exc) {
						exc.printStackTrace();
				}
				assertNotNull(sellerDetails);
		}
		/**
		* Test case for the {@link Search#ThirdParty(String, String, String, String)} method.
		*
		* @throws Exception
		*/
		@Test
		void testThirdParty_3() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
				SellerSearch sellerDetails = new SellerSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9CX7YB5Y4ZM", "lite", "2", "open");
						if (fileIn != null) {
								joxIn = new JOXBeanInputStream(fileIn);
								sellerDetails = (SellerSearch) joxIn.readObject(SellerSearch.class);
						} else {
								sellerDetails = null;
						}
				} catch (Exception exc) {
						exc.printStackTrace();
				}
				assertNotNull(sellerDetails);
		}
		/**
		* Test case for the {@link Search#ThirdParty(String, String, String, String)} method.
		*
		* @throws Exception
		*/
		@Test
		void testThirdParty_4() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
				SellerSearch sellerDetails = new SellerSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9CX7YB5Y4ZM", "lite", "2", "closed");
						if (fileIn != null) {
								joxIn = new JOXBeanInputStream(fileIn);
								sellerDetails = (SellerSearch) joxIn.readObject(SellerSearch.class);
						} else {
								sellerDetails = null;
						}
				} catch (Exception exc) {
						exc.printStackTrace();
				}
				assertNotNull(sellerDetails);
		}
		/**
		* Test case for the {@link Search#ThirdParty(String, String, String, String)} method.
		*
		* @throws Exception
		*/
		@Test
		void testThirdParty_5() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
				SellerSearch sellerDetails = new SellerSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9CX7YB5Y4ZM", "lite", "3", "open");
						if (fileIn != null) {
								joxIn = new JOXBeanInputStream(fileIn);
								sellerDetails = (SellerSearch) joxIn.readObject(SellerSearch.class);
						} else {
								sellerDetails = null;
						}
				} catch (Exception exc) {
						exc.printStackTrace();
				}
				assertNotNull(sellerDetails);
		}
		/**
		* Test case for the {@link Search#ThirdParty(String, String, String, String)} method.
		*
		* @throws Exception
		*/
		@Test
		void testThirdParty_6() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
				SellerSearch sellerDetails = new SellerSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9CX7YB5Y4ZM", "lite", "3", "closed");
						if (fileIn != null) {
								joxIn = new JOXBeanInputStream(fileIn);
								sellerDetails = (SellerSearch) joxIn.readObject(SellerSearch.class);
						} else {
								sellerDetails = null;
						}
				} catch (Exception exc) {
						exc.printStackTrace();
				}
				assertNotNull(sellerDetails);
		}
		/**
		* Test case for the {@link Search#ThirdParty(String, String, String, String)} method.
		*
		* @throws Exception
		*/
		@Test
		void testThirdParty_7() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
		