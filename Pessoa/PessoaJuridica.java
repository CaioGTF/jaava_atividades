public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private String NomeFantasia;
    public PessoaJuridica(String CNPJ, String NomeFantasia, String nome, String data){
        super(nome, data);
        this.CNPJ = CNPJ;
        this.NomeFantasia = NomeFantasia;
    }
    public String getCNPJ() {
        return CNPJ;
     }
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
     }
    public String getPessoaFisica() {
        return PessoaFisica;
     }
    public String setPessoaFisica(String PessoaFisica){
        this.PessoaFisica = PessoaFisica;
    }
}
