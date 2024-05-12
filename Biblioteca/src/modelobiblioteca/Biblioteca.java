
package modelobiblioteca;

import java.util.ArrayList;

/**
 *
 * @author AlumnoT
 */
public class Biblioteca {
    private ArrayList<Libro> listaLibros;

    public Biblioteca() {
        this.listaLibros = new ArrayList<Libro>();
    }

    /**
     * @return the listaLibros
     */
    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    /**
     * @param listaLibros the listaLibros to set
     */
    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    public void añadirLibro(Libro l){
        listaLibros.add(l);
    }
    
    public void borrarLibro(Libro l){
        for(Libro tmp : listaLibros){
            if(tmp.getTitulo().equals(l.getTitulo())){
                listaLibros.remove(l);
            } 
        }
    }
}
