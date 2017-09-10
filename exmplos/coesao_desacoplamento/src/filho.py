from src.pai import Pai

class Filho(Pai):

    lista = []

    def cont_0_9(self, a):
        self.lista.append(a)
        for e in range(len(self.lista), 10, 1):
            return self.cont_0_9(len(self.lista))
