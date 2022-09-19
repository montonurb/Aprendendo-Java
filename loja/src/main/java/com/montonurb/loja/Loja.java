package com.montonurb.loja;

import com.montonurb.dao.ProdutoDao;
import com.montonurb.loja.produto.Produto;
import com.montonurb.util.JpaUtil;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;

import javax.persistence.Persistence;

public class Loja {

    public static void main(String[] args) {
        Produto produto = new Produto();
        
        produto.cadastrarProduto("Papel timbrado", "Papel timbrado para cartorios do Piaui", 149.99);
        produto.cadastrarProduto("Ribbon", "Impressora", 49.99);
        
        EntityManager manager = JpaUtil.getEntityManager();
        ProdutoDao dao = new ProdutoDao(manager);
        
        manager.getTransaction().begin();
        dao.cadastrar(produto);
        manager.getTransaction().commit();
        manager.close();
    }
}
