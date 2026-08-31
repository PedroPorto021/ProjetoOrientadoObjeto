package br.com.projetoorientadoobjeto.dao;

import java.util.List;

public interface Dao {

    public void salvar(Object objeto);

    public void editar(Object object, Integer id);

    public void excluir(Integer id);

    public List<Object> listar();

    public Object buscarPorId(Integer id);

}
