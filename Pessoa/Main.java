public class Main {
    public static void main(String[] args) {
         /*
       Criando os objetos
        */
      // Criando objetos da classe Carro
      PessoaFisica pessoa1 = new PessoaFisica("123", "10", "Beatriz", "02/02/1999");
      pessoa1.setNome("Bia");
      pessoa1.setCPF("128.153.334-71");
      System.out.println(pessoa1.getData());
}
}
