package exemplo_polimorfismo;

/**
 *
 * @author julian
 */
public abstract class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    //Los metodos abstractos no se definen
    public abstract void falar();

}
