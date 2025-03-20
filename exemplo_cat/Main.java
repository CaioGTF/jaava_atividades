
public class Main {

    public static void main(String[] args) {
       /*
       Criando os objetos
        */
       Cat thor = new Cat();
       Cat rambo = new Cat();

       /*
       Definindo o gato Thor
        */
       thor.name = "Thor";
       thor.age = 3;
       thor.breed = "Azul russo";
       thor.color = "Marrom";

       thor.sleep();

       /*
       Definindo o gato Rambo
        */
       rambo.name = "Rambo";
       rambo.age = 4;
       rambo.breed = "Maine Coon";
       rambo.color = "Marrom";

       rambo.play();
    }

}
