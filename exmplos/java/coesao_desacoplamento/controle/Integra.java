package controle;
import oo.Pai;
import oo.Filha;
import oo.Filho;
import oo.Neto;
import view.Saida;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Integra{

    Pai pai = null;

    List listaPessoas = new ArrayList();

    public List acaoPessoa(String cpf, String cnpj, String data_nescimento,
                           String nome, String sobrenome){

        pai = new Pai(cpf, cnpj, data_nescimento, nome, sobrenome);
        listaPessoas.add(0,pai);

        Filha filha = new Filha(cpf, cnpj, data_nescimento, nome, sobrenome);
        listaPessoas.add(1, filha);

        Filho filho = new Filho(cpf, cnpj, data_nescimento, nome, sobrenome);
        listaPessoas.add(2,filho);

        Neto neto = new Neto(cpf, cnpj, data_nescimento, nome, sobrenome);
        listaPessoas.add(3, neto);

        return listaPessoas;
    }

    public void desempacota(List pessoas){
        Iterator <Pai> iterator = pessoas.iterator();
        new Saida(iterator.next());


    }
}