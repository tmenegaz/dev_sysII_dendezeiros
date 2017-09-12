from src.abstrata import Abstrata
from src.pessoas import TipoDePessoa


class Pai(TipoDePessoa, Abstrata):

    lista = []

    def __init__(self, cpf='', cnpj='', data_nascimento='', nome='', sobrenome=''):
        super(Pai, self).__init__(cpf, cnpj, data_nascimento, nome, sobrenome)

    def cont_0_9(self, a):
        self.lista.append(a)
        while len(self.lista) < 10:
            return self.cont_0_9(len(self.lista))

