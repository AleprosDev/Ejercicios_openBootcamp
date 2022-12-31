def suma(a,b,c):
    resultado = a + b + c
    return resultado

print(suma(1,2,3))


class Coche:
    def __init__(self, puertas):
        self.puertas = puertas

    def incremPuertas(self):
        self.puertas += 1

coche = Coche(4)
coche.incremPuertas()
print(coche.puertas)
    