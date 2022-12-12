package manager;

import dao.DAO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import modelo.Jogador;
import modelo.Sexo;

@ManagedBean
@ViewScoped
public class JogadorBean implements Serializable {

    private Jogador jogador = new Jogador();
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public void JogadorBean() {
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void salvar() {
        System.out.println("Salvando!");
        Date dataCadastro = new Date();
        this.jogador.setDataCadastro(dataCadastro);
        new DAO<>(Jogador.class).adicionar(this.jogador);
        this.jogador = new Jogador();
        System.out.println("Salvo!");
        //return "visualizarJogadores?faces-redirect=true";
    }

    public List<Jogador> buscarTodos() {
        return new DAO<>(Jogador.class).buscarTodosJogadores();
    }

    public String editarJogador() {
        if (this.jogador.getId() != null) {
            excluir(this.jogador);
            salvar();
        } else {
            salvar();
        }
        return "visualizarJogadores?faces-redirect=true";
    }

    public void excluir(Jogador jogador) {
        new DAO<>(Jogador.class).remover(jogador);
    }

    public List<Jogador> getJogadores() {
        return new DAO<>(Jogador.class).buscarTodosJogadores();
    }

    public String visualizarJogadores() {
        return "visualizarJogadores?faces-redirect=true";
    }

    public String cadastrarJogador() {
        return "cadastrarJogador?faces-redirect=true";
    }

    public Sexo[] getSexos() {
        return Sexo.values();
    }
}
