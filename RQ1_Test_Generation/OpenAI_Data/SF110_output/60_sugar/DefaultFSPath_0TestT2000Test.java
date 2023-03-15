// DefaultFSPath_0Test.java
/*
 * DefaultFSPath.java
 *
 * Created on 18 September 2006, 00:25
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import net.sf.sugar.fspath.xpath.RegexFunctionResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultFSPath}.
* It contains ten unit test cases for the {@link DefaultFSPath#query(String)} method.
*/
class DefaultFSPath_0Test {

		private DefaultFSPath defaultFSPath;
		
		private File rootDirectory;
		
		private XPath xpath;
		
		private Document dom;
		
		private DateFormat format;
		
		private Map escapeChars;
		
		private DocumentBuilder documentBuilder;
		
		private void setUp() throws ParserConfigurationException, IOException {
				this.xpath = XPathFactory.newInstance().newXPath();
				this.xpath.setXPathFunctionResolver(new RegexFunctionResolver());
				this.escapeChars = this.createEscapeCharsMap();
				this.format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
				this.rootDirectory = new File("/home/keith/workspace/FSPath/test/net/sf/sugar/fspath/testdata");
				this.createDocumentBuilder();
				this.dom = this.buildDOM(this.rootDirectory);
				this.defaultFSPath = new DefaultFSPath();
		}
		
		private Map createEscapeCharsMap() {
				Map<String, String> escapeChars = new HashMap<String, String>();
				escapeChars.put("&", "&#26;");
				escapeChars.put("<", "&#3c;");
				escapeChars.put(">", "&#3e;");
				escapeChars.put("\"", "&#22;");
				return escapeChars;
		}
		
		private void createDocumentBuilder() throws ParserConfigurationException {
				try {
						this.documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
				} catch (ParserConfigurationException pce) {
						pce.printStackTrace();
						throw pce;
				}
		}
		
		private Document buildDOM(File currentDir) throws IOException {
				Document dom = this.documentBuilder.newDocument();
				dom.appendChild(this.createChildElement(dom, currentDir));
				return dom;
		}
		
		private Element createChildElement(Document dom, File currentFile) throws IOException {
				Element currentElement = null;
				if (currentFile.isDirectory()) {
						currentElement = dom.createElement(FSPathAttributes.dir.name());
						//recurse and create child elements for all its children
						File[] children = currentFile.listFiles();
						if (children != null) {
								for (int i = 0; i < children.length; i++) {
										currentElement.appendChild(this.createChildElement(dom, children[i]));
								}
						}
				} else {
						currentElement = dom.createElement(FSPathAttributes.file.name());
				}
				currentElement.setAttribute(FSPathAttributes.name.name(), currentFile.getName());
				currentElement.setAttribute(FSPathAttributes.absolutePath.name(), currentFile.getAbsolutePath());
				//optional for speed?
				currentElement.setAttribute(FSPathAttributes.canRead.name(), Boolean.toString(currentFile.canRead()));
				//optional for speed?
				currentElement.setAttribute(FSPathAttributes.canWrite.name(), Boolean.toString(currentFile.canWrite()));
				currentElement.setAttribute(FSPathAttributes.canonicalPath.name(), currentFile.getCanonicalPath());
				//optional for speed?
				currentElement.setAttribute(FSPathAttributes.exists.name(), Boolean.toString(currentFile.exists()));
				currentElement.setAttribute(FSPathAttributes.isAbsolute.name(), Boolean.toString(currentFile.isAbsolute()));
				currentElement.setAttribute(FSPathAttributes.isDirectory.name(), Boolean.toString(currentFile.isDirectory()));
				currentElement.setAttribute(FSPathAttributes.isFile.name(), Boolean.toString(currentFile.isFile()));
				currentElement.setAttribute(FSPathAttributes.isHidden.name(), Boolean.toString(currentFile.isHidden()));
				currentElement.setAttribute(FSPathAttributes.lastModified.name(), this.format.format(new Date(currentFile.lastModified())));
				currentElement.setAttribute(FSPathAttributes.length.name(), Long.toString(currentFile.length()));
				currentElement.setAttribute(FSPathAttributes.parent.name(), currentFile.getParent());
				currentElement.setAttribute(FSPathAttributes.path.name(), currentFile.getPath());
				return currentElement;
		}
		
		private void processNode(Node node, FSPathResultList results) throws XPathExpressionException, IllegalArgumentException, ParseException {
				//as the only elements in our dom are files or directories we will try to
				//create File objects of those nodes.
				if (node.getNodeType() == Node.ELEMENT_NODE) {
						String fileName = node.getAttributes().getNamedItem(FSPathAttributes.absolutePath.name()).getNodeValue();
						//System.out.println("Filename : " + fileName);
						results.add(new FSPathResult(new File(fileName)));
						return;
				}
				if (node.getNodeType() == Node.ATTRIBUTE_NODE) {
						Attr attr = (Attr) node;
						//now work out which attirutes were Dates, Longs and Strings
						if (FSPathAttributes.absolutePath.name().equals(attr.getName()) | FSPathAttributes.canonicalPath.name().equals(attr.getName()) | FSPathAttributes.name.name().equals(attr.getName()) | FSPathAttributes.parent.name().equals(attr.getName()) | FSPathAttributes.path.name().equals(attr.getName())) {
								results.add(new FSPathResult(attr.getValue()));
								return;
						}
						if (FSPathAttributes.canRead.name().equals(attr.getName()) | FSPathAttributes.canWrite.name().equals(attr.getName()) | FSPathAttributes.exists.name().equals(attr.getName()) | FSPathAttributes.isAbsolute.name().equals(attr.getName()) | FSPathAttributes.isDirectory.name().equals(attr.getName()) | FSPathAttributes.isFile.name().equals(attr.getName()) | FSPathAttributes.isHidden.name().equals(attr.getName())) {
								results.add(new FSPathResult(new Boolean(attr.getValue())));
								return;
						}
						if (FSPathAttributes.lastModified.name().equals(attr.getName())) {
								results.add(new FSPathResult(this.format.parse(attr.getValue())));
								return;
						}
						if (FSPathAttributes.length