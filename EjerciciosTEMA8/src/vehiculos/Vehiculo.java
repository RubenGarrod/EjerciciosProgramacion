
package vehiculos;

/**
 *
 * @author alumnot
 */
public abstract class Vehiculo {
    private String matricula;
    private String modelo;
    
    public Vehiculo (String matricula, String modelo){
        this.matricula = matricula;
        this.modelo = modelo;       
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public abstract void imprimir();
}
