# Rental Agency

Esta aplicação tem como objetivo solucionar o problema de uma locadora de carros que deseja 
a partir de uma situação (dias da semana, quantidade de passageiros e fidelidade do cliente),
encontrar qual das suas filiais possue o menor preço possível para o aluguel de um automóvel. 

### Pré-requisitos

Esta aplicação é um projeto Maven construída a partir da IDE Netbeans.
Portanto para perfeito funcionamento do projeto é necessário que as duas tecnologias estejam previamente disponíveis.

```
Netbeans 8.0.2
Maven
```

## Iniciando o projeto

Para abrir o projeto no netbeans, navegue até a página do projeto [RentalAgency](https://github.com/MatheusdeAndradeFlausino/RentalAgency), selecione a branch
matheus.flausino e faça o download ou clone do projeto para um diretório da sua máquina. Em seguida, 
abra a IDE Netbeans, clique na opção **Arquivo -> Abrir Projeto (Ctrl + Shift + O)** , navegue até o diretório
em que o projeto acabou de ser salvo e clique em Abrir.

Pronto! O projeto já estará disponível no seu netbeans.

### Executando

Para execução do programa é necessário informar um arquivo de instância que conterá os dados de entrada
que representam a situação de um cliente. Para tal é necessário que o arquivo de instância seja salvo
dentro da pasta resources do projeto, mais especificamente no diretório **src/main/resources** localizado dentro do projeto [RentalAgency](https://github.com/MatheusdeAndradeFlausino/RentalAgency).

Obs.: Um arquivo de instância de exemplo chamado ```instance.txt``` já se encontra localizado dentro desta pasta.

O formato do arquivo de instância segue o seguinte padrão:

```
<TIPO_CLIENTE>:<QUANTIDADE_DE_PASSAGEIROS>:<DATA_1>,<DATA_2>,...,<DATA_N>
<TIPO_CLIENTE>:<QUANTIDADE_DE_PASSAGEIROS>:<DATA_1>,<DATA_2>,...,<DATA_N>
  .
  .
  .
```

Como por exemplo:

```
Normal:1:16Mar2009(seg),17Mar2009(ter),18Mar2009(qua)
Premium:6:01Set2009(sab),02Set2009(dom)
Premium:1:16Mar2009(seg),17Mar2009(ter),18Mar2009(qua)
```

Obs>: seguir o padrão do arquivo de instância é fundamental para perfeita execução do algoritmo.

Note que o arquivo de instância permiti informar a situação de diversos clientes. O algoritmo é capaz
de ler cada uma das linhas, calcular o resultado e então exibir este resultado na tela.

## Algoritmos

Este projeto possui 3 algoritmos para calcular a solução desejada. Os 3 algoritmos são muito similares,
porém cada um deles leva em consideração algum fator que o faz ser um pouco mais específico.

### 1 - Algoritmo Padrão (DefaultAlgorithm)

Este algoritmo calculará qual locadora disponibilizará o automóvel no menor preço e havendo empate
, ou seja, mais de uma locadora oferencendo o mesmo preço para aluguel, ele listará ambas locadoras
e seus respectivos carros.

### 2 - Algoritmo Simples (SimpleAlgorithm)

Este algoritmo também calculará qual locadora disponibilizará o automóvel no menor preço, no entanto
não observará empates de preço, assumindo a primeira opção(locadora) encontrada como sendo a melhor.

### 3 - Fanático por carro sport (SportsFanAlgorithm)

Este algoritmo também calculará qual locadora disponibilizará o automóvel no menor preço, no entanto
havendo empate no preço do aluguel ele não pensará duas vezes em escolher a locadora que oferecer um carro sport.

### Escolhendo um algoritmo
Ao executar o projeto, será pedido para informar o nome do arquivo de instância. Digite apenas 'nome_arquivo'.'formato'.
Em seguida será apresentada um breve menu para a escolha do algoritmo, após isso o algoritmo será executado automaticamente e é só aguardar o fim.


## Exceções
Se no arquivo de instâncias existir uma instância(linha) que informe um número de passageiros
maior que o suportado por qualquer categoria de carro da locadora, então será lançada uma exceção
chamada **CrowdedCar**

## Construído com

* [NetBeans](https://netbeans.org/) - Ambiente de desenvolvimento
* [Maven](https://maven.apache.org/) - Gerenciador de dependências

## Autor

* **Matheus Flausino** - [Github](https://github.com/matheusdeandradeflausino)