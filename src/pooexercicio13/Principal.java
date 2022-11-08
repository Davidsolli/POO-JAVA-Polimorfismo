package pooexercicio13;

public class Principal {
    
    public static void main(String[] args) {
        
        Cachorro x = new Cachorro();
        
        x.setPeso(7.6f);
        x.setIdade(12);
        
        x.reagir("Ola");
        x.reagir("Krai");
        
        x.reagir(11, 45);
        x.reagir(21, 00);
        
        x.reagir(true);
        x.reagir(false);
        
        x.reagir();
    }
}
