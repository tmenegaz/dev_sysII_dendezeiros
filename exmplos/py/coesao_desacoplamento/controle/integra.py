from src.filho import Filho
from src.pai import Pai
from src.filha import Filha
from src.neto import Neto
from src.conversor import Conversor


class Integra():

    def entrada_dados(self):
        lista_text = ['cpf', 'cnpj', 'data de nascimento', 'nome', 'sobrenome']
        lista_dados = []
        texto = 'Digite o seu'
        for e in range(len(lista_dados), 5):
            if lista_text[e] == 'data de nascimento':
                texto = 'Digite a sua'
            lista_dados.append(input(texto+' {} '.format(lista_text[e])))
        return lista_dados


    def acao_de_pessoa(self, obj_pessoa):
            (cpf, cnpf, data_nascimento, nome, sobrenome) = self.entrada_dados()
            pai = obj_pessoa(cpf, cnpf, data_nascimento, nome, sobrenome)
            pai.cont_0_9(0)
            return pai

    def saida(self, obj):
        print(obj.__class__.__name__)
        diaS, mesS, anoS = Conversor().substring(str(obj.data_nascimento))
        dia, mes, ano = Conversor().substring(int(obj.data_nascimento))

        print(obj.cpf, obj.cnpj, '%s/%s/%s' % (diaS, mesS, anoS), obj.nome, obj.sobrenome)
        for e in obj.lista:
            print(obj.__class__.__name__, e)
