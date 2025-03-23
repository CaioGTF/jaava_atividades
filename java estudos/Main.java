import java.util.ArrayList;

public class Main {
    /*Declarando variáveis
     * 1 forma:
    int minhaIdade = 20;
    String meuNome = "Fernanda";
    2 forma:
    O java decide a classe dessa variável
    var nomeVariavel = "Fernanda";
     * 
     */
    // byte => 8 bits => -128 a 127
    // short => 16 bits => -32.768 a 32.767
    // int => 32 bits => -2.147.483.648 a 2.147.483.647
    // long => 64 bits => menos 9 trilhoes a 9 trilhoes
    // float => 32 bits => precisão simples => para números decimais
    // double => 63 bits => precisão dupla para números decimais  
    // String => representar palavras e frases
    // char => representar um único caracter => a,b,c,d
    // char tem que ter aspas simples 'a' enquanto a String "aadedfef"
    // boolean => true ou false
      public static void main(String[] args) {  
        int numero = 1000;  
        boolean bool = true;
        String str = "Fernanda";

          if (str.isBlank()) {
              System.out.println("Verdadeiro");
          } else if (str == "Fernanda"){
                System.out.println("Fernanda");
          } else {
              System.out.println("Falso");
          }

            // vetores: uma coleção de números do mesmo tipo
            int[] colecaoDeInteiros = {1,2,3,4};
            // se eu não quiser colocar os valores
            int[] meusNumeros = new int[5];

            System.out.println(colecaoDeInteiros[0]);
            System.out.println(colecaoDeInteiros.length);
       
        // Arratlista: lista dinâmica de elementos. Podemos adicionar e excluir elementos.
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fernanda");
        nomes.add("Leo");
        nomes.add("Maria");
        nomes.add("Guilherme");
        nomes.add("Cayo");
        nomes.add("Rodrigo");
        System.out.println(nomes.get(0));

        nomes.remove(0);
        nomes.remove("Leo");
        System.out.println(nomes.get(0));


        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
      }
 
    
}
