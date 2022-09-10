package bytebank;

public class Bytebank {
    public static void main(String[] args) {
        Conta contaBruno = new Conta();
        contaBruno.cliente = new Cliente();
        contaBruno.cliente.nome = "Bruno Monteiro";
        contaBruno.saldo = 150.00;
        
        contaBruno.deposita(100.00);
        contaBruno.consultarSaldo();
        
        contaBruno.saca(1.00);
        contaBruno.consultarSaldo();
        
        Conta contaValeria = new Conta();
        contaValeria.cliente = new Cliente();
        contaValeria.cliente.nome = "Valeria Veras";
        contaValeria.saldo = 2000;
                
        contaValeria.transfere(15000.00, contaBruno);
        contaValeria.consultarSaldo();
        contaBruno.consultarSaldo();
        
    }
}