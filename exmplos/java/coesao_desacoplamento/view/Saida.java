package view;

import oo.Pai;
import oo.Converte;

public class Saida{

    public Saida(Pai pai){
        System.out.println(pai.getNome());
        System.out.println(pai.getSobrenome());
        System.out.println(new Converte().formata(pai.getData_nascimento()));
        System.out.println(pai.getCpf());
        System.out.println(pai.getCnpj());
    }
}