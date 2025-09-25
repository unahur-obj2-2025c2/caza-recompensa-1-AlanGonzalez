package ar.edu.unahur.obj2.Clase.Gladiador.Equipo;

import ar.edu.unahur.obj2.Clase.Gladiador.Persona.iEquipable;

public class Escudo extends Decorator{

    public Escudo(iEquipable equipo) {
        super(equipo);
    }

    @Override
    public Integer doAtaque() {
        return 1;
    }

    @Override
    public Integer doDefensa() {
        return 7;
    }

}
