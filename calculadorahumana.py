from sys import exit

divisor = float
dividendo = float
quociente = float
resto = float
valordivisao = float
variavel = 0
quocientevisual = [0,0]

divisor = float(input("Olá, informe o valor do divisor: "))
dividendo = float(input("Certo, agora informe o valor do dividendo: "))

if divisor > dividendo:
    quociente = 0
    quocientevisual[0] = quociente
    valordivisao = quociente*divisor
    resto = dividendo - valordivisao
    if resto < divisor:
        variavel = resto*10
        quocientevisual [1] = ","     
        print(f"{dividendo}|___{divisor}___")
        print(f"{valordivisao}     {quocientevisual}")
        print(f"{variavel}")
        
        for k in range(100):
            if quociente*divisor > variavel:
                quociente-=1
                valordivisao = quociente*divisor
                variavel = variavel - valordivisao
                variavel = variavel*10
                quocientevisual.append(quociente)
                print(f"{dividendo}|___{divisor}___")
                print(f"{valordivisao}     {quocientevisual}")
                print(f"{variavel}")
                quociente=quociente-k
            else:
                quociente+=1
    
elif divisor < dividendo:
    quociente = 1
    quocientevisual[0] = quociente
    if dividendo%divisor == 0:
        for y in range(100):
            if dividendo - (quociente*divisor) != 0:
                quociente+=1
            else:
                valordivisao = quociente*divisor
                resto = dividendo - valordivisao
                quocientevisual[0] = quociente
                print(f"{dividendo}|___{divisor}___")
                print(f"{valordivisao}     {quocientevisual}")
                print(f"{resto}")
                exit()
                break
    else:
        for z in range(100):
            if quociente*divisor < dividendo:
                quociente+=1
            else:
                quociente-=1
                valordivisao = quociente*divisor
                resto = dividendo - valordivisao
                quocientevisual[0] = quociente
                break
        if resto < divisor:
            variavel = resto*10
            quocientevisual [1] = ","     
            print(f"{dividendo}|___{divisor}___")
            print(f"{valordivisao}     {quocientevisual}")
            print(f"{variavel}")
            quociente=0
        #elif resto == 0:
            #print(f"{dividendo}|___{divisor}___")
            #print(f"{valordivisao}     {quocientevisual}")
            #print(f"{variavel}")
            for x in range(100):
                if quociente*divisor > variavel:
                    quociente-=1
                    valordivisao = quociente*divisor
                    variavel = variavel - valordivisao
                    quocientevisual.append(quociente)
                    print(f"{dividendo}|___{divisor}___")
                    print(f"{valordivisao}     {quocientevisual}")
                    print(f"{variavel}")
                    quociente=quociente-x
                    variavel = variavel*10
                else:
                    quociente+=1