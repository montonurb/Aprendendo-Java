package manager;

import dao.DAO;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Jogador;
import modelo.Selecao;

/**
 *
 * @author montonurb
 */
@ManagedBean
@ViewScoped
public class SelecaoBean {

    private Selecao selecao = new Selecao();
    private Long selecaoId;
    private Long jogadorId;

    public SelecaoBean() {
    }

    public Selecao getSelecao() {
        return selecao;
    }

    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
    }

    public Long getSelecaoId() {
        return selecaoId;
    }

    public void setSelecaoId(Long selecaoId) {
        this.selecaoId = selecaoId;
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
        Jogador jogador = new DAO<>(Jogador.class).buscarJogadorPorId(this.jogadorId);
        this.selecao.adicionarJogador(jogador);
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
