package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import controle.Integra;

public class Entrada {

    Scanner sc = new Scanner(System.in);

    private Integra integra = new Integra();

    private static final String[] parametro = {"cpf",
            "cnpj",
            "data_nascimento",
            "nome",
            "sobrenome"};

    private static final List<String> dados = new ArrayList();

    public Entrada() {
        for (int i = 0; i < parametro.length; i++) {
            if(parametro[i] == "data_nascimento"){
                System.out.print("Digite a " + parametro[i] + " ");
            }
            else {
                System.out.print("Digite o " + parametro[i] + " ");
            }
            this.dados.add(sc.nextLine());
        }

        integra.desempacota(integra.acaoPessoa(
                getDados().set(0,"cpf"),
                getDados().set(1,"cnpj"),
                getDados().set(2,"data_nescimento"),
                getDados().set(3,"nome"),
                getDados().set(4,"sobrenome")));
    }

    public List<String> getDados() {
        return dados;
    }
}