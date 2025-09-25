package ar.edu.unahur.obj2.Tp.Cazador;

import java.util.List;

import ar.edu.unahur.obj2.Tp.Profugo.IProfugo;


public class CazadorSigiloso extends Cazador {

     public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }

    public CazadorSigiloso(Integer experiencia, List<IProfugo> profugosCapturados) {
        super(experiencia, profugosCapturados);
    }

    @Override
    public Boolean doCondicionExtra(IProfugo p) {
        return p.getHabilidad() < 50;
    }

    @Override
    public void doAccionAdicional(IProfugo p) {
        p.reducirHabilidad(5);
    }

}
