package com.montonurb.dao;

import com.montonurb.loja.produto.Produto;
import java.util.List;
import javax.persistence.EntityManager;

public class ProdutoDao {

    private EntityManager manager;

    public ProdutoDao(EntityManager manager) {
        this.manager = manager;
    }

    public void cadastrar(Produto produto) {
        this.manager.persist(produto);
    }

    public void remover(Produto produto) {
        produto = manager.merge(produto);
        this.manager.remove(produto);
    }

    public Produto buscarPorId(int id) {
        return manager.find(Produto.class, id);
    }

    public List<Produto> buscarPorNome(String nome) {
        String jpql = "SELECT p from Produto p where p.nome = :nome";
        return manager.createQuery(jpql, Produto.class)
                .setParameter("nome", nome)
                .getResultList();
    }

    public double buscarValorPorNome(String nome) {
        String jpql = "SELECT p.preco from Produto p where p.nome = :nome";
        return manager.createQuery(jpql, Double.class)
                .setParameter("nome", nome)
                .getSingleResult();
    }

    public List<Produto> buscarPorNomeDaCategoria(String nomeCategoria) {
        String jpql = "SELECT p from Produto P where P.categoria.nome = :nome";
        return manager.createQuery(jpql, Produto.class)
                .setParameter("nome", nomeCategoria)
                .getResultList();
    }
}
