/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electrodomesticos;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author AlumnoT
 */
public class MainPruebas {
    public static void main(String[] args){
        Electrodomestico e1 = new Electrodomestico("Micro","Balay",0.25);
        ArrayList<Electrodomestico> cocina = new ArrayList<Electrodomestico>();
        cocina.add(e1);
        System.out.println(e1);
        e1.imprimir();
        int horas = 5;
        double preciokWh = 50;
        double consumo = e1.getConsumo(horas);
        double coste = e1.getCosteConsumo(horas,preciokWh);
        System.out.println("El consumo es de " + consumo + " el coste del consumo es " + coste);
        
        Lavadora l1 = new Lavadora("Bosch",400,preciokWh,false);
        l1.imprimir();
        System.out.println("El consumo es " + l1.getConsumo(horas));
        for(Iterator<Electrodomestico> it = cocina.iterator(); it.hasNext();){
            Electrodomestico a = it.next();
            a.imprimir();
        }
    }
}
