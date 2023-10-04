package Sprint1.Inlamning1expriment;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Huvudprogram {
    List<Växter> plantList = new ArrayList<>();
    public Huvudprogram() {

//Skapar upp objekt av de olika klasserna samt tilldelar de sina värden
        plantList.add(new Kaktusar("Igge",2,"cm"));
        plantList.add(new Palmer("Laura",5,"Meter"));
        plantList.add(new KöttätandeVäxt("Meatloaf",0.7,"Meter"));
        plantList.add(new Palmer("Olof",1,"Meter"));

//Skapar en loop för att fråga vilken växt som ska vattnas finns växten med på hotellet så skrivs formeln ut för den specifika växten
        //Finns det inte med så skrivs det ut att den inte finns med och sedan visas alla växter som bor på hotellet så får man skriva in på nytt.

        boolean found = true;
        while (found) {
            String plant = JOptionPane.showInputDialog("Vilken växt ska vattnas? ");
            if(plant == (null)){ throw new NullPointerException();

            }
            for(Växter växt : plantList) {
                if (plant.equalsIgnoreCase(växt.getName())) {
                    växt.printFormel();
                    String searchOneMore = JOptionPane.showInputDialog("Vill du söka efter en till växt? (y/n) ");
                    if (searchOneMore.equalsIgnoreCase("y")){
                        break;


                    }
                    else if(searchOneMore.equalsIgnoreCase("n")){}

                        found = false;
                        break;

                }

            }
            if (found) {
                for(Växter.PlantsInHotel plantPrintOut : Växter.PlantsInHotel.values()){

                }
                    JOptionPane.showMessageDialog(null, "Växten bor inte på hotellet\nVäxterna som bor här är:\n" +
                            ""+ Arrays.toString(Växter.PlantsInHotel.values()));
            }

            }
        }

        //Skapar en instans av huvudprogram för att kunna köra koden från huvudprogram
        //Sedan har jag valt att göra en try catch för att fånga upp felet som kommer upp när man trycker cancel annars

        public static void main (String[]args)  {
        try {
            Huvudprogram h = new Huvudprogram();
        }
        catch (Exception e){}

        }
}



