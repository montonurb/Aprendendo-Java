package com.montonurb.dao;

import com.montonurb.loja.produto.Produto;
import javax.persistence.EntityManager;

public class ProdutoDao {
    private EntityManager manager;
    
    public ProdutoDao(EntityManager manager) {
        this.manager = manager;
    }
    
    public void cadastrar(Produto produto) {
        this.manager.persist(produto);
    }
}
