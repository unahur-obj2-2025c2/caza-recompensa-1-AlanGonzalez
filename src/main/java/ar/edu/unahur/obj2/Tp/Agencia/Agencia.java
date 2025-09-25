package ar.edu.unahur.obj2.Tp.Agencia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unahur.obj2.Tp.Cazador.Cazador;
import ar.edu.unahur.obj2.Tp.Profugo.IProfugo;

public class Agencia {
    private List<Cazador> cazadores = new ArrayList<>();

    public Agencia(List<Cazador> cazadores) {
        this.cazadores = cazadores;
    }

    public List<IProfugo> todosLosProfugos(){
        return cazadores.stream().flatMap(c -> c.getProfugosCapturados().stream()).collect(Collectors.toList());
    }

    public IProfugo profugoMasHabilidoso(){
        return todosLosProfugos().stream().max(Comparator.comparingInt(p->p.getHabilidad())).orElse(null);
    }

    public Cazador cazadorConMasCapturas(){
        return cazadores.stream().max(Comparator.comparingInt(c->c.cantidadCapturados())).orElse(null);
    }

    
    
}
