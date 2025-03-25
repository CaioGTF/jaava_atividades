package java_teste;
/*Para compilar diretamente o nosso projeto java. Abrir na pasta do projeto e rodar o comando
 * javac Main.java para compilar o arquivo de entrada juntamente com os relacionados
 * java Main para rodar o programa
 * Classe é um modelo que vaI DEFINIR A ESTRUTURA DO OBJETO e uns métodos as funções e o comportamento do objeto
 */
/*Construtor é um método especial de uma classe. Porque esse método vai ser chamado sempre quando um objeto dessa classe for chamado */
// O método construtor ele serve para quando a gente esteja construindo um objeto a gente consiga passar parâmetros, atribuir valores e moldar dependências internas do objetos;
// atributos são variáveis que pertencem a classe
public class Main {
    public static void main(String[] args) {
       Carro meuCarro = new Carro("Fusca");
       Carro meuCarro1 = new Carro("Sandero");
       Carro meuCarro2 = new Carro("BMW");

       meuCarro1.acelerar();
    }
}

class Carro {
    // uma classe vai ser construída por métodos e atributos
    // atributo String que vai ser o modelo
    String modelo;
    public Carro(String modelo){
        // o modelo vai ser definido no momento que o carro for criado
        // this porque estou acessando a instância atual desse atributo
        // modelo recebe modelo porque o atributo modelo na classe carro vai receber o valor que eu passar no atributo
        this.modelo = modelo;
    }
    // os atributos são as variáveis de uma classe. Métodos são funções que essa classe possui. Lógica, tarefa que essa classe realiza;
    // se não retorna nada dizemos que é um método vazio (void);
    public void acelerar(){
        System.out.println("Acelerando o carro"+'\t'+this.modelo);
    }
}
