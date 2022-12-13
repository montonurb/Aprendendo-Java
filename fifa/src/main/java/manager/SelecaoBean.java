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
    private int quantidadeJogadores;
    private boolean botao;

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

    public int getQuantidadeJogadores() {
        return quantidadeJogadores;
    }

    public void setQuantidadeJogadores(int quantidadeJogadores) {
        this.quantidadeJogadores = quantidadeJogadores;
    }

    public boolean isBotao() {
        return botao;
    }

    public void setBotao(boolean botao) {
        this.botao = botao;
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
    
    public void salvarQuantidade(int quantidade) {
        this.quantidadeJogadores = quantidade;
    }
    
    public void statusBotao() {
        if(this.quantidadeJogadores <= getJogadoresSelecao().size()) {
            this.botao = true;
        } else {
            this.botao = false;
        }
    }
    
    public List<Jogador> getJogadoresSelecao() {
        return this.selecao.getJogadores();
    }

    public List<Jogador> getJogadores() {
        return new DAO<>(Jogador.class).buscarTodosJogadores();
    }

    public List<Selecao> buscarTodos() {
        return new DAO<>(Selecao.class).buscarTodos();
    }

    public String visualizarSelecoes() {
        return "visualizarSelecoes?faces-redirect=true";
    }

    public String cadastrarSelecao() {
        return "cadastrarSelecao?faces-redirect=true";
    }
}
