package ar.edu.unahur.obj2.Tp.Profugo;

public interface IProfugo {
    Integer getInocencia();

    Integer getHabilidad();

    Boolean esNervioso();

    void volverseNervioso();

    void dejarDeEstarNervioso();

    void reducirHabilidad(Integer unNumero);

    void disminuirInocencia(Integer unNumero);
}
