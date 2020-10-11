/*
 * CLASE Pelicula Constructor, getters&Setters, toString
 */
package actividad_1_3_4_mejorada;

/**
 *
 * @author Jose Rodriguez
 */
class Pelicula {

   
    private String titulo = null;
    private String actor = null;
    private String ano = null;
    private String duracion = null;

     public Pelicula() {
    }
     
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String autor) {
        this.actor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTitulo: " + titulo);
        sb.append("\nActor: " + actor);
        sb.append("\nAño: " + ano);
        sb.append("\nduracion: " + duracion);

        return sb.toString();
    }

}
