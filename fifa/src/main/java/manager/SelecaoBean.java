package manager;

import dao.DAO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Jogador;
import modelo.Selecao;

@ManagedBean
@ViewScoped
public class SelecaoBean implements Serializable {

    private Selecao selecao = new Selecao();
    private Long jogadorId;

    public SelecaoBean() {
    }

    public Selecao getSelecao() {
        return selecao;
    }

    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
    }

    public Long getJogadorId() {
        return jogadorId;
    }

    public void setJogadorId(Long jogadorId) {
        this.jogadorId = jogadorId;
    }

    public String salvar() {
        this.selecao.setDataCadastro(new Date());
        System.out.println("Data: " + this.selecao.getDataCadastro().toString());
        new DAO<>(Selecao.class).adicionar(this.selecao);
        this.selecao = new Selecao();
        return "visualizarSelecoes?faces-redirect=true";
    }

    public void gravarJogador() {
        Jogador jogador = new DAO<>(Jogador.class).buscaPorId(this.jogadorId);
        this.selecao.adicionarJogador(jogador);
    }
    
    public void removerJogador(Jogador jogador) {
        System.out.println(">>>" + jogador.getNome());
        this.selecao.removerJogador(jogador);
    }
    
    public List<Jogador> getJogadoresSelecao() {
        return this.selecao.getJogadores();
    }

    public List<Jogador> getJogadores() {
        return new DAO<>(Jogador.class).buscarTodosJogadores();
    }

    public List<Selecao> buscarTodos() {
        return new DAO<>(Selecao.class).buscarTodasSelecoes();
    }

    public String visualizarSelecoes() {
        return "visualizarSelecoes?faces-redirect=true";
    }

    public String cadastrarSelecao() {
        return "cadastrarSelecao?faces-redirect=true";
    }
}
