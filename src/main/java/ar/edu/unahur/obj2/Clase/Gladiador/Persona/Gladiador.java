package ar.edu.unahur.obj2.Clase.Gladiador.Persona;

public class Gladiador implements iEquipable{

    @Override
    public Integer potenciaDeAtaque() {
        return 10;
    }

    @Override
    public Integer potenciaDeDefensa() {
        return 5;
    }

}
