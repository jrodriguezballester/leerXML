/*
 * Leemos un XML (Pelis.xml) 
 * Creamos objetos a partir del XML
 * Guardamos los objetos en un ArrayList
 */
package actividad_1_3_4_mejorada;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author Jose Rodriguez
 */
public class Actividad_1_3_4_Mejorada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String FileInputString = "pelis.xml";
        try {
            // Creamos nuestro objeto pelicula vacío
            Pelicula peli = new Pelicula();
            // Creamos la factoria de parseadores por defecto
            XMLReader reader = XMLReaderFactory.createXMLReader();
            // Añadimos nuestro manejador al reader pasandole el objeto pelicula
            reader.setContentHandler(new HandlerPelicula(peli));
            // Procesamos el xml 
            reader.parse(new InputSource(new FileInputStream(FileInputString)));
            // Ya tenemos nuestros objetos peliculas con los valores obtenidos del xml
            // los imprimimos por consola
            HandlerPelicula.pelis.forEach((pelic) -> {
                System.out.println(pelic.toString());
            });
            
        } catch (SAXException | IOException ex) {
            Logger.getLogger(Actividad_1_3_4_Mejorada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
