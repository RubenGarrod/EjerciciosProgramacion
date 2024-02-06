package superheroes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AlumnoT
 */
public class Coleccion {

    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombre, ArrayList<Figura> listaFiguras) {
        this.nombreColeccion = nombre;
        this.listaFiguras = new ArrayList<Figura>();
    }

    /**
     * @return the nombreColeccion
     */
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    /**
     * @param nombreColeccion the nombreColeccion to set
     */
    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    /**
     * Recibe un objeto de la clase figura y lo añade a la lista de una
     * coleccion
     *
     * @param fig
     */
    public void añadirFigura(Figura fig) {
        listaFiguras.add(fig);
    }

    /**
     *
     * @param cantidad
     * @param codigo
     * @throws PrecioException
     */
    public void subirPrecio(double cantidad, String codigo) throws PrecioException {
        for (Iterator<Figura> it = listaFiguras.iterator(); it.hasNext();) {
            Figura figura = it.next();
            if (figura.getCodigo().equals(codigo)) {
                if (cantidad != 0) {
                    double precio = figura.getPrecio();
                    precio += cantidad;
                    figura.setPrecio(precio);
                    System.out.println("Precio de la figura con ID " + codigo + " actualizado a " + precio);
                    return;
                } else {
                    throw new PrecioException("[ERROR] la cantidad a modificar no puede ser 0");
                }
            }
        }
    }

    @Override
    public String toString() {
        String datosColeccion = "Coleccion : " + nombreColeccion + '\n';
        datosColeccion += "Figuras: \n";
        for (Iterator<Figura> it = listaFiguras.iterator(); it.hasNext();) {
            Figura figura = it.next();
            datosColeccion += figura + "\n";
        }
        return datosColeccion;
    }

    /**
     * Recorre todos los objetos figura de una lista y comprueba si los
     * superheroes de dichas figuras llevan capa creando una cadena de texto con
     * los nombres de los que llevan capa
     *
     * @return
     */
    public String conCapa() {
        String tienenCapa = "Figuras con capa en la coleccion " + nombreColeccion + ":\n";
        for (Iterator<Figura> it = listaFiguras.iterator(); it.hasNext();) {
            Figura figura = it.next();
            if (figura.getSuperheroe().isCapa()) {
                tienenCapa += figura.getSuperheroe() + "\n";
            }
        }
        return tienenCapa;
    }

    /**
     * Recorre todos los objetos figura de una lista coleccion y compara sus
     * precios imprimiendo la informacion de la figura con el precio mas alto.
     */
    public void masValiosa() {
        Figura figuraMasValiosa = listaFiguras.get(0);
        for (Iterator<Figura> it = listaFiguras.iterator(); it.hasNext();) {
            Figura figura = it.next();
            if (figura.getPrecio() > figuraMasValiosa.getPrecio()) {
                figuraMasValiosa = figura;
            }
        }
        System.out.println("La Figura mas valiosa de la coleccion es: ");
        figuraMasValiosa.toString();
    }

    /**
     * Recorre todos los objetos figura de una lista y suma sus precios
     * devolviendo el valor total de la coleccion.
     *
     * @return double valorTotal
     */
    public double getValorColeccion() {
        double valorTotal = 0;
        for (Iterator<Figura> it = listaFiguras.iterator(); it.hasNext();) {
            Figura a = it.next();
            valorTotal += a.getPrecio();
        }
        return valorTotal;
    }

    public double getVolumenColeccion() {
        double volumenTotal = 0;
        for (Iterator<Figura> it = listaFiguras.iterator(); it.hasNext();) {
            Figura a = it.next();
            volumenTotal += a.getDimension().getVolumen(a.getDimension().getAlto(), a.getDimension().getAncho(), a.getDimension().getProfundidad());
        }
        return volumenTotal;
    }

}
