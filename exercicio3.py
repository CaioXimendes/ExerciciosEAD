
qtd_notas = int(input("Olá, informe a quantidade de notas do aluno para o calculo da média:\n"))
notas_aluno = []
soma = 0
media = 0
for i in range (qtd_notas):
    notas_aluno.append(float(input(f"Informe a nota {i+1} do aluno:\n")))
    soma = soma + notas_aluno[i]
media = soma/qtd_notas
if media < 5:
    print("O aluno está reprovado, pois a média foi menor que 5")
elif media < 7:
    print("O aluno está em recuperação. média menor que 7")
elif media >= 7:
    if media == 10:
        print("Parabéns, aluno nota 10!!")
    else:
        print("aluno aprovado!")