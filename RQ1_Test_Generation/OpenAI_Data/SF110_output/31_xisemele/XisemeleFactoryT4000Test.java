// XisemeleFactoryTest.java
package net.sf.xisemele.impl;

import net.sf.xisemele.api.Xisemele;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XisemeleFactory}.
* It contains ten unit test cases for the {@link XisemeleFactory#newXisemele()} method.
*/
class XisemeleFactoryTest {

	/**
	* Test case for {@link XisemeleFactory#newXisemele()} method.
	* It tests if the method returns a new instance of {@link Xisemele} every time it is called.
	*/
	@Test
	void testNewXisemele() {
		Xisemele xisemele1 = XisemeleFactory.newXisemele();
		Xisemele xisemele2 = XisemeleFactory.newXisemele();
		assertNotSame(xisemele1, xisemele2);
	}
}

// XisemeleImpl.java
package net.sf.xisemele.impl;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import net.sf.xisemele.api.Editor;
import net.sf.xisemele.api.Formatter;
import net.sf.xisemele.api.FormatterProvider;
import net.sf.xisemele.api.Xisemele;
import net.sf.xisemele.exception.XisemeleIOException;
import net.sf.xisemele.exception.XisemeleIOException.Type;
import net.sf.xisemele.exception.XisemeleRuntimeException;
import net.sf.xisemele.exception.XisemeleRuntimeException.Reason;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/**
 * Implementação de {@link Xisemele}.
 *
 * @author Carlos Eduardo Coral.
 */
class XisemeleImpl implements Xisemele {

    /**
     * Instância de {@link Factory} que será utilizada para criar instâncias de objetos necessários para a execução das operações de {@link Xisemele}.
     */
    private final Factory factory;
    /**
     * Instância de {@link FormatterProvider} que será utilizada para obter instâncias de {@link Formatter}.
     */
    private final FormatterProvider formatterProvider;

    /**
     * Cria uma nova instância de {@link XisemeleImpl}.
     *
     * @param factory
     *      instância de {@link Factory} que será utilizada para criar instâncias de objetos necessários para a execução das operações de {@link Xisemele}.
     * @param formatterProvider
     *      instância de {@link FormatterProvider} que será utilizada para obter instâncias de {@link Formatter}.
     */
    XisemeleImpl(final Factory factory, final FormatterProvider formatterProvider) {
        this.factory = factory;
        this.formatterProvider = formatterProvider;
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName) {
        return newDocument(rootName, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace) {
        return newDocument(rootName, rootNamespace, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix) {
        return newDocument(rootName, rootNamespace, rootPrefix, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone, final String rootFormatterTimeZoneId) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, rootFormatterTimeZoneId, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone, final String rootFormatterTimeZoneId, final String rootFormatterCharset) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, rootFormatterTimeZoneId, rootFormatterCharset, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone, final String rootFormatterTimeZoneId, final String rootFormatterCharset, final String rootFormatterBooleanTrue) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, rootFormatterTimeZoneId, rootFormatterCharset, rootFormatterBooleanTrue, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone, final String rootFormatterTimeZoneId, final String rootFormatterCharset, final String rootFormatterBooleanTrue, final String rootFormatterBooleanFalse) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, rootFormatterTimeZoneId, rootFormatterCharset, rootFormatterBooleanTrue, rootFormatterBooleanFalse, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone, final String rootFormatterTimeZoneId, final String rootFormatterCharset, final String rootFormatterBooleanTrue, final String rootFormatterBooleanFalse, final String rootFormatterNull) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, rootFormatterTimeZoneId, rootFormatterCharset, rootFormatterBooleanTrue, rootFormatterBooleanFalse, rootFormatterNull, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone, final String rootFormatterTimeZoneId, final String rootFormatterCharset, final String rootFormatterBooleanTrue, final String rootFormatterBooleanFalse, final String rootFormatterNull, final String rootFormatterIndent) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, rootFormatterTimeZoneId, rootFormatterCharset, rootFormatterBooleanTrue, rootFormatterBooleanFalse, rootFormatterNull, rootFormatterIndent, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone, final String rootFormatterTimeZoneId, final String rootFormatterCharset, final String rootFormatterBooleanTrue, final String rootFormatterBooleanFalse, final String rootFormatterNull, final String rootFormatterIndent, final String rootFormatterLineSeparator) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, rootFormatterTimeZoneId, rootFormatterCharset, rootFormatterBooleanTrue, rootFormatterBooleanFalse, rootFormatterNull, rootFormatterIndent, rootFormatterLineSeparator, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone, final String rootFormatterTimeZoneId, final String rootFormatterCharset, final String rootFormatterBooleanTrue, final String rootFormatterBooleanFalse, final String rootFormatterNull, final String rootFormatterIndent, final String rootFormatterLineSeparator, final String rootFormatterEncoding) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, rootFormatterTimeZoneId, rootFormatterCharset, rootFormatterBooleanTrue, rootFormatterBooleanFalse, rootFormatterNull, rootFormatterIndent, rootFormatterLineSeparator, rootFormatterEncoding, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone, final String rootFormatterTimeZoneId, final String rootFormatterCharset, final String rootFormatterBooleanTrue, final String rootFormatterBooleanFalse, final String rootFormatterNull, final String rootFormatterIndent, final String rootFormatterLineSeparator, final String rootFormatterEncoding, final String rootFormatterOmitXmlDeclaration) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, rootFormatterTimeZoneId, rootFormatterCharset, rootFormatterBooleanTrue, rootFormatterBooleanFalse, rootFormatterNull, rootFormatterIndent, rootFormatterLineSeparator, rootFormatterEncoding, rootFormatterOmitXmlDeclaration, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone, final String rootFormatterTimeZoneId, final String rootFormatterCharset, final String rootFormatterBooleanTrue, final String rootFormatterBooleanFalse, final String rootFormatterNull, final String rootFormatterIndent, final String rootFormatterLineSeparator, final String rootFormatterEncoding, final String rootFormatterOmitXmlDeclaration, final String rootFormatterOmitXmlDeclarationStandalone) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, rootFormatterTimeZoneId, rootFormatterCharset, rootFormatterBooleanTrue, rootFormatterBooleanFalse, rootFormatterNull, rootFormatterIndent, rootFormatterLineSeparator, rootFormatterEncoding, rootFormatterOmitXmlDeclaration, rootFormatterOmitXmlDeclarationStandalone, null);
    }

    /**
     * {@inheritDoc}
     */
    public Editor newDocument(final String rootName, final String rootNamespace, final String rootPrefix, final String rootValue, final String rootType, final String rootFormatter, final String rootFormatterPattern, final String rootFormatterLocale, final String rootFormatterTimeZone, final String rootFormatterTimeZoneId, final String rootFormatterCharset, final String rootFormatterBooleanTrue, final String rootFormatterBooleanFalse, final String rootFormatterNull, final String rootFormatterIndent, final String rootFormatterLineSeparator, final String rootFormatterEncoding, final String rootFormatterOmitXmlDeclaration, final String rootFormatterOmitXmlDeclarationStandalone, final String rootFormatterOmitXmlDeclarationVersion) {
        return newDocument(rootName, rootNamespace, rootPrefix, rootValue, rootType, rootFormatter, rootFormatterPattern, rootFormatterLocale, rootFormatterTimeZone, rootFormatterTimeZoneId, rootFormatterCharset, rootFormatterBooleanTrue, rootFormatterBooleanFalse, rootFormatterNull, rootFormatterIndent, rootFormatterLineSeparator, rootFormatterEncoding, rootFormatterOmitXmlDecl