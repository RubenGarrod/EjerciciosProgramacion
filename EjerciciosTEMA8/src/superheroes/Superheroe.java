package superheroes;

/**
 *
 * @author AlumnoT
 */
public class Superheroe {

    private String nombre;
    private String descripcion;
    private boolean capa;

    /**
     *
     * @param nombre
     */
    public Superheroe(String nombre) {
        this.nombre = nombre;
        descripcion = "";
        capa = false;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the capa
     */
    public boolean isCapa() {
        return capa;
    }

    /**
     * @param capa the capa to set
     */
    public void setCapa(boolean capa) {
        this.capa = capa;
    }
    
    @Override
    public String toString(){
        return  "Superheroe: " + getNombre() + '\n'
                + "Descripcion: " + getDescripcion() + '\n' 
                + "Lleva Capa? " + isCapa();
    }
}
