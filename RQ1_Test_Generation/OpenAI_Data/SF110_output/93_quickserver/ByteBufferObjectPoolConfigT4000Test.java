// ByteBufferObjectPoolConfigTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferObjectPoolConfig}.
* It contains ten unit test cases for the {@link ByteBufferObjectPoolConfig#toXML(String)} method.
*/
class ByteBufferObjectPoolConfigTest {

	@Test
	void testToXML() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<byte-buffer-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActive() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		String xml = config.toXML("\t");
		assertEquals("\t<byte-buffer-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxIdle() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxIdle(5);
		String xml = config.toXML("\t");
		assertEquals("\t<byte-buffer-object-pool>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndInitSize() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<byte-buffer-object-pool>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdle() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		String xml = config.toXML("\t");
		assertEquals("\t<byte-buffer-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndInitSize() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<byte-buffer-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxIdleAndInitSize() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<byte-buffer-object-pool>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdleAndInitSize() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<byte-buffer-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdleAndInitSizeAndNullPad() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML(null);
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdleAndInitSizeAndEmptyPad() {
		ByteBufferObjectPoolConfig config = new ByteBufferObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<byte-buffer-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</byte-buffer-object-pool>\n", xml);
	}
	
}

// PoolConfig.java
/*
 * This file is part of the QuickServer library 
 * Copyright (C) QuickServer.org
 *
 * Use, modification, copying and distribution of this software is subject to
 * the terms and conditions of the GNU Lesser General Public License. 
 * You should have received a copy of the GNU LGP License along with this 
 * library; if not, you can download a copy from <http://www.quickserver.org/>.
 *
 * For questions, suggestions, bug-reports, enhancement-requests etc.
 * visit http://www.quickserver.org
 *
 */
package org.quickserver.util.xmlreader;

/**
 * This class encapsulate the pool configuration.
 * @author Akshathkumar Shetty
 * @since 1.3
 */
public class PoolConfig {
    private int maxActive = -1;
    private int maxIdle = -1;
    private int initSize = -1;

    public PoolConfig() {
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getInitSize() {
        return initSize;
    }

    public void setInitSize(int initSize) {
        this.initSize = initSize;
    }
}

// PoolConfigTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PoolConfig}.
* It contains ten unit test cases for the {@link PoolConfig#toXML(String)} method.
*/
class PoolConfigTest {
		
	@Test
	void testToXML() {
		PoolConfig config = new PoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("");
		assertEquals("<pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		PoolConfig config = new PoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActive() {
		PoolConfig config = new PoolConfig();
		config.setMaxActive(10);
		String xml = config.toXML("\t");
		assertEquals("\t<pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t</pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxIdle() {
		PoolConfig config = new PoolConfig();
		config.setMaxIdle(5);
		String xml = config.toXML("\t");
		assertEquals("\t<pool>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t</pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndInitSize() {
		PoolConfig config = new PoolConfig();
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<pool>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdle() {
		PoolConfig config = new PoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		String xml = config.toXML("\t");
		assertEquals("\t<pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t</pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndInitSize() {
		PoolConfig config = new PoolConfig();
		config.setMaxActive(10);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxIdleAndInitSize() {
		PoolConfig config = new PoolConfig();
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<pool>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdleAndInitSize() {
		PoolConfig config = new PoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdleAndInitSizeAndNullPad() {
		PoolConfig config = new PoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML(null);
		assertEquals("<pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
			