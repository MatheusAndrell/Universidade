import java.util.ArrayList;

public class Universidade {
    private String nome;
    private String endereco;
    private String cidade;
    private ArrayList<Unidade> unidades;

    public Universidade(String nome, String endereco, String cidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.unidades = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Unidade> getUnidades() {
        return unidades;
    }

    public void setUnidades(ArrayList<Unidade> unidades) {
        this.unidades = unidades;
    }

    public void addUnidade(Unidade unidade) {
        this.unidades.add(unidade);
    }
}