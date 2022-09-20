package com.montonurb.dao;

import com.montonurb.loja.produto.Categoria;
import javax.persistence.EntityManager;

public class CategoriaDao {
    private EntityManager manager;
    
    public CategoriaDao(EntityManager manager) {
        this.manager = manager;
    }
    
    public void cadastrar(Categoria categoria) {
        this.manager.persist(categoria);
    }
    
    public void remover(Categoria categoria) {
        categoria = manager.merge(categoria);
        this.manager.remove(categoria);
    }
}
