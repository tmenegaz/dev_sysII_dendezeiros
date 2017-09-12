
class Conversor():

    def substring(self, propriedade):
            dia = str.format(propriedade[0:2])
            mes = str.format(propriedade[2:4])
            ano = str.format(propriedade[4:])
            return (dia, mes, ano)