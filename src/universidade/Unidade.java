import java.util.ArrayList;

public class Unidade {
    private String nome;
    private String gestor;
    private ArrayList<Curso> cursos;

    public Unidade(String nome, String gestor) {
        this.nome = nome;
        this.gestor = gestor;
        this.cursos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }
}
