package model;

public class CartaoModel {
    private int id;
    private String numero;
    private String nomeTitular;
    private String dataExpiracao;
    private int cvv;
    private double limiteTotal;
    private double saldoUtilizado;

    // Construtor vazio
    public CartaoModel() {}

    // Construtor com parâmetros
    public CartaoModel(int id, String numero, String nomeTitular, String dataExpiracao, int cvv, double limiteTotal, double saldoUtilizado) {
        this.id = id;
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.dataExpiracao = dataExpiracao;
        this.cvv = cvv;
        this.limiteTotal = limiteTotal;
        this.saldoUtilizado = saldoUtilizado;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }

    @Override
    public String toString() {
        return "CartaoModel{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", dataExpiracao='" + dataExpiracao + '\'' +
                ", cvv=" + cvv +
                ", limiteTotal=" + limiteTotal +
                ", saldoUtilizado=" + saldoUtilizado +
                '}';
    }
}
