package ar.edu.unahur.obj2.Tp.Zona;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unahur.obj2.Tp.Profugo.IProfugo;

public class Zona {
    private String nombre;
    private List<IProfugo> profugos = new ArrayList<>();

    public Zona(String nombre, List<IProfugo> profugos) {
        this.nombre = nombre;
        this.profugos = profugos;
    }

    public String getNombre(){
        return nombre;
    }


    public List<IProfugo> getProfugos(){
        return profugos;
    }

    public List<Integer> nivelInocenciaDeTodos(){
        return profugos.stream().map(p -> p.getInocencia()).collect(Collectors.toList());
    }


    public void profugoCapturado(IProfugo p){
        profugos.remove(p);
    }

    public Integer minProfugoHabilidad(){
        return profugos.stream().mapToInt(p->p.getHabilidad()).min().orElse(0);
    }

    

    
}
