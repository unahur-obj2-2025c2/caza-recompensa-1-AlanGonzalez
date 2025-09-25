package ar.edu.unahur.obj2.Clase.Gladiador.Equipo;

import ar.edu.unahur.obj2.Clase.Gladiador.Persona.iEquipable;

public abstract class Decorator implements iEquipable{
    protected iEquipable equipado;

    public Decorator(iEquipable equipo) {
        this.equipado = equipo;
    }

    @Override
    public Integer potenciaDeAtaque(){
        return equipado.potenciaDeAtaque() + doAtaque();
    }

    @Override
    public Integer potenciaDeDefensa(){
        return equipado.potenciaDeAtaque() + doDefensa();
    }

    public abstract Integer doAtaque();
    public abstract Integer doDefensa();

}
