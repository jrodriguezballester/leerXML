/*
 *ACTIVIDAD 4
 *Utiliza SAX para visualizar el contenido del fichero creado en la actividad anterior. 
 * Fichero Pelis.xml
 */
package actividad__1_3_4;

import java.io.IOException;
import java.util.jar.Attributes;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author Jose Rodriguez
 */
public class Actividad__1_3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            XMLReader lector = XMLReaderFactory.createXMLReader();
            GestionContenido gestor = new GestionContenido();
            lector.setContentHandler(gestor);
            InputSource ficheroXML = new InputSource("Pelis.xml");
            lector.parse(ficheroXML);
        } catch (SAXException | IOException ex) {
            Logger.getLogger(Actividad__1_3_4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class GestionContenido extends DefaultHandler {

    public GestionContenido() {
        super();
    }

    @Override
    public void startDocument() {
        System.out.println("Comienzo del documento");
    }

    @Override
    public void endDocument() {
        System.out.println("Fin del documento");
    }

    public void startElement(String uri, String nombre, String nombreC, Attributes atts) {
        System.out.println("\tPrincipio del Elemento: " + nombre);
    }

    @Override
    public void endElement(String uri, String nombre, String nombreC) {
        System.out.println("\tFin del Elemento: " + nombre);
    }

    @Override
    public void characters(char[] ch, int inicio, int longitud) throws SAXException {
        String car = new String(ch, inicio, longitud);
        car = car.replaceAll("[\t\n]", ""); // quitar saltos de linea
        System.out.println("\tcaracteres: " + car);
    }

}


