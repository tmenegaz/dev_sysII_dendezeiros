from controle.integra import Integra, Pai, Filha, Filho, Neto

if __name__ == '__main__':

    integra = Integra()

    lista_pessoas = [Pai, Filha, Filho, Neto]

    for p in range(len(lista_pessoas)):
        obj = integra.acao_de_pessoa(lista_pessoas[p])
        integra.saida(obj)



