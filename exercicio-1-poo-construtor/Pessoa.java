public class Pessoa {
    String nome ;
    int idade;
    
    public Pessoa(String n,int i) {
        this.nome = n;
        this.idade = i;
    }
    void status () {
        System.out.println("O nome do meliante é : "+this.nome);
        System.out.println(" A idade deste é : "+this.idade+" anos");
    }
}