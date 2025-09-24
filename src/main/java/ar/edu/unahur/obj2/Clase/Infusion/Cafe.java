package ar.edu.unahur.obj2.Clase.Infusion;

public class Cafe implements iInfusionable{

    @Override
    public Double costo() {
        return 1000.0;
    }

    @Override
    public void imprimir() {
        System.out.print("Cafe");
    }
    

}
