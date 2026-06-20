# POO - Programação orientada a objeto em Java 

## Ementa

**1. Introdução a linguagem Java**
- Programação orientada a objeto 
- 

**2. Conceitos estruturais**
- Classes
- Atributos
- Métodos
- Objetos

**3. Conceitos relacionais**
- Herança
- Polimorfismo
- Associação
- Interface

**4. Conceitos organizacionais**
- Pacotes
- Visibilidades (modificadores de acesso)

## 1. Introdução a linguagem Java 

**Programação orientada a objeto**
 
A programação orientada a objeto é um paradigma de desenvolvimento de software com base em objetos do mundo real. Estes objetos são instanciados (criados) a partir de um template (classe) que descreve seus atributos (dados), métodos (comportamentos).

Os quatro pilares da POO
- encapsulamento
- herança
- polimorfismo
- abstração

Benefícios da POO
- modularidade
- reutilização
- manutenibilidade

## 2. Conceitos estruturais

**Classes**

É a abstração de algo do mundo real. É o template que define a estrutura dos objetos que serão instanciados com base em seus atributos e comportamentos definidos.

A palavra-chave para definição de uma classe é *class* que antecede o nome da classe. Esta deve ser definida com a primeira letra em UpperCase e, em sequida o bloco que contém a estrutura do códido da classe é delimitado pelas chaves. 

```
public class NomeDaClasse {}
```

**Atributos**

É um elemento presente em uma classe ou instância de objetos responsável por definir a estrutura de dados com uma determinada característica. 

Tipos de atributos na linguagem Java: *boolean, byte, short, int, long, float, double, char, String*.

**Métodos**

São pedaços de código, sub-rotinas, que executam uma ação específica. Comparativamente, são as funções na programação estruturada. 

Características: 
- Assinatura: é a sua definição, nome do método
- Parâmetros: informações passadas ao método para execução de ação (nenhum ou mais de um parâmetro)
- retorno: é a devolução de uma ação do método conforme desejado
- void: utilizado quando o método não tem um retorno definido.

*Método main:* importante método Java utilizado para iniciar e executar o programa
```
public static void main(String[] args) {}
```

*Estrutura de um método*
```
public static void nomeMetodo() {}
```

*Método com parâmetros e retorno*
```
public static boolean nomeMetodo(tipo1 valor1, tipo2 valor2) {
    // bloco de código

    return value;  // retorno do tipo boolean
}
```

*Chamada de um método*: para execução de um método.
```
nomeMetodo()
```

*Método Overloading (sobrecarga)*

Ocorre quando uma classe tem múltiplos métodos com o mesmo nome, mas com diferentes parâmetros declarados.

A linguagem Java resolve um dos métodos de acordo com os parâmetros passados na chamada, ou seja, de acordo com as características da funcionalidade desejada do método. Faz-se a sobrecarga. 

Em outras palavras, a assinatura do método é única, mas a combinação de parâmetros são diferentes. O número de parâmetros, seus tipos e a ordem em que são declarados. 

Exemplo de métodos que sofrem overloading
```
public static void nameMethod(int parameter01) {}
public static void nameMethod(float parameter01) {}
public static void nameMethod(int parameter01, float parameter02) {}
public static void nameMethod(float parameter01, int parameter02) {}
public static void nameMethod(int parameter01, int parameter02, float parameter03) {}
```

*Métodos Getters e Setters*

São técnicas padronizadas para gerenciamento de acesso a atributos declarados em uma classe a serem usados por uma instãncia de objeto. 

Getter: utilizado para acesso, leitura de um atributo
```
public String getNomeAtributo() {
    return nomeAtributo
}
```

Setter: utilizado para alterar, modificar um atributo de forma protegida. 
```
public void setNomeAtributo() {
    this.nomeAtributo = nomeAtributo;
}

*keyword this: é uma especial referência para uma instância de objeto.*
```

*Modificadores de acesso*

1. public: significa que uma classe dentro de um mesmo pacote está acessível. 
2. protected: significa o acesso à uma classe de um mesmo pacote e algumas subclasses de outro pacote
3. private: nenhuma classe pode acessá-la
Obs.: quando um modificador de acesso estiver omitido significa que ele é do tipo public. 

