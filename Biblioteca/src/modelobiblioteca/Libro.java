package modelobiblioteca;

/**
 *
 * @author AlumnoT
 */
public class Libro {

    private String titulo;
    private int cantidad;

    public Libro(String titulo, int cantidad) {
        this.titulo = titulo;
        this.cantidad = cantidad;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    public void prestamo() {
        if (cantidad > 0) {
            cantidad--;
        } else {
            System.out.println("No hay ejemplares disponibles para prestamo.");
        }
    }

    public void devolucion() {
        cantidad++;
    }
}
