package oo;

import oo.Pessoa;

public class TipoPessoa extends Pessoa {

    private String cpf;
    private String cnpj;

    public TipoPessoa(){}

    public TipoPessoa(String cpf, String cnpj, String data_nescimento, String nome, String sobrenome) {
        super.setData_nascimento(data_nescimento);
        super.setNome(nome);
        super.setSobrenome(sobrenome);
        setCpf(cpf);
        setCnpj(cnpj);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

