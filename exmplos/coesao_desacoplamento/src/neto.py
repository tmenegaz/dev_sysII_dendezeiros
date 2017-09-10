from src.filha import Filha

class Neto(Filha):

    lista = []

    def cont_0_9(self, a):
        self.lista.append(a)
        while len(self.lista) < 10:
            return self.cont_0_9(len(self.lista))
