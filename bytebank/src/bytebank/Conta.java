package bytebank;

public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
    
    public void deposita(double valor){
        saldo += valor;
        System.out.println("Depositou R$" + valor);
    }
    
    public void consultarSaldo() {
        System.out.println("Seu saldo eh R$" + saldo);
    }
}
