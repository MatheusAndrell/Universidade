import java.util.ArrayList;

public class Curso {
    private String nome;
    private String coordenador;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Aluno> alunos;

    public Curso(String nome, String coordenador) {
        this.nome = nome;
        this.coordenador = coordenador;
        this.disciplinas = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}