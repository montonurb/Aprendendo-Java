package service;

import java.util.List;
import javax.persistence.EntityManager;
import model.Jogador;
import model.Time;

/**
 *
 * @author montonurb
 * @param <G>
 */
public class DAO<G> {

    private final Class<G> classe;

    public DAO(Class<G> classe) {
        this.classe = classe;
    }

    //SALVAR NOVO DADO NO BANCO
    public void cadastrar(G genericClass) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.merge(genericClass);
        manager.getTransaction().commit();
        manager.close();
    }

    public List<Time> buscarTimes() {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        String sql = "select t from Time t";
        List<Time> times = manager.createQuery(sql, Time.class).getResultList();
        manager.close();
        return times;
    }

    public List<Jogador> buscarJogadores() {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        String sql = "select j from Jogador j";
        List<Jogador> jogadores = manager.createQuery(sql, Jogador.class).getResultList();
        manager.close();
        return jogadores;
    }

    public void atualizar(G genericClass) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.merge(genericClass);
        manager.getTransaction().commit();
        manager.close();
    }

    //DELETAR DADO NO BANCO
    public void remover(G genericClass) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.remove(manager.merge(genericClass));
        manager.getTransaction().commit();
        manager.close();
    }
}
