package ar.edu.unahur.obj2.Tp.Cazador;



import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Tp.Profugo.IProfugo;

import ar.edu.unahur.obj2.Tp.Zona.Zona;


public abstract class Cazador {
    private Integer experiencia;
    protected List<IProfugo> profugosCapturados = new ArrayList<>();



    public Cazador(Integer experiencia, List<IProfugo> profugosCapturados) {
        this.experiencia = experiencia;
        this.profugosCapturados = profugosCapturados;

    }

    

    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }



    public List<IProfugo> getProfugosCapturados(){
        return profugosCapturados;
    }

    public Integer getExperiencia(){
        return experiencia;
    }

    public Integer cantidadCapturados() {
        return profugosCapturados.size();
    }

    private void sumaExperiencia(Zona unaZona){
        if (this.cantidadCapturados() > 0 || !unaZona.getProfugos().isEmpty()){
            experiencia += unaZona.minProfugoHabilidad() + 2 * this.cantidadCapturados();
        }
    }

    public void capturarEn(Zona unaZona){
        List<IProfugo> profugosACapturar = new ArrayList<>(unaZona.getProfugos());
        for(IProfugo p : profugosACapturar){
            if(experiencia > p.getInocencia() && doCondicionExtra(p)){
                profugosCapturados.add(p);
                unaZona.profugoCapturado(p);
            }
            else{
                p.disminuirInocencia(2);
                doAccionAdicional(p);
            }            
        }
        this.sumaExperiencia(unaZona);
    }

    public abstract Boolean doCondicionExtra(IProfugo p);
    public abstract void doAccionAdicional(IProfugo p);
}
