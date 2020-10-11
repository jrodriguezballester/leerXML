/*
 * CLASE HandlerPelicula
 */
package actividad_1_3_4_mejorada;

import java.util.ArrayList;
import java.util.jar.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Jose Rodriguez
 */
public class HandlerPelicula extends DefaultHandler {

    private Pelicula peli;
    static ArrayList<Pelicula> pelis = new ArrayList();
    private String valor;

    public HandlerPelicula(Pelicula peli) {
        this.peli = peli;
    }

    public void startElement(String uri, String localName, String name,
            Attributes attributes) {
        // Limpiamos la variable temporal.  
        valor = null;

        System.out.println("-----------Entra en startElement---------");

        if (localName.equals("peli")) {
            Pelicula peli = new Pelicula();
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) {
        // Guardamos el texto en la variable temporal  
        valor = new String(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String name) {
// Según la etiqueta guardamos el valor leido en una propiedad del objeto pelicula
        switch (localName) {
            case "peli":
                //al finalizar el objeto lo agregamos al arrayList
                pelis.add(peli);
                //instanciamos un nuevo Objeto
                this.peli = new Pelicula();

            case "titulo":
                //  if (peli.getTitulo()==null) {
                peli.setTitulo(valor);
                //  }
                break;
            case "ano":
                peli.setAno(valor);
                break;
            case "duracion":
                peli.setDuracion(valor);
                break;
            case "actor":
                peli.setActor(valor);
                break;
            default:
                break;
        }
    }
}
