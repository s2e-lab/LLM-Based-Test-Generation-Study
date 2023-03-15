// DefaultFSPath_1Test.java
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
* It contains ten unit test cases for the {@link DefaultFSPath#query(String, QName)} method.
*/
class DefaultFSPath_1Test {

		private DefaultFSPath defaultFSPath;
		
		private File rootDirectory;
		
		private XPath xpath;
		
		private Document dom;
		
		private DateFormat format;
		
		private Map escapeChars;
		
		private DocumentBuilder documentBuilder;
		
		public DefaultFSPath_1Test() {
				this.xpath = XPathFactory.newInstance().newXPath();
				this.xpath.setXPathFunctionResolver(new RegexFunctionResolver());
				this.escapeChars = this.createEscapeCharsMap();
				this.format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
		}
		
		protected Map createEscapeCharsMap() {
				Map<String, String> escapeChars = new HashMap<String, String>();
				escapeChars.put("&", "&#26;");
				escapeChars.put("<", "&#3c;");
				escapeChars.put(">", "&#3e;");
				escapeChars.put("\"", "&#22;");
				return escapeChars;
		}
		
		protected void createDocumentBuilder() throws ParserConfigurationException {
				try {
						this.documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
				} catch (ParserConfigurationException pce) {
						pce.printStackTrace();
						throw pce;
				}
		}
		
		protected Document buildDOM(File currentDir) throws IOException {
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
		
		/**
		 *  Calls this.query(expression, XPathConstants.NODESET)
		 *
		 *  Note : This method MUST be passed an expression which returns a nodeset.
		 *
		 *  @param expression the FSPath expression to execute.
		 *  @returns <code>FSPathResultList</code> the FSPathResult objects contained
		 *  in this list will be of type <code>java.io.File</code>,
		 *  <code>java.lang.Double</code>, <code>java.lang.Boolean</code>,
		 *  <code>java.lang.String</code>
		 */
		public FSPathResultList query(String expression) {
				return this.query(expression, XPathConstants.NODESET);
		}
		
		/**
		 */
		public FSPathResultList query(String expression, QName returnType) {
				FSPathResultList results = new FSPathResultListImpl();
				try {
						if (XPathConstants.NODESET.equals(returnType)) {
								NodeList nodelist = (NodeList) this.xpath.evaluate(expression, this.dom.getDocumentElement(), XPathConstants.NODESET);
								if (nodelist.getLength() > 0) {
										for (int i = 0; i < nodelist.getLength(); i++) {
												processNode(nodelist.item(i), results);
										}
								}
								return results;
						}
						if (XPathConstants.NODE.equals(returnType)) {
								Node node = (Node) this.xpath.evaluate(expression, this.dom.getDocumentElement(), XPathConstants.NODE);
								processNode(node, results);
								return results;
						}
						if (XPathConstants.BOOLEAN.equals(returnType)) {
								Boolean result = (Boolean) this.xpath.evaluate(expression, this.dom.getDocumentElement(), XPathConstants.BOOLEAN);
								results.add(new FSPathResult(result));
								return results;
						}
						if (XPathConstants.NUMBER.equals(returnType)) {
								Double result = (Double) this.xpath.evaluate(expression, this.dom.getDocumentElement(), XPathConstants.NUMBER);
								results.add(new FSPathResult(result));
								return results;
						}
						if (XPath