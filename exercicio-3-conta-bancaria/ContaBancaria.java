public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    
    public ContaBancaria (int nC, double s) {
        this.numeroConta = nC;
        this.saldo = s;
    }
    
    public void status () {
        System.out.println("Numero da conta : "+this.numeroConta);
        System.out.println("Saldo bancario :"+this.saldo);
    }
    
    public void depositar (double valor) {
        if (valor >0 && this.saldo >= valor) {
            saldo += valor;
            System.out.println("o valor de "+ valor+" foi adicionado seu saldo agora é de "+this.saldo);
        } else if (valor <= 0) {
            System.out.println("valor do saque invalido. Informe um valor mairo que 0");
        } else {
            System.out.println("Não é possível depositar! ");
        }
    }
    
    public  void sacar (double valor) {
        if (saldo > 0) {
        saldo -= valor;
        System.out.println("O saque de "+valor+"foi realizado com sucesso !");
    } else {
        System.out.println("Não é possivel realizar o saque !");
    }
   }
   public double getsaldo () {
       return this.saldo;
   }
}