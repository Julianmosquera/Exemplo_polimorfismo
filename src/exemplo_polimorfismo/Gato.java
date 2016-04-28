
package exemplo_polimorfismo;

/**
 *
 * @author julian
 */
public class Gato extends Animal{
    
    private String cor;

    public Gato(String cor, String nome) {
        super(nome);
        this.cor = cor;
    }

    
   
    
    
    @Override
    public void falar() {
        System.out.println("miau,miau");
    }

    @Override
    public String toString() {
        return "Gato{" +this.getNome()+ "cor=" + cor + '}';
    }
    
    
    
    
    
}
