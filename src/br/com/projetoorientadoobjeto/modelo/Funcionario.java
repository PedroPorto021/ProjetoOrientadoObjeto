package br.com.projetoorientadoobjeto.modelo;


public class Funcionario extends Pessoa {
    
    private String cargo;
    private Double salario;
    
    public Funcionario() {
        super();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
}
