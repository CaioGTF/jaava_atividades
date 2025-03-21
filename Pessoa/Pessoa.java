public class Pessoa{
    private String nome;
    private String data;
    public Pessoa(String nome, String data){
        this.nome = nome;
        this.data = data;
    }
    public String getNome() {
        return nome;
     }
    public void setNome(String nome) {
        this.nome = nome;
     }
    public String getData() {
        return data;
     }
    public String setData(String data){
        this.data = data;
    }
}