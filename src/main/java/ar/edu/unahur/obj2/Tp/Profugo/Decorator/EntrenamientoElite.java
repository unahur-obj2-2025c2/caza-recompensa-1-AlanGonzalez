package ar.edu.unahur.obj2.Tp.Profugo.Decorator;

import ar.edu.unahur.obj2.Tp.Profugo.IProfugo;

public class EntrenamientoElite extends Decorator {

    public EntrenamientoElite(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Boolean esNervioso(){
        return Boolean.FALSE;
    }

    @Override
    public void volverseNervioso(){};

}
