// StringLinkTest.java
package de.beiri22.stringincrementor.relativestring;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringLink}.
* It contains ten unit test cases for the {@link StringLink#toBytes()} method.
*/
class StringLinkTest {

		/**
		* Test of toBytes method, of class StringLink.
		*/
		@Test
		public void testToBytes() {
				System.out.println("toBytes");
				StringLink instance = new StringLink(0, 0, 0);
				byte[] expResult = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				byte[] result = instance.toBytes();
				assertArrayEquals(expResult, result);
		}
		
		/**
		* Test of toBytes method, of class StringLink.
		*/
		@Test
		public void testToBytes2() {
				System.out.println("toBytes");
				StringLink instance = new StringLink(1, 1, 1);
				byte[] expResult = new byte[]{0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1};
				byte[] result = instance.toBytes();
				assertArrayEquals(expResult, result);
		}
		
		/**
		* Test of toBytes method, of class StringLink.
		*/
		@Test
		public void testToBytes3() {
				System.out.println("toBytes");
				StringLink instance = new StringLink(1, 2, 3);
				byte[] expResult = new byte[]{0, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 2};
				byte[] result = instance.toBytes();
				assertArrayEquals(expResult, result);
		}
		
		/**
		* Test of toBytes method, of class StringLink.
		*/
		@Test
		public void testToBytes4() {
				System.out.println("toBytes");
				StringLink instance = new StringLink(2, 1, 3);
				byte[] expResult = new byte[]{0, 0, 0, 3, 0, 0, 0, 2, 0, 0, 0, 1};
				byte[] result = instance.toBytes();
				assertArrayEquals(expResult, result);
		}
		
		/**
		* Test of toBytes method, of class StringLink.
		*/
		@Test
		public void testToBytes5() {
				System.out.println("toBytes");
				StringLink instance = new StringLink(2, 1, 4);
				byte[] expResult = new byte[]{0, 0, 0, 4, 0, 0, 0, 2, 0, 0, 0, 1};
				byte[] result = instance.toBytes();
				assertArrayEquals(expResult, result);
		}
		
		/**
		* Test of toBytes method, of class StringLink.
		*/
		@Test
		public void testToBytes6() {
				System.out.println("toBytes");
				StringLink instance = new StringLink(2, 1, 5);
				byte[] expResult = new byte[]{0, 0, 0, 5, 0, 0, 0, 2, 0, 0, 0, 1};
				byte[] result = instance.toBytes();
				assertArrayEquals(expResult, result);
		}
		
		/**
		* Test of toBytes method, of class StringLink.
		*/
		@Test
		public void testToBytes7() {
				System.out.println("toBytes");
				StringLink instance = new StringLink(2, 1, 6);
				byte[] expResult = new byte[]{0, 0, 0, 6, 0, 0, 0, 2, 0, 0, 0, 1};
				byte[] result = instance.toBytes();
				assertArrayEquals(expResult, result);
		}
		
		/**
		* Test of toBytes method, of class StringLink.
		*/
		@Test
		public void testToBytes8() {
				System.out.println("toBytes");
				StringLink instance = new StringLink(2, 1, 7);
				byte[] expResult = new byte[]{0, 0, 0, 7, 0, 0, 0, 2, 0, 0, 0, 1};
				byte[] result = instance.toBytes();
				assertArrayEquals(expResult, result);
		}
		
		/**
		* Test of toBytes method, of class StringLink.
		*/
		@Test
		public void testToBytes9() {
				System.out.println("toBytes");
				StringLink instance = new StringLink(2, 1, 8);
				byte[] expResult = new byte[]{0, 0, 0, 8, 0, 0, 0, 2, 0, 0, 0, 1};
				byte[] result = instance.toBytes();
				assertArrayEquals(expResult, result);
		}
		
		/**
		* Test of toBytes method, of class StringLink.
		*/
		@Test
		public void testToBytes10() {
				System.out.println("toBytes");
				StringLink instance = new StringLink(2, 1, 9);
				byte[] expResult = new byte[]{0, 0, 0, 9, 0, 0, 0, 2, 0, 0, 0, 1};
				byte[] result = instance.toBytes();
				assertArrayEquals(expResult, result);
		}
		
}

// StringLinkList.java
/*
 * StringLinkList.java
 *
 * Created on 01.11.2007, 14:14:01
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.beiri22.stringincrementor.relativestring;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Rico
 */
public class StringLinkList {

    private List<StringLink> list;

    public StringLinkList() {
        list = new ArrayList<StringLink>();
    }

    public StringLinkList(byte[] data) {
        list = new ArrayList<StringLink>();
        DataInputStream iis = null;
        try {
            ByteArrayInputStream bos = new ByteArrayInputStream(data);
            iis = new DataInputStream(bos);
            int size = iis.readInt();
            for (int i = 0; i < size; i++) {
                int len = iis.readInt();
                int posOrig = iis.readInt();
                int posNew = iis.readInt();
                list.add(new StringLink(posOrig, posNew, len));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                iis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void add(StringLink link) {
        list.add(link);
    }

    public List<StringLink> getList() {
        return list;
    }

    public byte[] toBytes() {
        DataOutputStream oos = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream(list.size() * 12 + 4);
            oos = new DataOutputStream(bos);
            oos.writeInt(list.size());
            for (StringLink link : list) {
                oos.writeInt(link.getLen());
                oos.writeInt(link.getPosOrig());
                oos.writeInt(link.getPosNew());
            }
            oos.flush();
            return