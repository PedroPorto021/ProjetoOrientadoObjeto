package br.com.projetoorientadoobjeto.main;

import br.com.projetoorientadoobjeto.dao.PessoaDao;
import br.com.projetoorientadoobjeto.dao.ClienteDao;
import br.com.projetoorientadoobjeto.modelo.Cliente;
import br.com.projetoorientadoobjeto.modelo.Pessoa;

public class Main {

    public static void main(String[] args) {

        PessoaDao dao = new PessoaDao() {
        };
        Pessoa pessoa = (Pessoa) dao.buscarPorId(1);

        System.out.println("Nome encontrado: " + pessoa.getNome());
        System.out.println("E-mail encontrado: " + pessoa.getEmail());

        pessoa.setNome("Pedro Porto Atualizado");

        System.out.println("Nome apos alteracao: " + pessoa.getNome());
        System.out.println("ID encontrado: " + pessoa.getIdPessoa());

        ClienteDao clienteDao = new ClienteDao();
        Cliente clienteEncontrado = (Cliente) clienteDao.buscarPorId(2);

        System.out.println("Cliente encontrado: " + clienteEncontrado.getNome());
        System.out.println("Oferta encontrada: " + clienteEncontrado.getOferta());

    }

}
