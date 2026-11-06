package padroescomportamentais.iterator;

public class Prova {

    private String sequencial;
    private int id_disciplina;

    public Prova(String sequencial, int id_disciplina) {
        this.sequencial = sequencial;
        this.id_disciplina = id_disciplina;
    }

    public String getSequencial() {
        return sequencial;
    }

    public void setSequencial(String sequencial) {
        this.sequencial = sequencial;
    }

    public int getIdDisciplina() {
        return id_disciplina;
    }

}
