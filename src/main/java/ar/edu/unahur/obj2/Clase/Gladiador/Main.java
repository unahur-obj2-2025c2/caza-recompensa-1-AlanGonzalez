package ar.edu.unahur.obj2.Clase.Gladiador;

import ar.edu.unahur.obj2.Clase.Gladiador.Equipo.Casco;
import ar.edu.unahur.obj2.Clase.Gladiador.Equipo.Escudo;
import ar.edu.unahur.obj2.Clase.Gladiador.Equipo.Espada;
import ar.edu.unahur.obj2.Clase.Gladiador.Persona.Gladiador;
import ar.edu.unahur.obj2.Clase.Gladiador.Persona.iEquipable;

public class Main {
    public static void main(String[] args){
        iEquipable g1 = new Gladiador();
        iEquipable escudo = new Escudo(g1);
        iEquipable casco = new Casco(escudo);
        iEquipable espada = new Espada(casco);
        System.out.print("EL ataque es de g1" +  g1.potenciaDeAtaque());
        System.out.print("");
        System.out.print("El ataque con escudo es" + escudo.potenciaDeAtaque());
    }
}
