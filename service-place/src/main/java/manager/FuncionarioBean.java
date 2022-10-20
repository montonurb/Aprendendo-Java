package manager;

import javax.faces.bean.ManagedBean;
import modelo.Funcionario;

@ManagedBean
public class FuncionarioBean {

    private Funcionario funcionario;

    public void FuncionarioBean() {
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public void cadastrarFuncionario() {
    }

}
