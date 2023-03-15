// ThreadObjectPoolConfigTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ThreadObjectPoolConfig}.
* It contains ten unit test cases for the {@link ThreadObjectPoolConfig#toXML(String)} method.
*/
class ThreadObjectPoolConfigTest {

	@Test
	void testToXML() {
		ThreadObjectPoolConfig config = new ThreadObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML(null);
		assertEquals("<thread-object-pool>\n" +
				"\t<max-active>10</max-active>\n" +
				"\t<max-idle>5</max-idle>\n" +
				"\t<init-size>2</init-size>\n" +
				"</thread-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPad() {
		ThreadObjectPoolConfig config = new ThreadObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<thread-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</thread-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActive() {
		ThreadObjectPoolConfig config = new ThreadObjectPoolConfig();
		config.setMaxActive(10);
		String xml = config.toXML("\t");
		assertEquals("\t<thread-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t</thread-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxIdle() {
		ThreadObjectPoolConfig config = new ThreadObjectPoolConfig();
		config.setMaxIdle(5);
		String xml = config.toXML("\t");
		assertEquals("\t<thread-object-pool>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t</thread-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndInitSize() {
		ThreadObjectPoolConfig config = new ThreadObjectPoolConfig();
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<thread-object-pool>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</thread-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdle() {
		ThreadObjectPoolConfig config = new ThreadObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		String xml = config.toXML("\t");
		assertEquals("\t<thread-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t</thread-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndInitSize() {
		ThreadObjectPoolConfig config = new ThreadObjectPoolConfig();
		config.setMaxActive(10);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<thread-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</thread-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxIdleAndInitSize() {
		ThreadObjectPoolConfig config = new ThreadObjectPoolConfig();
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<thread-object-pool>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</thread-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdleAndInitSize() {
		ThreadObjectPoolConfig config = new ThreadObjectPoolConfig();
		config.setMaxActive(10);
		config.setMaxIdle(5);
		config.setInitSize(2);
		String xml = config.toXML("\t");
		assertEquals("\t<thread-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</thread-object-pool>\n", xml);
	}
	
	@Test
	void testToXMLWithPadAndMaxActiveAndMaxIdleAndInitSizeAndPoolConfig() {
		PoolConfig poolConfig = new PoolConfig();
		poolConfig.setMaxActive(10);
		poolConfig.setMaxIdle(5);
		poolConfig.setInitSize(2);
		ThreadObjectPoolConfig config = new ThreadObjectPoolConfig(poolConfig);
		String xml = config.toXML("\t");
		assertEquals("\t<thread-object-pool>\n" +
				"\t\t<max-active>10</max-active>\n" +
				"\t\t<max-idle>5</max-idle>\n" +
				"\t\t<init-size>2</init-size>\n" +
				"\t</thread-object-pool>\n", xml);
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
        this.maxActive