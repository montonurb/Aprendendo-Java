package bytebank;

public class Bytebank {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.titular = "Bruno Monteiro";
        conta.saldo = 150.00;
        
        conta.deposita(100.00);
        conta.consultarSaldo();
    }
    
}
