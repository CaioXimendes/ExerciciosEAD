login = "caioximendes"
senha = "123"

login = input("Olá, informe o seu login: \n")
senha = input("Agora informe a sua senha: \n")

if login != "caioximendes" or senha != "123":
    print("Seus dados estão incorretos, acesso negado!")
else:
    print("Login realizado com sucesso! acesso permitido!")