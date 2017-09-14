package oo;

public class Pai extends TipoPessoa implements Abstrata {

    public Pai(){}

    public Pai(String cpf, String cnpj,
               String data_nescimento,
               String nome,
               String sobrenome){
        super.setCpf(cpf);
        super.setCnpj(cnpj);
        super.setData_nascimento(data_nescimento);
        super.setNome(nome);
        super.setSobrenome(sobrenome);
    }

    int[] lista = new int[10];

    public int cont_0_9(int a){
        for(int i =0; i < 10; i++) {
            lista[i] = a;
            return lista[i];
        }
        return 0;
    }

}