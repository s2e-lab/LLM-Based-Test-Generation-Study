// RequestAdapterImpl_1Test.java
package br.com.jnfe.base.pl006;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.xml.transform.StringResult;
import org.w3c.dom.Document;
import br.com.jnfe.base.adapter.RequestAdapter;
import br.com.jnfe.base.adapter.dom.AbstractNFeDOMAdapter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RequestAdapterImpl}.
* It contains ten unit test cases for the {@link RequestAdapterImpl#newRequest(String, String, String)} method.
*/
class RequestAdapterImpl_1Test {

	private static final Logger logger = LoggerFactory.getLogger(RequestAdapterImpl_1Test.class);
	
	private static final String PREFIXO_NAMESPACE = "http://www.portalfiscal.inf.br/nfe/wsdl/";
	
	private static final String VERSAO_DADOS = "2.00";
	
	private static final String SERVICO_REMOTO = "NfeRecepcao";
	
	private static final String QUALIFICADOR_ABREVIADO = "NfeRecepcao2";
	
	private static final String CONTENT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe>";
	
	private static final String EXPECTED_RESULT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_2 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_3 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_4 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_5 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_6 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_7 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_8 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_9 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_10 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_11 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_12 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_13 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_14 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_15 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_16 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_17 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_18 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_19 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_20 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_21 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_22 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_23 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_24 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><nfeDadosMsg xmlns=\"http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2\"><?xml version=\"1.0\" encoding=\"UTF-8\"?><consReciNFe versao=\"2.00\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><tpAmb>2</tpAmb><nRec>310000009278615</nRec></consReciNFe></nfeDadosMsg>";
	
	private static final String EXPECTED_RESULT_25 = "<?xml version=\"1.0\" encoding=\"UTF-