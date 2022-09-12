package bytebank;

public class Bytebank {
    public static void main(String[] args) {
        Conta contaBruno = new Conta(0012, 120354);
        Cliente bruno = new Cliente();
        contaBruno.setCliente(bruno);
        contaBruno.getCliente().setNome("Bruno Monteiro");
        contaBruno.getCliente().setProfissao("Programador");
        
        contaBruno.deposita(150.0);
        contaBruno.getSaldo();
        
        contaBruno.saca(10.00);
        contaBruno.getSaldo();
        
        Conta contaValeria = new Conta(0012, 120355);
        Cliente valeria = new Cliente();
        contaValeria.setCliente(valeria);
        contaValeria.getCliente().setNome("Valeria Veras");
        contaValeria.getCliente().setProfissao("Professora");
        contaValeria.deposita(2000);
                
        contaValeria.transfere(150.00, contaBruno);
        
        System.out.println(contaValeria.getCliente().getNome());
        System.out.println(contaValeria.getSaldo());
        System.out.println(contaBruno.getCliente().getNome());
        System.out.println(contaBruno.getSaldo());
        
        
        System.out.println("Total de contas abertas: " + Conta.getTotal());
        
    }
}
