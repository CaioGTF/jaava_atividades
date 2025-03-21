public class PessoaFisica extends Pessoa {
    /*Pessoa física herda de pessoa */
    private String CPF;
    private String RG;
    public PessoaFisica(String CPF, String RG, String nome, String data){
        /*Forma 1 - primeiro a super classe depois as subclasses*/
        super(nome, data);
        this.CPF = CPF;
        this.RG = RG;
        /*Forma 2
         * this.CPF = CPF
         * this.RG = RG
         * setNome(nome);
         * setData(data);
         */
    }
    public void andar(){
        System.out.println(nome + "está andando");
    }
    public String getCPF() {
        return CPF;
     }
    public void setCPF(String CPF) {
        this.CPF = CPF;
     }
    public String getRG() {
        return RG;
     }
    public String setRG(String RG){
        this.RG = RG;
    }
}
