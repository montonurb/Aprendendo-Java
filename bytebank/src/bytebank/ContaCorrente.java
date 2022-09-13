package bytebank;

public class ContaCorrente extends Conta implements Tributo {
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorSaqueTotal = valor + 0.2;
        return super.saca(valorSaqueTotal); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public boolean deposita(double valor) {
        if (valor >= 0.0) {
            this.saldo += valor;
            System.out.println("Depositou R$" + valor);
            return true;
        } else {
            System.out.println("Valor de deposito invalido!");
            return false;
        }
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
