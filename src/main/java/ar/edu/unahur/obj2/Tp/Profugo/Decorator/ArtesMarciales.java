package ar.edu.unahur.obj2.Tp.Profugo.Decorator;

import ar.edu.unahur.obj2.Tp.Profugo.IProfugo;

public class ArtesMarciales extends Decorator {

    public ArtesMarciales(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getHabilidad() {
        return Integer.min(super.getHabilidad() * 2, 100);
    }
    
}
