// MediaWiki_0Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains ten unit test cases for the {@link MediaWiki#getCharset()} method.
*/
class MediaWiki_0Test {

		/**
		 * Test method for {@link MediaWiki#getCharset()}.
		 */
		@Test
		void testGetCharset() {
				assertEquals("UTF-8", MediaWiki.getCharset());
		}
		
		/**
		 * Test method for {@link MediaWiki#encode(String)}.
		 * @throws UnsupportedEncodingException 
		 */
		@Test
		void testEncode() throws UnsupportedEncodingException {
				assertEquals(URLEncoder.encode(" ", MediaWiki.getCharset()), MediaWiki.encode(" "));
		}
		
		/**
		 * Test method for {@link MediaWiki#decode(String)}.
		 */
		@Test
		void testDecode() {
				assertEquals(" ", MediaWiki.decode(" "));
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_MAIN}.
		 */
		@Test
		void testNS_MAIN() {
				assertEquals(0, MediaWiki.NS_MAIN);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_MAIN_TALK}.
		 */
		@Test
		void testNS_MAIN_TALK() {
				assertEquals(1, MediaWiki.NS_MAIN_TALK);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_USER}.
		 */
		@Test
		void testNS_USER() {
				assertEquals(2, MediaWiki.NS_USER);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_USER_TALK}.
		 */
		@Test
		void testNS_USER_TALK() {
				assertEquals(3, MediaWiki.NS_USER_TALK);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_META}.
		 */
		@Test
		void testNS_META() {
				assertEquals(4, MediaWiki.NS_META);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_META_TALK}.
		 */
		@Test
		void testNS_META_TALK() {
				assertEquals(5, MediaWiki.NS_META_TALK);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_IMAGES}.
		 */
		@Test
		void testNS_IMAGES() {
				assertEquals(6, MediaWiki.NS_IMAGES);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_IMAGES_TALK}.
		 */
		@Test
		void testNS_IMAGES_TALK() {
				assertEquals(7, MediaWiki.NS_IMAGES_TALK);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_MEDIAWIKI}.
		 */
		@Test
		void testNS_MEDIAWIKI() {
				assertEquals(8, MediaWiki.NS_MEDIAWIKI);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_MEDIAWIKI_TALK}.
		 */
		@Test
		void testNS_MEDIAWIKI_TALK() {
				assertEquals(9, MediaWiki.NS_MEDIAWIKI_TALK);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_TEMPLATE}.
		 */
		@Test
		void testNS_TEMPLATE() {
				assertEquals(10, MediaWiki.NS_TEMPLATE);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_TEMPLATE_TALK}.
		 */
		@Test
		void testNS_TEMPLATE_TALK() {
				assertEquals(11, MediaWiki.NS_TEMPLATE_TALK);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_HELP}.
		 */
		@Test
		void testNS_HELP() {
				assertEquals(12, MediaWiki.NS_HELP);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_HELP_TALK}.
		 */
		@Test
		void testNS_HELP_TALK() {
				assertEquals(13, MediaWiki.NS_HELP_TALK);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_CATEGORY}.
		 */
		@Test
		void testNS_CATEGORY() {
				assertEquals(14, MediaWiki.NS_CATEGORY);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_CATEGORY_TALK}.
		 */
		@Test
		void testNS_CATEGORY_TALK() {
				assertEquals(15, MediaWiki.NS_CATEGORY_TALK);
		}
		
		/**
		 * Test method for {@link MediaWiki#NS_ALL}.
		 */
		@Test
		void testNS_ALL() {
				assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, MediaWiki.NS_ALL);
		}
		
		/**
		 * Test method for {@link MediaWiki#BOT_GROUPS}.
		 */
		@Test
		void testBOT_GROUPS() {
				Set<String> set = new HashSet<String>();
				set.add("bot");
				assertEquals(set, MediaWiki.BOT_GROUPS);
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#MW1_09}.
		 */
		@Test
		void testVersionMW1_09() {
				assertEquals("1.09", MediaWiki.Version.MW1_09.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#MW1_10}.
		 */
		@Test
		void testVersionMW1_10() {
				assertEquals("1.10", MediaWiki.Version.MW1_10.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#MW1_11}.
		 */
		@Test
		void testVersionMW1_11() {
				assertEquals("1.11", MediaWiki.Version.MW1_11.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#MW1_12}.
		 */
		@Test
		void testVersionMW1_12() {
				assertEquals("1.12", MediaWiki.Version.MW1_12.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#MW1_13}.
		 */
		@Test
		void testVersionMW1_13() {
				assertEquals("1.13", MediaWiki.Version.MW1_13.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#MW1_14}.
		 */
		@Test
		void testVersionMW1_14() {
				assertEquals("1.14", MediaWiki.Version.MW1_14.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#MW1_15}.
		 */
		@Test
		void testVersionMW1_15() {
				assertEquals("1.15", MediaWiki.Version.MW1_15.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#MW1_16}.
		 */
		@Test
		void testVersionMW1_16() {
				assertEquals("1.16", MediaWiki.Version.MW1_16.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#MW1_17}.
		 */
		@Test
		void testVersionMW1_17() {
				assertEquals("1.17", MediaWiki.Version.MW1_17.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#MW1_18}.
		 */
		@Test
		void testVersionMW1_18() {
				assertEquals("1.18", MediaWiki.Version.MW1_18.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#UNKNOWN}.
		 */
		@Test
		void testVersionUNKNOWN() {
				assertEquals("UNKNOWN", MediaWiki.Version.UNKNOWN.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#DEVELOPMENT}.
		 */
		@Test
		void testVersionDEVELOPMENT() {
				assertEquals("DEVELOPMENT", MediaWiki.Version.DEVELOPMENT.getNumber());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#getLatest()}.
		 */
		@Test
		void testVersionGetLatest() {
				assertEquals(MediaWiki.Version.MW1_18, MediaWiki.Version.getLatest());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#getLast()}.
		 */
		@Test
		void testVersionGetLast() {
				assertEquals(MediaWiki.Version.MW1_18, MediaWiki.Version.getLast());
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#greaterEqThen(Version)}.
		 */
		@Test
		void testVersionGreaterEqThen() {
				assertTrue(MediaWiki.Version.MW1_18.greaterEqThen(MediaWiki.Version.MW1_17));
		}
		
		/**
		 * Test method for {@link MediaWiki#Version#valuesStable()}.
		 */
		@Test
		void testVersionValuesStable() {
				assertArrayEquals(new MediaWiki.Version[] {MediaWiki.Version.MW1_15, MediaWiki.Version.MW1_16, MediaWiki.Version.MW1_17, MediaWiki.Version.MW1_18}, MediaWiki.Version.valuesStable());
		}
}

// MediaWiki.java
/*
 * Copyright 2007 Thomas Stock.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * Contributors:
 * Carlos Valenzuela
 */
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Thomas Stock
 */
public final class MediaWiki {

    /**
     * @deprecated use {@link #NS_MAIN} instead. Wrong value.
     */
    @Deprecated
    public static final int ARTICLE = 1 << 1;

    /**
     * @deprecated use {@link #NS_MAIN} instead. Wrong value.
     */
    @Deprecated
    public static final int MEDIA = 1 << 2;

    /**
     * @deprecated use {@link #NS_CATEGORY} instead.
     */
    @Deprecated
    public static final int SUBCATEGORY = 1 << 3;

    static final String CHARSET = "UTF-8";

    public static final int NS_MAIN = 0;

    public static final int NS_MAIN_TALK = 1;

    public static final int NS_USER = 2;

    public static final int NS_USER_TALK = 3;

    public static final int NS_META = 4;

    public static final int NS_META_TALK = 5;

    public static final int NS_IMAGES = 6;

    public static final int NS_IMAGES_TALK = 7;

    public static final int NS_MEDIAWIKI = 8;

    public static final int NS_MEDIAWIKI_TALK = 9;

    public static final int NS_TEMPLATE = 10;

    public static final int NS_TEMPLATE_TALK = 11;

    public static final int NS_HELP = 12;

    public static final int NS_HELP_TALK = 13;

    public static final int NS_CATEGORY = 14;

    public static final int NS_CATEGORY_TALK = 15;

    public static final int[] NS_ALL = { NS_MAIN, NS_MAIN_TALK, NS_USER, NS_USER_TALK, NS_META, NS_META_TALK, NS_IMAGES, NS_IMAGES_TALK, NS_MEDIAWIKI, NS_MEDIAWIKI_TALK, NS_TEMPLATE, NS_TEMPLATE_TALK, NS_HELP, NS_HELP_TALK, NS_CATEGORY, NS_CATEGORY_TALK };

    public static final Set<String> BOT_GROUPS = new HashSet<String>();

    static {
        BOT_GROUPS.add("bot");
    }

    /**
     * Representaion of MediaWiki version.
     *
     * @author Thomas Stock
     */
    public enum Version {

        /**
         * @deprecated requires PHP 5.2 expired 2011-01-06
         */
        MW1_09,
        /**
         * @deprecated requires PHP 5.2 expired 2011-01-06
         */
        MW1_10,
        /**
         * @deprecated requires PHP 5.2 expired 2011-01-06
         */
        MW1_11,
        /**
         * @deprecated requires PHP 5.2 expired 2011-01-06
         */
        MW1_12,
        /**
         * Released 2008-08
         *
         * @deprecated requires PHP 5.2 expired 2011-01-06; is installable but
         *             doesn't work
         */
        MW1_13,
        /**
         * Released 2009-02
         *
         * @deprecated database installer doesn't work anymore
         */
        MW1_14,
        /**
         * Released 2009-06
         */