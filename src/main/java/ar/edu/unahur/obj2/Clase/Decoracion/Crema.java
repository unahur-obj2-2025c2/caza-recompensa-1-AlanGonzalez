package ar.edu.unahur.obj2.Clase.Decoracion;

import ar.edu.unahur.obj2.Clase.Infusion.iInfusionable;

public class Crema extends Decorador {

    public Crema(iInfusionable decorado) {
        super(decorado);
        
    }

    @Override
    public Double doCosto() {
        return 300.0;
    }

    @Override
    public void doImprimir() {
        System.out.print("Crema");
    }

}
