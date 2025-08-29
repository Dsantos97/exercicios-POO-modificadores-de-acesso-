
public class Main
{
	public static void main(String[] args) {
		ContaBancaria cb1 = new ContaBancaria(291,1000);
		
		cb1.status();
		cb1.sacar(150);
		cb1.depositar(80);
		cb1.status();
		cb1.getsaldo();
	}
}
