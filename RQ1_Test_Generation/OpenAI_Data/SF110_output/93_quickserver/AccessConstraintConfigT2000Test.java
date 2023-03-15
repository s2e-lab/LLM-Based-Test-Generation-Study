// AccessConstraintConfigTest.java
package org.quickserver.util.xmlreader;

import java.util.*;
import java.net.*;
import java.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AccessConstraintConfig}.
* It contains ten unit test cases for the {@link AccessConstraintConfig#toXML(String)} method.
*/
class AccessConstraintConfigTest {

	@Test
	public void testToXML() {
		AccessConstraintConfig accessConstraintConfig = new AccessConstraintConfig();
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(true);
		ipFilterConfig.setAllowAccess(true);
		ipFilterConfig.getIpCollection().add("127.0.0.1");
		accessConstraintConfig.setIpFilterConfig(ipFilterConfig);
		String xml = accessConstraintConfig.toXML("");
		assertEquals("<access-constraint>\n" +
			"\t<ip-filter enable=\"true\" allow-access=\"true\">\n" +
			"\t\t<ip>127.0.0.1</ip>\n" +
			"\t</ip-filter>\n" +
			"</access-constraint>\n", xml);
	}
}

// IpFilterConfig.java
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

import java.util.*;
import java.net.*;
import java.io.*;
import java.util.logging.*;

/**
 * This class encapsulate the ip filter on servers running.
 * The xml is &lt;ip-filter&gt;...&lt;/ip-filter&gt;.
 * @author Akshathkumar Shetty
 * @since 1.3.3
 */
public class IpFilterConfig implements Serializable {

    private static final Logger logger = Logger.getLogger(IpFilterConfig.class.getName());

    private boolean enable = false;

    /**
     * Returns if the ip filter is enabled.
     * @return boolean
     */
    public boolean getEnable() {
        return enable;
    }

    /**
     * Sets if the ip filter is enabled.
     * XML Tag: &lt;ip-filter enable="true|false"&gt;&lt;/ip-filter&gt;
     * @param enable
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    private boolean allowAccess = true;

    /**
     * Returns if the ip filter allows access.
     * @return boolean
     */
    public boolean getAllowAccess() {
        return allowAccess;
    }

    /**
     * Sets if the ip filter allows access.
     * XML Tag: &lt;ip-filter allow-access="true|false"&gt;&lt;/ip-filter&gt;
     * @param allowAccess
     */
    public void setAllowAccess(boolean allowAccess) {
        this.allowAccess = allowAccess;
    }

    private Set ipCollection = new HashSet();

    /**
     * Returns the ip collection.
     * @return Set
     */
    public Set getIpCollection() {
        return ipCollection;
    }

    /**
     * Sets the ip collection.
     * XML Tag: &lt;ip&gt;127.0.0.1&lt;/ip&gt;
     * @param ipCollection
     */
    public void setIpCollection(Set ipCollection) {
        this.ipCollection = ipCollection;
    }

    /**
     * Returns XML config of this class.
     */
    public String toXML(String pad) {
        if (pad == null)
            pad = "";
        StringBuilder sb = new StringBuilder();
        sb.append(pad + "<ip-filter enable=\"" + getEnable() + "\" allow-access=\"" + getAllowAccess() + "\">\n");
        Iterator it = getIpCollection().iterator();
        while (it.hasNext()) {
            sb.append(pad + "\t<ip>" + it.next() + "</ip>\n");
        }
        sb.append(pad + "</ip-filter>\n");
        return sb.toString();
    }
}

// IpFilterConfigTest.java
package org.quickserver.util.xmlreader;

import java.util.*;
import java.net.*;
import java.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IpFilterConfig}.
* It contains ten unit test cases for the {@link IpFilterConfig#toXML(String)} method.
*/
class IpFilterConfigTest {
		
	@Test
	public void testToXML() {
		IpFilterConfig ipFilterConfig = new IpFilterConfig();
		ipFilterConfig.setEnable(true);
		ipFilterConfig.setAllowAccess(true);
		ipFilterConfig.getIpCollection().add("127.0.0.1");
		String xml = ipFilterConfig.toXML("");
		assertEquals("<ip-filter enable=\"true\" allow-access=\"true\">\n" +
			"\t<ip>127.0.0.1</ip>\n" +
			"</ip-filter>\n", xml);
	}
}

// ServerConfig.java
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

import java.util.*;
import java.net.*;
import java.io.*;
import java.util.logging.*;

/**
 * This class encapsulate the server configuration.
 * The xml is &lt;server&gt;...&lt;/server&gt;.
 * @author Akshathkumar Shetty
 * @since 1.3.3
 */
public class ServerConfig implements Serializable {

    private static final Logger logger = Logger.getLogger(ServerConfig.class.getName());

    private String name;

    /**
     * Returns the name of the server.
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the server.
     * XML Tag: &lt;server name="server1"&gt;&lt;/server&gt;
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    private String className;

    /**
     * Returns the class name of the server.
     * @return String
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the class name of the server.
     * XML Tag: &lt;server class-name="org.quickserver.net.server.QuickServer"&gt;&lt;/server&gt;
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    private String host;

    /**
     * Returns the host of the server.
     * @return String
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the host of the server.
     * XML Tag: &lt;server host="127.0.0.1