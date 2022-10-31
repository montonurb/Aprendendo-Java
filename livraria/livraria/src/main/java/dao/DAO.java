package dao;

import java.util.List;
import javax.persistence.EntityManager;
import modelo.Autor;
import modelo.Livro;

public class DAO<T> {

    private final Class<T> classe;

    public DAO(Class<T> classe) {
        this.classe = classe;
    }

    public void adiciona(T t) {
        EntityManager manager = new JPAUtil().getEntityManager();

        manager.getTransaction().begin();

        manager.persist(t);

        manager.getTransaction().commit();

        manager.close();
    }

    public void remove(T t) {
        EntityManager manager = new JPAUtil().getEntityManager();

        manager.getTransaction().begin();

        manager.remove(manager.merge(t));

        manager.getTransaction().commit();

        manager.close();
    }

    public void atualiza(T t) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.merge(t);
        manager.getTransaction().commit();
        manager.close();
    }

    public T buscaPorId(Integer id) {

        EntityManager manager = new JPAUtil().getEntityManager();
        T instancia = manager.find(classe, id);
        manager.close();

        return instancia;
    }
    
    public T buscarPorEmail(String email) {
        EntityManager manager = new JPAUtil().getEntityManager();
        T instancia = manager.find(classe, email);
        manager.close();
        return instancia;
    }
    
    public List<Livro> pegarLivros() {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        
        String sql = "SELECT l from Livro l";
        List<Livro> livros = manager.createQuery(sql, Livro.class).getResultList();
        
        manager.close();
        return livros;
    }

    public List<Autor> pegarAutores() {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();

        String sql = "SELECT a from Autor a";
        List<Autor> autores = manager.createQuery(sql, Autor.class).getResultList();

        manager.close();

        return autores;
    }
}
