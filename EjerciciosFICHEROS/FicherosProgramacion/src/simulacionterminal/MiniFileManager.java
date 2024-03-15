package simulacionterminal;

import java.io.File;

/**
 *
 * @author AlumnoT
 */
public class MiniFileManager {
    File referencia = new File("C:\\Users\\AlumnoT");
    
    public boolean changeDir(String ruta){
        if(ruta.equals("..")){
            if(referencia.getParent() != null){
                referencia = new File(referencia.getParent());
                return true;
            }
        } else {
            File aux = new File(referencia.getAbsolutePath() + "/" + ruta);
            if(!aux.exists()){
                System.out.println("[ERROR] Ruta no valida.");
            } else {
                referencia = aux;
                System.out.println(referencia.getAbsolutePath());
            }
        }
        return false;
    }
}
