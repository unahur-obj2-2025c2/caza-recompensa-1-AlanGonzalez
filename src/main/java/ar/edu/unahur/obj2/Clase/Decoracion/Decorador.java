package ar.edu.unahur.obj2.Clase.Decoracion;

import ar.edu.unahur.obj2.Clase.Infusion.iInfusionable;

public abstract class Decorador implements iInfusionable {
    protected iInfusionable decorado;

    public Decorador(iInfusionable decorado) {
        this.decorado = decorado;
    }

    @Override
    public Double costo(){
        return decorado.costo() + doCosto();
    }

    public abstract Double doCosto();

    @Override
    public void imprimir(){
        decorado.imprimir();
        System.out.print(" con ");
        doImprimir();
    }

    public abstract void doImprimir();
}
