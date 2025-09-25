package ar.edu.unahur.obj2.Clase.Gladiador.Equipo;

import ar.edu.unahur.obj2.Clase.Gladiador.Persona.iEquipable;

public class Casco extends Decorator{

    public Casco(iEquipable equipo) {
        super(equipo);
    }

    @Override
    public Integer doAtaque() {
        return 0;
    }

    @Override
    public Integer doDefensa() {
        return  2;
    }

}
