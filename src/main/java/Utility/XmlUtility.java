package Utility;

import org.w3c.dom.Document;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;


public class XmlUtility {

    public static String XmlStringFromObject(Object obj) {
        String xmlString = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty("com.sun.xml.bind.xmlDeclaration", false);
            StringWriter sw = new StringWriter();
            jaxbMarshaller.marshal(obj, sw);
            xmlString = sw.toString();
        } catch (JAXBException e) {
            System.out.println(e);
        }
        return xmlString;
    }

    public static String convertPOJOtoSOAPXML(Object object,Object customHeader) {
        String xmlString=null;
        final ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
        try{
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Marshaller marshaller = JAXBContext.newInstance(object.getClass()).createMarshaller();
            marshaller.marshal(object, document);
            SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
            soapMessage.saveChanges();
            soapMessage.getSOAPHeader().detachNode();
            soapMessage.getSOAPPart().getEnvelope().addHeader().addTextNode(XmlStringFromObject(customHeader));
            soapMessage.getSOAPPart().getEnvelope().removeNamespaceDeclaration("SOAP-ENV");
            soapMessage.getSOAPPart().getEnvelope().setPrefix("soap");
            soapMessage.getSOAPHeader().setPrefix("soap");
            soapMessage.getSOAPBody().setPrefix("soap");
            soapMessage.getSOAPBody().addDocument(document);
            soapMessage.saveChanges();
            final Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            /*transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");*/
            final javax.xml.transform.Source soapContent = soapMessage.getSOAPPart().getContent();
            final StreamResult result = new StreamResult(streamOut);
            transformer.transform(soapContent, result);
            xmlString=streamOut.toString().replace("&lt;","<").replace("&gt;",">");

        }

        catch(ParserConfigurationException | JAXBException | SOAPException | TransformerException e){
            System.out.println("Exception" + e);
        }
        return xmlString;
    }
}