package manager;

import dao.DAO;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Time;

/**
 *
 * @author montonurb
 */
@ManagedBean
@ViewScoped
public class TimeBean {

    private Time time = new Time();

    public TimeBean() {
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String salvar() {
        this.time.setDataCadastro(new Date());
        System.out.println("Data: " + this.time.getDataCadastro().toString());
        new DAO<>(Time.class).adicionar(this.time);
        this.time = new Time();
        return "visualizarTimes?faces-redirect=true";
    }
    
    public List<Time> buscarTodos() {
        return new DAO<>(Time.class).buscarTodosTimes();
    }
    
    public String visualizarTimes() {
        return "visualizarTimes?faces-redirect=true";
    }

    public String cadastrarTime() {
        return "cadastrarTime?faces-redirect=true";
    }
}
