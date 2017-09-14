package oo;

public class Pessoa{
    private String data_nascimento;
    private String nome;
    private String sobrenome;

    public Pessoa(){}

    public Pessoa(String data_nascimento, String nome, String sobrenome) {
        setData_nascimento(data_nascimento);
        setNome(nome);
        setSobrenome(sobrenome);
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}

