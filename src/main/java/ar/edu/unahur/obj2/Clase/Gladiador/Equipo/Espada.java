package ar.edu.unahur.obj2.Clase.Gladiador.Equipo;

import ar.edu.unahur.obj2.Clase.Gladiador.Persona.iEquipable;

public class Espada extends Decorator{

    public Espada(iEquipable equipo) {
        super(equipo);
    }

    @Override
    public Integer doAtaque() {
        return 5;
    }

    @Override
    public Integer doDefensa() {
        return 0;
    }

}
