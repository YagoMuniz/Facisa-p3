# UNIFACISA PROGRAMAÇÃO III
Repositório de atividades da disciplina de programação 3 usando a linguagem java na UniFacisa.

## Contents
- [Part I](#facisa-p3)
    - [Singleton](#singleton)
    - [Package Visibility](#package-visibility)
    - [Diamond Problem](#diamond-problem)
    
### Singleton
  >   O singleton garante que uma classe tenha apenas uma instância e forneça um ponto estático de acesso à classe. Essa mesma 
  > instância poderá ser usada por diversas classes. Se a instância não estiver definida a própria classe Singleton criará essa   > nova instância.
  >   Um Exemplo do uso do Singleton é uma conexão com o banco de dados, usado por diversos usuários. Os usuários   
  > compartilharão uma única instância, quando o primeiro acesso for concluído, a instância da conexão é passada para o  
  > próximo.
  >
  > Exemplo prático em java: [Singleton](https://github.com/YagoMuniz/Facisa-p3/blob/master/Part%20I/SingletonProject/src/Singleton.java)

### Package Visibility
  > Projeto que visa simular o acesso à métodos e classes com diferente modificadores.
  >
  > Classes públicas podem ser instanciadas por qualquer classes.
  > Classes default só podem ser instanciadas por classes do mesmo pacote. 
  >
  > Métodos públicos podem ser usados por qualquer classe.
  > Métodos privados só podem ser usados pela classes que o implementou.
  > Métodos protected só podem ser usados pela classe que o implementou, classe do mesmo pacote ou classes filhas.
  > Métodos default só podem ser usados pela classe que o implementou ou qualquer classe do mesmo pacote.
 
### Diamond Problem
  > Em muitas linguagens de programação é possível usar heranças múltiplas, como c++ e python. As heranças múltiplas ṕodem trazer alguns problemas de conflito ao se referir a métodos da classe pai. A classe filha que herda de duas classes. pode tentar usar, ou sobrescrever um método que tenha o mesmo nome nas duas classes pai, a classes filha não poderá saber de qual classe está herdando.
  > Em Java não é possível herdar de duas classes diferentes.
