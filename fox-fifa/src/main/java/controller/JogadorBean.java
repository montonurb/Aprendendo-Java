package controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import model.Jogador;
import service.DAO;

/**
 *
 * @author montonurb
 */
@ManagedBean
public class JogadorBean {

    private Long id;
    private Jogador jogador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void salvar() {
        if (this.jogador.getId() != null) {
            new DAO<>(Jogador.class).atualizar(jogador);
        } else {
            new DAO<>(Jogador.class).cadastrar(jogador);
        }
        
        this.jogador = new Jogador();
    }
    
    public void excluir(Jogador jogador) {
        new DAO<>(Jogador.class).remover(jogador);
    }
    
    public List<Jogador> buscarTodos() {
        return new DAO<>(Jogador.class).buscarJogadores();
    }
}
