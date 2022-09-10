package bytebank;

public class Conta {

    double saldo;
    int agencia;
    int numero;
    Cliente cliente;    //pode ser feito também como Cliente cliente = new Cliente();

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

    public boolean saca(double valor) {
        if (valor > this.saldo) {
            System.out.println("Valor maior que o saldo.");
            return false;
        } else if (valor >= 0 && valor <= this.saldo) {
            System.out.println("Saque efetuado com sucesso!");
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Valor de saque invalido!");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (valor >= this.saldo) {
            System.out.println("Valor maior que o saldo.");
            return false;
        } else if (valor > 0.0 && valor <= this.saldo){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            System.out.println("Valor de transferencia invalido!");
            return false;
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo eh R$" + this.saldo);
    }
}
