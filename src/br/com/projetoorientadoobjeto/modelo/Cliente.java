
package br.com.projetoorientadoobjeto.modelo;


public class Cliente extends Pessoa {
    
    private String codigoCliente;
    
    public Cliente() {
        super();
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    
    
}
