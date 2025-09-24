package ar.edu.unahur.obj2.Clase.Decoracion;

import ar.edu.unahur.obj2.Clase.Infusion.iInfusionable;

public class Whisky extends Decorador {

    public Whisky(iInfusionable decorado) {
        super(decorado);
    }

    @Override
    public Double doCosto() {
        return 600.0;
    }

    @Override
    public void doImprimir() {
        System.out.print("Whisky");
    }
    
}
