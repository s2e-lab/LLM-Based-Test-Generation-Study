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
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9C2UWW5NVWG", "lite", "1", "open");
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
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9C2UWW5NVWG", "lite", "1", "closed");
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
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9C2UWW5NVWG", "lite", "2", "open");
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
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9C2UWW5NVWG", "lite", "2", "closed");
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
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9C2UWW5NVWG", "lite", "3", "open");
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
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9C2UWW5NVWG", "lite", "3", "closed");
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
				SellerSearch sellerDetails = new SellerSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9C2UWW5NVWG", "lite", "4", "open");
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
		void testThirdParty_8() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
				SellerSearch sellerDetails = new SellerSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9C2UWW5NVWG", "lite", "4", "closed");
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
		void testThirdParty_9() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
				SellerSearch sellerDetails = new SellerSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9C2UWW5NVWG", "lite", "5", "open");
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
		void testThirdParty_10() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
				SellerSearch sellerDetails = new SellerSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9C2UWW5NVWG", "lite", "5", "closed");
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
		void testThirdParty_11() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
				SellerSearch sellerDetails = new SellerSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchThirdPartySearchFile("A1K9C2UWW5NVWG", "lite", "6", "open");
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
}

// Search_12Test.java
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
* It contains twelve unit test cases for the {@link Search#Blended(String, String)} method.
*/
class Search_12Test {
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
		*
		* @throws Exception
		*/
		@Test
		void testBlended_1() throws Exception {
				FileUtil fileUtil = new FileUtil();
				JOXBeanInputStream joxIn = null;
				BlendedSearch testBean = new BlendedSearch();
				try {
						FileInputStream fileIn = fileUtil.fetchBlendedSearchFile("harry potter", "books");
						if (fileIn != null) {
								joxIn = new JOXBeanInputStream(fileIn);
								testBean = (BlendedSearch) joxIn.readObject(BlendedSearch.class);
						} else {
								testBean = null;
						}
				} catch (Exception exc) {
						exc.printStackTrace();
				}
				assertNotNull(testBean);
		}
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
