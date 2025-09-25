package ar.edu.unahur.obj2.Tp.Profugo;



public class Profugo implements IProfugo {
    private Integer nivelInocencia;
    private Integer nivelHabilidad;
    private boolean estaNervioso;

    
    
    public Profugo(Integer nivelInocencia, Integer nivelHabilidad, boolean estaNervioso) {
        this.nivelInocencia = nivelInocencia;
        this.nivelHabilidad = nivelHabilidad;
        this.estaNervioso = estaNervioso;
    }
    @Override
    public Integer getInocencia() {
        return nivelInocencia;
    }
    @Override
    public Integer getHabilidad() {
        return nivelHabilidad;
    }
    @Override
    public Boolean esNervioso() {
        return estaNervioso;
    }
    @Override
    public void volverseNervioso() {
        estaNervioso = Boolean.TRUE;
    }
    @Override
    public void dejarDeEstarNervioso() {
        estaNervioso = Boolean.FALSE;
    }
    @Override
    public void reducirHabilidad(Integer unNumero) {
        nivelHabilidad = Integer.max(nivelHabilidad - unNumero, 0);

    }
    @Override
    public void disminuirInocencia(Integer unNumero) {
        nivelInocencia = Integer.max(nivelInocencia - unNumero, 0);
    }

    public void setNivelHabilidad(int nivelHabilidad) {
        if (nivelHabilidad < 1) {
            this.nivelHabilidad = 1;
        } else if (nivelHabilidad > 100) {
            this.nivelHabilidad = 100;
        } else {
            this.nivelHabilidad = nivelHabilidad;
        }
    }
    
    
}
