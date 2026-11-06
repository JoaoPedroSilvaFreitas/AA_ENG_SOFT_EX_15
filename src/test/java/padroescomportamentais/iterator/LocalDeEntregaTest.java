package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalDeEntregaTest {

    @Test
    void deveContarTotalProvasPacote() {
        Pacote curso = new Pacote(
                new Prova("1001", 1),
                new Prova("1002", 1),
                new Prova("2001", 2),
                new Prova("2002", 2)
        );
        assertEquals(4, LocalDeEntrega.contarTotalProvas(curso));
    }


    @Test
    void deveContarProvasLPPacote() {
        Pacote curso = new Pacote(
                new Prova("1001", 1),
                new Prova("1002", 1),
                new Prova("2001", 2),
                new Prova("2002", 2)        );
        assertEquals(2, LocalDeEntrega.ContarProvasLP(curso));
    }

    
    @Test
    void deveContarProvasMTPacote() {
        Pacote curso = new Pacote(
                new Prova("1001", 1),
                new Prova("1002", 1),
                new Prova("2001", 2),
                new Prova("2002", 2)        );
        assertEquals(2, LocalDeEntrega.ContarProvasMT(curso));
    }

}