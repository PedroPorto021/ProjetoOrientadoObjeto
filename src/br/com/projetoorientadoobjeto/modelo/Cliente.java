package br.com.projetoorientadoobjeto.modelo;

public class Cliente extends Pessoa {

    private String codigoCliente;
    private String oferta;

    public Cliente() {
        super();
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public String getOferta() {
        return oferta;
    }

}
