package padroescomportamentais.iterator;

import java.util.Iterator;

public class LocalDeEntrega {

    public static Integer ContarProvasLP(Pacote localDeEntrega) {
        int quantidade = 0;
        for (Prova prova : localDeEntrega) {
            if (prova.getIdDisciplina() == 1) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer ContarProvasMT(Pacote localDeEntrega) {
        int quantidade = 0;
        for (Prova prova : localDeEntrega) {
            if (prova.getIdDisciplina() == 2) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalProvas(Pacote localDeEntrega) {
        int quantidade = 0;
        for (Iterator a = localDeEntrega.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
