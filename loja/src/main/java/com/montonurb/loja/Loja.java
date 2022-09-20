package com.montonurb.loja;

import com.montonurb.dao.CategoriaDao;
import com.montonurb.dao.ProdutoDao;
import com.montonurb.loja.produto.Categoria;
import com.montonurb.loja.produto.Produto;
import com.montonurb.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;

public class Loja {

    public static void main(String[] args) {
        cadastrarProduto();
        
        EntityManager manager = JpaUtil.getEntityManager();
        CategoriaDao categoriaDao = new CategoriaDao(manager);
        ProdutoDao produtoDao = new ProdutoDao(manager);
        
        Categoria c = categoriaDao.buscarPorId(2);
        
        Produto p = produtoDao.buscarPorId(1);
        
        List<Produto> listaP1 = produtoDao.buscarPorNome("Ribbon");
        
        double valorProduto = produtoDao.buscarValorPorNome("Ribbon");
        
        System.out.println("Valor: R$" + valorProduto);
        
        //AQUI NÃO TA FUNCIONANDO PQ NÃO TÁ VINCULANDO A CATEGORIA NO PRODUTO
        //List<Produto> listaP2 = produtoDao.buscarPorNomeDaCategoria("");
        
        System.out.println("Produto por ID: " + p.getNome());
        
        for(Produto prod : listaP1) {
            System.out.println("Produto por nome| " + "ID: " + prod.getId() + ", Nome: " + prod.getNome() + ", Categoria: " + prod.getCategoria());
        }
        
        /*
        for(Produto prod : listaP2) {
            System.out.println("Produto por nome| " + "ID: " + prod.getId() + ", Nome: " + prod.getNome() + ", Categoria: " + prod.getCategoria());
        }
        */

    }

    public static void cadastrarProduto() {
        Categoria c1 = new Categoria();
        c1.cadastrar("INFORMATICA");

        Categoria c2 = new Categoria();
        c2.cadastrar("PAPELARIA");

        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.cadastrarProduto("Ribbon", "Impressora", 49.99, c1);
        p2.cadastrarProduto("Resma de Papel A5", "Papel para RCPN", 49.99, c2);
        p3.cadastrarProduto("Papel timbrado", "Papel timbrado para cartorios do Piaui", 149.99, c2);

        EntityManager manager = JpaUtil.getEntityManager();
        CategoriaDao categoriaDao = new CategoriaDao(manager);
        ProdutoDao produtoDao = new ProdutoDao(manager);

        manager.getTransaction().begin();

        categoriaDao.cadastrar(c1);
        categoriaDao.cadastrar(c2);
        
        produtoDao.cadastrar(p1);
        produtoDao.cadastrar(p2);
        produtoDao.cadastrar(p3);

        manager.flush();

        //manager.remove(categoria);

        manager.getTransaction().commit();

        manager.close();
    }
}
