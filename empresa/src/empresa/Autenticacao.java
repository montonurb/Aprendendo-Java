package empresa;

public abstract interface Autenticacao {
    
    public abstract void setSenha(String senha);
    
    public abstract boolean autentica(String senha);
}
