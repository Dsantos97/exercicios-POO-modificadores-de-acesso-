public class Carro {
    private String marca;
    private int ano;
    
    
    public Carro (String m,int a) {
        this.marca = m;
        this.ano = a;
    }
    
    
    public String getmarca () {
       return this.marca;
    }
    
    public void setmarca (String m) {
        this.marca = m;
    }
    
    public int getano () {
        return this.ano;
    } 
    
    public void setano (int a) {
        this.ano = a;
    }
    
    public void status () {
    System.out.println("Marca: "+this.marca);
    System.out.println("Ano: "+this.ano);
    }
}
    