package ar.edu.unahur.obj2.Clase;

import ar.edu.unahur.obj2.Clase.Decoracion.Crema;
import ar.edu.unahur.obj2.Clase.Decoracion.Leche;
import ar.edu.unahur.obj2.Clase.Decoracion.Whisky;
import ar.edu.unahur.obj2.Clase.Infusion.Cafe;
import ar.edu.unahur.obj2.Clase.Infusion.iInfusionable;

public class Main {
    public static void main(String[] args){
        iInfusionable cafe = new Cafe();
        iInfusionable cafeConLeche = new Leche(cafe);
        iInfusionable cafeConCrema = new Crema(cafeConLeche);
        iInfusionable cafeIrlandes = new Whisky(cafeConCrema);
        System.out.println(cafeIrlandes.costo());
        cafeIrlandes.imprimir();
    }
}
