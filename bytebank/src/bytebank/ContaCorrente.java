package bytebank;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorSaqueTotal = valor + 0.2;
        return super.saca(valorSaqueTotal); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
