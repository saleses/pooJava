# POO - Programação orientada a objeto em Java 

## Modelo de subtítulo 

```
Formato para códigos exemplificativos
```

## Ementa

**1. Conceitos básicos da linguagem Java**
- Variáveis
- Condicionais
- Loops
- etc

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

## 1. Conceitos básicos

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
public static boolean nomeMetodo() {}
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
nomeMetod()
```

