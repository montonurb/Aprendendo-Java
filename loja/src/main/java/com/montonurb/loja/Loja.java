package com.montonurb.loja;

import com.montonurb.dao.CategoriaDao;
import com.montonurb.dao.ProdutoDao;
import com.montonurb.loja.produto.Categoria;
import com.montonurb.loja.produto.Produto;
import com.montonurb.util.JpaUtil;
import javax.persistence.EntityManager;

public class Loja {

    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.cadastrar("INFORMATICA");
        
        Categoria novaCategoria = new Categoria();
        novaCategoria.cadastrar("PAPELARIA");
        
        Produto produto = new Produto();
        
        produto.cadastrarProduto("Ribbon", "Impressora", 49.99, categoria);
        //produto.cadastrarProduto("Resma de Papel A5", "Papel para RCPN", 49.99, Categoria.PAPELARIA);
        //produto.cadastrarProduto("Papel timbrado", "Papel timbrado para cartorios do Piaui", 149.99, Categoria.PAPELARIA);
        
        EntityManager manager = JpaUtil.getEntityManager();
        CategoriaDao categoriaDao = new CategoriaDao(manager);
        ProdutoDao produtoDao = new ProdutoDao(manager);
        
        manager.getTransaction().begin();
        
        categoriaDao.cadastrar(categoria);
        produtoDao.cadastrar(produto);
        
        categoriaDao.cadastrar(novaCategoria);
        
        manager.flush();
        
        manager.remove(categoria);
        manager.getTransaction().commit();
        
        manager.close();
    }
}
