package ar.edu.unahur.obj2.Tp.Cazador;

import java.util.List;

import ar.edu.unahur.obj2.Tp.Profugo.IProfugo;


public class CazadorUrbano extends Cazador{

     public CazadorUrbano(Integer experiencia) {
        super(experiencia);
    }

    public CazadorUrbano(Integer experiencia, List<IProfugo> profugosCapturados) {
        super(experiencia, profugosCapturados);
    }

    @Override
    public Boolean doCondicionExtra(IProfugo p) {
        return !p.esNervioso();
    }

    @Override
    public void doAccionAdicional(IProfugo p) {
        p.dejarDeEstarNervioso();
    }
    
}
