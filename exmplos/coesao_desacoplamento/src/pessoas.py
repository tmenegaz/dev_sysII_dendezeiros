class Pessoa():

    _data_nascimento = ''
    _nome = ''
    _sobrenome = ''

    def __init__(self, data_nascimento='', nome='', sobrenome=''):
        self.data_nascimento = data_nascimento
        self.nome = nome
        self.sobrenome = sobrenome

    @property
    def data_nascimento(self):
        return self._data_nascimento

    @data_nascimento.setter
    def data_nascimento(self, data_nascimento):
        self._data_nascimento = data_nascimento

    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, nome):
        self._nome = nome

    @property
    def sobrenome(self):
        return self._sobrenome

    @sobrenome.setter
    def sobrenome(self, sobrenome):
        self._sobrenome = sobrenome

class TipoDePessoa(Pessoa):

    _cpf = ''
    _cnpj = ''

    def __init__(self, cpf='', cnpj='', data_nascimento='', nome='', sobrenome=''):
        super(TipoDePessoa, self).__init__(data_nascimento, nome, sobrenome)
        self.cpf = cpf
        self.cnpj = cnpj

    @property
    def cpf(self):
        return self._cpf

    @cpf.setter
    def cpf(self, cpf):
        self._cpf = cpf

    @property
    def cnpj(self):
        return self._cnpj

    @cnpj.setter
    def cnpj(self, cnpj):
        self._cnpj = cnpj
