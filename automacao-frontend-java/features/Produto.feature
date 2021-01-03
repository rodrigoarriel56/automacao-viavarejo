# language: pt
# encoding UTF-8

Funcionalidade: Selecionar produto no site casas Bahia

  Contexto: Evidenciar Teste;
    Dado que utilizo o word para evidências com as informações de execução
      | Site Casas Bahia | CT - 0001 | Inserir produto Iphone no carrinho | Iphone | Produto selecionado com sucesso | Rodrigo Arriel | 01 | 01 |

  @execute @pedido @chrome-same-session @generate-word
  Esquema do Cenario: CT - Produto - selecionar produto no site das casas Bahia
  
    Dado que estou no site das casas bahia através da url "url"
    Quando preencho o campo busca <PRODUTO>
    Quando seleciono o produto na grid <LISTA>
    Quando filtro os produtos apresentados
    Quando seleciono o detalhes do produto
    Quando preencho campo cep <CEP>
    E aciono o botao continuar
    E aciono botao comprar mais produtos
    Quando aciono carrinho na home    
    Então sera apresentado o produto no carrinho
    
    Exemplos:
      |  PRODUTO |    LISTA   | 	 CEP		 | 
      | "Iphone" | "IPHONE XR"| "01153020" |
