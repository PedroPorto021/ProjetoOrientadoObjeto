package br.com.projetoorientadoobjeto.dao;

import br.com.projetoorientadoobjeto.modelo.Pessoa;
import java.util.List;


public abstract class PessoaDao implements Dao{
    
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
        
        Pessoa pessoa = new Pessoa();
        pessoa.setIdPessoa(id);
        pessoa.setCpf("0123456789");
        pessoa.setNome("Pedro Porto");
        pessoa.setEmail("pedroporto@gmail.com");
        pessoa.setWpp("021974875984");
        pessoa.setGenero(1);
        
        return pessoa;
    }
    
    
}
