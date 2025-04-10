public class Vendedor {
    private String nomeCompleto;
    private int matricula;
    private String rua;
    private String cidade;
    private String estado;
    private String codigoPostal;

    public Vendedor(String nomeCompleto, int matricula, String rua, String cidade, String estado, String codigoPostal) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getEndereco() {
        return rua + ", " + cidade + ", " + estado + ", " + codigoPostal;
    }
}
