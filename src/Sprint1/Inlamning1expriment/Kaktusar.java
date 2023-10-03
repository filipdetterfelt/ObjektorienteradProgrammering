package Sprint1.Inlamning1expriment;

import javax.swing.*;
public class Kaktusar extends Växter {

    /*
    Skapar upp 2 instanser av Drinks och plockar ut värdet genom getDrinks och getNumber
    Det som händer då är att jag får tag i namnet och siffran som finns i MINERALVATTEN
    */

    String kaktus = Drinks.MINERALVATTEN.getDrinks();
    Double kaktusSiffra = Drinks.MINERALVATTEN.getNumber();

    //Min konstruktor som kallar på superklassen
    public Kaktusar(String name, double height, String unit){
        super(name,height,unit);
    }
//Här är en formel som inte används mer för test kanske bör ta bort ?
    public void printPlant(){
        System.out.println("Kaktusen "+getName()+" är "+getHeight()+" "+getUnit()+" hög");
    }

    //Här gör jag en override av metoden printformel för att den ska passa just i kaktusar (polymorfism)
    @Override
    public void printFormel(){
        JOptionPane.showMessageDialog(null,"Kaktusen " +getName()+" behöver "
                +kaktusSiffra+" cl "+kaktus +"/dag");
//        System.out.println("Kaktusen " +getName()+" behöver "+getMineralvatten()+"cl Mineraler/dag");
    }
}
