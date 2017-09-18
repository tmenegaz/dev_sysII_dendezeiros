package oo;

public class Converte{

    public Converte(){}

    public String formata(String data){
        String dia = data.substring(0,2);
        String mes = data.substring(2,4);
        String ano = data.substring(4);
        return dia+"/"+mes+"/"+ano;
    }
}