/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherosprogramacion;

import java.io.File;

/**
 *
 * @author AlumnoT
 */
public class CreacionYMovimientoCarpetas {

    public static void main(String[] args) {

        //Crear las carpetas 
        File misCosas = new File("C:/Users/AlumnoT/Documents", "Mis Cosas");
        File alfabeto = new File("C:/Users/AlumnoT/Documents", "Alfabeto");

        misCosas.mkdir();
        alfabeto.mkdir();
           
        //Mover las carpetas 
        File fotografias = new File("C:/Users/AlumnoT/Documents", "FOTOS");
        File libros = new File("C:/Users/AlumnoT/Documents", "LECTURAS");

        fotografias.renameTo(new File(misCosas, "Fotografias"));
        libros.renameTo(new File(misCosas, "Libros"));
          
        //Alfabeto
        for (char i = 'A'; i <= 'Z'; i++) {
            File tmp = new File(alfabeto, String.valueOf(i));
            tmp.mkdir();
        }
    }
}
