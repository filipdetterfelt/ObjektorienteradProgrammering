package Sprint1.Inlamning1expriment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VäxterTest {

    /*
    Här skapar jag en testklass för att kunna testa min metod printPlant eftersom den är överlagrad så finns den i flera varianer en för varje växt
    därav får jag testa alla separata metoder var för sig
     */
    String palm = Drinks.KRANVATTEN.getDrinks();
    Double palmSiffra = Drinks.KRANVATTEN.getNumber();
     @Test
    void printPalm(){

         assert (Drinks.KRANVATTEN.getDrinks()).equals("kranvatten");
        // assert (! Drinks.KRANVATTEN.getDrinks().equals("kranvatten")); //Kommenterade bort denna men resultatet blev som förväntat med denna test med
         assert (Drinks.KRANVATTEN.getNumber().equals(0.5));
        // assert (! Drinks.KRANVATTEN.getNumber().equals(0.5)); //Kommenterade bort denna men resultatet blev som förväntat med denna test med
    }

    final private double extraProteinTillskor = 0.2;
    String köttÄtandeVäxt = Drinks.PROTEINDRYCK.getDrinks();
    Double getKöttÄtandeVäxtSiffra = Drinks.PROTEINDRYCK.getNumber();
    @Test void printKöttätande(){

        assert (Drinks.PROTEINDRYCK.getDrinks().equals("proteindryck"));
        assert (! Drinks.PROTEINDRYCK.getNumber().equals("0.1"));
        assert (extraProteinTillskor == 0.2);

    }
    Kaktusar testkaktus = new Kaktusar("Filip",2.3,"meter");
    @Test void printKaktus(){

        assert (testkaktus.getName().equals("Filip"));
        assert (testkaktus.getHeight() == 2.3);
        assert (testkaktus.getUnit().equals("meter"));

    }

}