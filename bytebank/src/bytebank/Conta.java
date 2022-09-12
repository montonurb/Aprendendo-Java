package bytebank;

public abstract class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente cliente = new Cliente();    //pode ser feito também como Cliente cliente = new Cliente();
    private static int total;
    
    public Conta(int agencia, int numero) {
        total++;
    }
    
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

    public double getSaldo() {
        return this.saldo;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    public int getAgencia() {
        return this.agencia;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public static int getTotal() {
        return total;
    }
}
