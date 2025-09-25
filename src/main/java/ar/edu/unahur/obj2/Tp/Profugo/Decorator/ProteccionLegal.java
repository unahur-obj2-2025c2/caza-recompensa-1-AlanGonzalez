package ar.edu.unahur.obj2.Tp.Profugo.Decorator;

import ar.edu.unahur.obj2.Tp.Profugo.IProfugo;

public class ProteccionLegal extends Decorator{

    public ProteccionLegal(IProfugo entrenable) {
        super(entrenable);
    }

    @Override
    public Integer getInocencia(){
        return Integer.max(super.getInocencia(), 40);
    }
}
