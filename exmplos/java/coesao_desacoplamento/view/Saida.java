package view;

import oo.Pai;

public class Saida{

    public Saida(Pai pai){
        System.out.println(pai.getNome());
        System.out.println(pai.getSobrenome());
        System.out.println(pai.getData_nascimento());
        System.out.println(pai.getCpf());
        System.out.println(pai.getCnpj());
    }
}