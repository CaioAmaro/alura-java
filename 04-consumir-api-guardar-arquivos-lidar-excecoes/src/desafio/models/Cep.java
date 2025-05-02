package desafio.models;

public class Cep {
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Cep(CepViaCep cepViaCep) {
        this.cep = cepViaCep.cep();
        this.logradouro = cepViaCep.logradouro();
        this.complemento = cepViaCep.complemento();
        this.unidade = cepViaCep.unidade();
        this.bairro = cepViaCep.bairro();
        this.localidade = cepViaCep.localidade();
        this.uf = cepViaCep.uf();
        this.estado = cepViaCep.estado();
        this.regiao = cepViaCep.regiao();
        this.ibge = cepViaCep.ibge();
        this.gia = cepViaCep.gia();
        this.ddd = cepViaCep.ddd();
        this.siafi = cepViaCep.siafi();
    }

    @Override
    public String toString() {
        return "Cep{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", unidade='" + unidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", estado='" + estado + '\'' +
                ", regiao='" + regiao + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia='" + gia + '\'' +
                ", ddd='" + ddd + '\'' +
                ", siafi='" + siafi + '\'' +
                '}';
    }
}
