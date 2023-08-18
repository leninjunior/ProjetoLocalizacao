package Dominio;



public class Mercado {

    private String nome;
    private String Endereco;


    public Mercado() {
    }

    public Mercado(String nome, String endereco) {
        this.nome = nome;
        Endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
}

