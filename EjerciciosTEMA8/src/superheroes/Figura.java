package superheroes;

/**
 *
 * @author AlumnoT
 */
public class Figura {

    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimension;

    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimension = dimension;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the superheroe
     */
    public Superheroe getSuperheroe() {
        return superheroe;
    }

    /**
     * @param superheroe the superheroe to set
     */
    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    /**
     * @return the dimension
     */
    public Dimension getDimension() {
        return dimension;
    }

    /**
     * @param dimension the dimension to set
     */
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return  "Codigo de la figura: " + codigo + '\n'
                + "Precio: " + precio + '\n'
                + superheroe.toString() + '\n'
                + dimension.toString();
    }

    public void subirPrecio(double cantidad) throws PrecioException {
        if (cantidad != 0) {
            precio += cantidad;
        } else {
            throw new PrecioException("[ERROR] la cantidad a modificar no puede ser 0");
        }
    }
}
