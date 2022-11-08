package pooexercicio13;

public class Cachorro extends Lobo {
    
    public void reagir(String frase) {
        
        if ("Toma comida".equals(frase) || "Ola".equals(frase)) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min) {
        
        if (hora < 12) {
            System.out.println("Abanar o rabo");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
    
    public void reagir(boolean dono) {
        
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar latir");
        }
    }
    
    public void reagir() {
        
        if (getIdade() < 5) {
            if (getPeso() < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (getPeso() < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }   
}
