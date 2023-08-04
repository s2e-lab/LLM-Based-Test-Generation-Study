// XmlIO_1Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_1Test {

    private static final Logger LOG = Logger.getLogger("org.columba.core.xml");

    private static final String ROOT_XML_ELEMENT_NAME = "__INSPIRENTO_XML_TREE_TOP__";

    // List of sub-elements
    @SuppressWarnings("unused")
    private List<XmlElement> elements;

    // Top level element (Used to hold everything else)
    private XmlElement rootElement;

    // The current element you are working on
    private XmlElement currentElement;

    // For writing out the data
    // Indent for each level
    private int writeIndent = 2;

    // Maximum data to put on a "one liner"
    private int maxOneLineData = 20;

    // The SAX 2 parser...
    @SuppressWarnings("unused")
    private XMLReader xr;

    // Buffer for collecting data from
    // the "characters" SAX event.
    private CharArrayWriter contents = new CharArrayWriter();

    private URL url = null;

    /*
  // Default constructor
  public XmlIO() {
  }
  */
    /*
  // setup and load constructor
  public XmlIO(String FilePath) {
          currentElement = null;


  }
  */
    public XmlIO(URL url) {
        super();
        this.url = url;
    }

    // setup and load constructor
    public XmlIO() {
        currentElement = null;
    }

    // setup and load constructor
    /**
    * Creates a XmlIO object with the specified element at the top.
    * @param element the element at the top.
    */
    public XmlIO(XmlElement element) {
        rootElement = new XmlElement(ROOT_XML_ELEMENT_NAME);
        rootElement.addElement(element);
    }

    public void setURL(URL url) {
        this.url = url;
    }

    public boolean load() {
        //this.file = F;
        return load(url);
    }

    // Load a file. This is what starts things off.
    /**
    * Loads from the InputStream into the root Xml Element.
    * @param input the input stream to load from.
    */
    public boolean load(InputStream input) {
        elements = new Vector<XmlElement>();
        rootElement = new XmlElement(ROOT_XML_ELEMENT_NAME);
        currentElement = rootElement;
        try {
            // Create the XML reader...
            //      xr = XMLReaderFactory.createXMLReader();
            SAXParserFactory factory = SAXParserFactory.newInstance();
            // Set the ContentHandler...
            //      xr.setContentHandler( this );
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(input, this);
        } catch (javax.xml.parsers.ParserConfigurationException ex) {
            LOG.severe("XML config error while attempting to read from the input stream \n'" + input + "'");
            LOG.severe(ex.toString());
            ex.printStackTrace();
            return (false);
        } catch (SAXException ex) {
            // Error
            LOG.severe("XML parse error while attempting to read from the input stream \n'" + input + "'");
            LOG.severe(ex.toString());
            ex.printStackTrace();
            return (false);
        } catch (IOException ex) {
            LOG.severe("I/O error while attempting to read from the input stream \n'" + input + "'");
            LOG.severe(ex.toString());
            ex.printStackTrace();
            return (false);
        }
        //XmlElement.printNode( getRoot(), "");
        return (true);
    }

    /**
    * Load a file. This is what starts things off.
    * @param inputURL the URL to load XML from.
    */
    public boolean load(URL inputURL) {
        elements = new Vector<XmlElement>();
        rootElement = new XmlElement(ROOT_XML_ELEMENT_NAME);
        currentElement = rootElement;
        try {
            // Create the XML reader...
            //      xr = XMLReaderFactory.createXMLReader();
            SAXParserFactory factory = SAXParserFactory.newInstance();
            // Set the ContentHandler...
            //      xr.setContentHandler( this );
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(inputURL.toString(), this);
        } catch (javax.xml.parsers.ParserConfigurationException ex) {
            LOG.severe("XML config error while attempting to read XML file \n'" + inputURL + "'");
            LOG.severe(ex.toString());
            ex.printStackTrace();
            return (false);
        } catch (SAXException ex) {
            // Error
            LOG.severe("XML parse error while attempting to read XML file \n'" + inputURL + "'");
            LOG.severe(ex.toString());
            ex.printStackTrace();
            return (false);
        } catch (IOException ex) {
            LOG.severe("I/O error while attempting to read XML file \n'" + inputURL + "'");
            LOG.severe(ex.toString());
            ex.printStackTrace();
            return (false);
        }
        //XmlElement.printNode( getRoot(), "");
        return (true);
    }

    // Implement the content hander methods that
    // will delegate SAX events to the tag tracker network.
    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes attrs) throws SAXException {
        // Resetting contents buffer.
        // Assuming that tags either tag content or children, not both.
        // This is usually the case with XML that is representing
        // data strucutures in a programming language independant way.
        // This assumption is not typically valid where XML is being
        // used in the classical text mark up style where tagging
        // is used to style content and several styles may overlap
        // at once.
        try {
            contents.reset();
            // element name
            String name = localName;
            if (name.equals("")) {
                // namespaceAware = false
                name = qName;
            }
            XmlElement p = currentElement;
            currentElement = currentElement.addSubElement(name);
            currentElement.setParent(p);
            if (attrs != null) {
                for (int i = 0; i < attrs.getLength(); i++) {
                    // Attr name
                    String aName = attrs.getLocalName(i);
                    if (aName.equals("")) {
                        aName = attrs.getQName(i);
                    }
                    currentElement.addAttribute(aName, attrs.getValue(i));
                }
            }
        } catch (java.lang.NullPointerException ex) {
            LOG.severe("Null!!!");
            LOG.severe(ex.toString());
            ex.printStackTrace();
        }
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        currentElement.setData(contents.toString().trim());
        contents.reset();
        currentElement = currentElement.getParent();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        // accumulate the contents into a buffer.
        contents.write(ch, start, length);
    }

    /**
    * Returns the root for the XmlElement hiearchy.
    * Note that this Xml Element will always have the name <code>__COLUMBA_XML_TREE_TOP__</code>.
    * <p>
    * Methods that want to retrieve elements from this root should use
    * the {@link XmlElement#getElement(String)} in order to get the wanted
    * element.
    * @return a XmlElement if it has been loaded or initialized with it; null otherwise.
    */
    public XmlElement getRoot() {
        return (rootElement);
    }

    public void errorDialog(String Msg) {
        JOptionPane.showMessageDialog(null, "Error: " + Msg);
    }

    public void warningDialog(String Msg) {
        JOptionPane.showMessageDialog(null, "Warning: " + Msg);
    }

    public void infoDialog(String Msg) {
        JOptionPane.showMessageDialog(null, "Info: " + Msg);
    }

    public void save() throws Exception {
        write(new FileOutputStream(url.getPath()));
    }

    //
    // Writer interface
    //
    public void write(OutputStream out) throws IOException {
        BufferedWriter PW = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
        PW.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        if (rootElement.subElements.size() > 0) {
            for (int i = 0; i < rootElement.subElements.size(); i++) {
                _writeSubNode(PW, (XmlElement) rootElement.subElements.get(i), 0);
            }
        }
        PW.flush();
    }

    private void _writeSubNode(Writer out, XmlElement element, int indent) throws IOException {
        _writeSpace(out, indent);
        out.write("<");
        out.write(element.getName());
        for (Enumeration e = element.getAttributeNames(); e.hasMoreElements(); ) {
            String K = (String) e.nextElement();
            out.write(" " + K + "=\"" + InspirentoUtilities.escapeText(element.getAttribute(K)) + "\"");
        }
        out.write(">");
        String data = element.getData();
        if ((data != null) &&