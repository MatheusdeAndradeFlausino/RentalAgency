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

Para abrir o projeto no netbeans, navegue até a página do projeto [RentalAgency](https://github.com/MatheusdeAndradeFlausino/RentalAgency)
e faça o download ou clone do projeto para um diretório da sua máquina. Em seguida, 
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

Note que, seguir o padrão do arquivo de instância é fundamental para execução do algoritmo



## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [NetBeans](https://netbeans.org/) - Ambiente de desenvolvimento
* [Maven](https://maven.apache.org/) - Gerenciador de dependências

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Autor

* **Matheus Flausino** - [Github](https://github.com/matheusdeandradeflausino)