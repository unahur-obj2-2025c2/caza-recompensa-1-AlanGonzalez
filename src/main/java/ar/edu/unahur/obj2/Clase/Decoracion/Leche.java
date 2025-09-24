package ar.edu.unahur.obj2.Clase.Decoracion;

import ar.edu.unahur.obj2.Clase.Infusion.iInfusionable;

public class Leche extends Decorador{

    public Leche(iInfusionable decorado) {
        super(decorado);
    }

    @Override
    public Double doCosto() {
        return 500.0;
    }

    @Override
    public void doImprimir() {
        System.out.print("Leche");
    }

}
