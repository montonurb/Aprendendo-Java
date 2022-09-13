package bytebank;

public class Imposto {
    
    private double totalImposto;
    
    public void registro(Tributo tributo) {
        double valor = tributo.getValorImposto();
        this.totalImposto += valor;
    }
    
    public double getTotalImposto() {
        return this.totalImposto;
    }
}
