package ar.edu.unahur.obj2.Tp.Profugo.Decorator;

import ar.edu.unahur.obj2.Tp.Profugo.IProfugo;

public abstract class Decorator implements IProfugo {
    protected IProfugo profugo;

    public Decorator(IProfugo profugo) {
        this.profugo = profugo;
    }

    @Override
    public Integer getInocencia() { return profugo.getInocencia(); }

    @Override
    public Integer getHabilidad() { return profugo.getHabilidad(); }

    @Override
    public Boolean esNervioso() { return profugo.esNervioso(); }

    @Override
    public void volverseNervioso() { profugo.volverseNervioso(); }

    @Override
    public void dejarDeEstarNervioso() { profugo.dejarDeEstarNervioso(); }

    @Override
    public void reducirHabilidad(Integer unNumero) { profugo.reducirHabilidad(unNumero); }

    @Override
    public void disminuirInocencia(Integer unNumero) { profugo.disminuirInocencia(unNumero); }
} 
