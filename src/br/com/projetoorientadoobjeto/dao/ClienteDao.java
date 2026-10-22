package br.com.projetoorientadoobjeto.dao;

import br.com.projetoorientadoobjeto.modelo.Cliente;
import java.util.List;

public class ClienteDao implements Dao {

    @Override
    public void salvar(Object objeto) {
    }

    @Override
    public void editar(Object object, Integer id) {
    }

    @Override
    public void excluir(Integer id) {
    }

    @Override
    public List<Object> listar() {
        return null;
    }

    @Override
    public Object buscarPorId(Integer id) {

        Cliente cliente = new Cliente();
        cliente.setIdPessoa(id);
        cliente.setNome("Allan Alves");
        cliente.setOferta("Serviço de Marketing");
        cliente.setWpp("021965738016");

        return cliente;
    }

}
