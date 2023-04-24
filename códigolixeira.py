#Crie um codigo que simule uma lixeira, ela terá um volume total de 1kg ou 1000g.
# a cada item adicionado o usuario informa a quantidade de gramas do item até que o volume seja preenchido
# a cada item adicionado pergunte se o usuário quer adicionar mais um item ou excluir um item da lixeira ou sair da lixeira
# quando a lixeira estiver totalmente preenchida avise ao usuario e pergunte se o usuário deseja excluir algum item da lixeira
# e qual item ele deseja excluir da lixeira, ele informa o item e responde a pergunta confirmando a exclusao
# pergunte se o usuario deseja continuar ou sair da lixeira

lixeira =[]
total_lixeira = 0
posicao_item = 0
pergunta_menu = 0
pergunta_menu2 = 0



while pergunta_menu != 3:
    while True:
        if total_lixeira < 1000:
            pergunta_menu = int(input("Digite 1 para adicionar um item a lixeira:\n"
                                      "Digite 2 para excluir um item da lixeira:\n"
                                      "Digite 3 para sair: \n"))
            match pergunta_menu:
                case 1:
                    lixeira.append(float(input("Digite a quantidade de gramas do item:\n")))
                    total_lixeira = sum(lixeira)
                case 2:
                    posicao_item = int(input("Informe qual item da lixeira você quer excluir:\n"))
                    pergunta_decisao = input("Você tem certeza de que quer excluir? Sim ou Não\n")
                    match pergunta_decisao:
                        case "Sim":
                            del lixeira[posicao_item]
                        case "Não":
                            break
                case 3:
                    pergunta_menu = 3
                    print("Obrigado por usar a lixeira!!")
                    break
        elif total_lixeira >= 1000 and pergunta_menu2 != "sair":
            pergunta_menu2 = input("A lixeira está cheia, você deseja excluir algum item ou sair?\n"
                                   "Digite excluir para remover um item:\n"
                                   "Digite sair para sair da lixeira:\n")
            match pergunta_menu2:
                case "excluir":
                    posicao_item = int(input("Informe qual item da lixeira você quer excluir:\n"))
                    del lixeira[posicao_item]
                    break
                case "sair":
                    print("Obrigado por usar a lixeira!!")
                    pergunta_menu = 3
                    break

