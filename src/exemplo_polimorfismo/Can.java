
package exemplo_polimorfismo;

/**
 *
 * @author julian
 */
public class Can extends Animal{
    private String raza;

    public Can(String raza, String nome) {
        super(nome);
        this.raza = raza;
    }

   
    
    
    
    
    
    
    
    @Override
    public void falar() {
        System.out.println("guau");
    }
    public void andar(){
        System.out.println("andando");
    }

    @Override
    public String toString() {
        return "Can{" +this.getNome()+ "raza=" + raza + '}';
    }

    
    
    
    
    
    
}
