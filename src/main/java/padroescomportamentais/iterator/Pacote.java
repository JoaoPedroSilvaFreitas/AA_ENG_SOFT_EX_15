package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Pacote implements Iterable<Prova>{

    private List<Prova> alunos = new ArrayList<Prova>();

    public Pacote(Prova... alunos) {
        this.alunos = Arrays.asList(alunos);
    }

    @Override
    public Iterator<Prova> iterator() {
        return alunos.iterator();
    }

}


