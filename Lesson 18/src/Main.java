import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {
    public static void main(String[] args) {

        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("src/xml/out.xml");
            document.getDocumentElement().normalize();

            Node peoples = document.getDocumentElement();
            System.out.println();

            NodeList peopleList = peoples.getChildNodes();

            for (int i = 0; i < peopleList.getLength(); i++) {
                if (peopleList.item(i).getNodeType() != Node.ELEMENT_NODE)
                    continue;

                Node people = peopleList.item(i);

                if (people.getNodeType() != Node.TEXT_NODE) {
                    NodeList peopleProps = people.getChildNodes();

                    for (int j = 0; j < peopleProps.getLength(); j++) {
                        Node peopleProp = peopleProps.item(j);

                        if (peopleProp.getNodeType() != Node.TEXT_NODE) {
                            System.out.println(peopleProp.getNodeName() + ": " + peopleProp.getChildNodes().item(0).getTextContent());
                        }
                    }

                    System.out.println("=====================");
                }
            }

            writeDocument(document);

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println("Error! " + ex.getMessage());
        }
    }

    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError {
        try {
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(document);
            FileOutputStream fos = new FileOutputStream("src/xml/in.xml");
            StreamResult result = new StreamResult(fos);
            tr.transform(source, result);
        } catch (TransformerException | IOException e) {
            System.out.println("Error! " + e.getMessage());
        }
    }
}