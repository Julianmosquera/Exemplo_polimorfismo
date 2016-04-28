package exemplo_polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author julian
 */
public class Exemplo_Polimorfismo {

    public static void main(String[] args) {
        ArrayList<Animal> listaanimales = new ArrayList();

        Animal can = new Can("Brisa", "palleiro");
        Animal gato = new Gato("minino", "branco");
        listaanimales.add(can);
        listaanimales.add(gato);
        for (Animal ani : listaanimales) {
            System.out.println(ani.toString());
            
        }
        for(Animal ani:listaanimales){
            //falarPolimorfico(ani);
            ani.falar();
        if (ani instanceof Can)
            ((Can)ani).andar();
        }
    }
    
    //Metodo con parameto xeralista
    
    public static void falarPolimorfico(Animal a ){
        a.falar();
        
    }

}
