package ar.edu.unahur.obj2.Tp.Cazador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Tp.Agencia.Agencia;
import ar.edu.unahur.obj2.Tp.Profugo.IProfugo;
import ar.edu.unahur.obj2.Tp.Profugo.Profugo;
import ar.edu.unahur.obj2.Tp.Profugo.Decorator.ArtesMarciales;
import ar.edu.unahur.obj2.Tp.Profugo.Decorator.EntrenamientoElite;
import ar.edu.unahur.obj2.Tp.Profugo.Decorator.ProteccionLegal;
import ar.edu.unahur.obj2.Tp.Zona.Zona;

public class CazadorTest {
    Cazador cazadorUrbano = new CazadorUrbano(25);

    Cazador cazadorRural = new CazadorRural(10);

    Cazador cazadorSigiloso = new CazadorSigiloso(40);

    IProfugo p1 = new Profugo(5,20, Boolean.TRUE);
    IProfugo p2 = new Profugo(3,34, Boolean.FALSE);
    IProfugo p3 = new Profugo(1,70, Boolean.TRUE);
    IProfugo p4 = new Profugo(15,40, Boolean.FALSE);

    @Test
    void primerTest(){
        List<IProfugo> profugos = new ArrayList<>(List.of(p1, p2, p3, p4));
        Zona unaZona = new Zona("Peligro", profugos);
        cazadorUrbano.capturarEn(unaZona);

        assertEquals(2, cazadorUrbano.cantidadCapturados());
        assertEquals(49, cazadorUrbano.getExperiencia());
    }

    @Test
    void segundoTest(){
        IProfugo p1ConArtesMarciales = new ArtesMarciales(p1);
        IProfugo p2ConEntrenamientoElite = new EntrenamientoElite(p2);
        IProfugo p2ConEntrenamientoEliteYProteccionLegal = new ProteccionLegal(p2ConEntrenamientoElite);

        List<IProfugo> profugos = new ArrayList<>(List.of(p1ConArtesMarciales, p2ConEntrenamientoEliteYProteccionLegal, p3, p4));
        Zona unaZona = new Zona("Peligro", profugos);

        cazadorUrbano.capturarEn(unaZona);

        assertEquals(1, cazadorUrbano.cantidadCapturados());
        assertEquals(61, cazadorUrbano.getExperiencia());

    }

    @Test
    void tercerTest(){
        IProfugo p1ConArtesMarciales = new ArtesMarciales(p1);
        IProfugo p2ConEntrenamientoElite = new EntrenamientoElite(p2);
        IProfugo p2ConEntrenamientoEliteYProteccionLegal = new ProteccionLegal(p2ConEntrenamientoElite);

        List<IProfugo> profugos = new ArrayList<>(List.of(p1ConArtesMarciales, p2ConEntrenamientoEliteYProteccionLegal, p3, p4));
        Zona unaZona = new Zona("Peligro", profugos);
        
        cazadorUrbano.capturarEn(unaZona);

        IProfugo p3ConArtesMarciales = new ArtesMarciales(p3);
        IProfugo p1ConEntrenamientoElite = new EntrenamientoElite(p1);
        IProfugo p1ConEntrenamientoEliteYProteccionLegal = new ProteccionLegal(p1ConEntrenamientoElite);
        IProfugo P4ConProteccionLegal = new ProteccionLegal(p4);

        List<IProfugo> profugos2 = new ArrayList<>(List.of(p1ConEntrenamientoEliteYProteccionLegal, p3ConArtesMarciales, P4ConProteccionLegal));
        Zona unaZona2 = new Zona("Peligro", profugos2);

        cazadorRural.capturarEn(unaZona2);

        IProfugo p4ConArtesMarciales = new ArtesMarciales(p4);
        IProfugo p4ConEntrenamientoEliteYMarciales = new EntrenamientoElite(p4ConArtesMarciales);
        IProfugo p2ConProteccionLegal = new ProteccionLegal(p2);
        IProfugo p3ConArtesMarcialess = new ArtesMarciales(p3);

        List<IProfugo> profugos3 = new ArrayList<>(List.of(p2ConProteccionLegal, p3ConArtesMarcialess,p4ConEntrenamientoEliteYMarciales));
        Zona unaZona3 = new Zona("Peligro", profugos3);

        cazadorSigiloso.capturarEn(unaZona3);

        List<Cazador> cazadores = new ArrayList<>(List.of(cazadorUrbano, cazadorRural, cazadorSigiloso));

        Agencia agencia = new Agencia(cazadores);



        assertEquals(cazadorUrbano, agencia.cazadorConMasCapturas());

        

    }
}
