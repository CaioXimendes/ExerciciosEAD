class Carro:
    def __init__(self, marca):
        self.marca = marca
        print(f"A marca do carro é {self.marca}")
    def peso_carro(self, peso):
        self.peso = peso
        if (self.peso > 1200):
            print("Carro acima de 1200kg")
        else:
            print(f"O peso do carro é {self.peso}")

marca_carro1 = input("Olá! Informe a marca do carro: \n")
carro1 = Carro(marca_carro1)

peso_carro1 = float(input("Informe o peso do carro: \n"))
carro1.peso_carro(peso_carro1)
