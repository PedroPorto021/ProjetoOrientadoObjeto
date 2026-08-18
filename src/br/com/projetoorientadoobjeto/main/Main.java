package br.com.projetoorientadoobjeto.main;

import br.com.projetoorientadoobjeto.modelo.Cliente;
import br.com.projetoorientadoobjeto.modelo.Pessoa;
import br.com.projetoorientadoobjeto.modelo.Funcionario;

public class Main {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        Cliente cliente = new Cliente();
        
        funcionario.setNome("Pedro");
        funcionario.setCpf("12345678900");
        funcionario.setCargo("Desenvolvedor");
        funcionario.setSalario(3500.00);
        
        cliente.setNome("Maria");
        cliente.setCodigoCliente("CLI001");

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getCargo());
        System.out.println(funcionario.getSalario());
        System.err.println(cliente.getNome());
        System.err.println(cliente.getCodigoCliente());        
        
        
    }
}