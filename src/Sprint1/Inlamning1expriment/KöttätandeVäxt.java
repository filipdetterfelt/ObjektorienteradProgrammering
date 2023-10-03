package Sprint1.Inlamning1expriment;

import javax.swing.*;

public class KöttätandeVäxt extends Växter {
    final private double extraProteinTillskor = 0.2;
    String köttÄtandeVäxt = Drinks.PROTEINDRYCK.getDrinks();
    Double getKöttÄtandeVäxtSiffra = Drinks.PROTEINDRYCK.getNumber();

    public double getExtraProteinTillskor() {
        return extraProteinTillskor;
    }


    public KöttätandeVäxt(String name, double height ,String unit){
        super(name,height,unit);
    }


    public void printPlant(){
        System.out.println("Köttätande "+getName()+" är "+getHeight()+" "+getUnit()+" hög");
    }



    @Override
    public void printFormel(){
        if(!getUnit().equalsIgnoreCase("meter")){
            double meter = getHeight() /100;

            JOptionPane.showMessageDialog(null,"Köttätande växten " +getName()+" behöver "
                    +getKöttÄtandeVäxtSiffra+(getExtraProteinTillskor()*meter)+" liter "+köttÄtandeVäxt +"/dag");
        }
        else {JOptionPane.showMessageDialog(null,"Köttätande växten " +getName()+" behöver "
                +(getExtraProteinTillskor()*getHeight()+getKöttÄtandeVäxtSiffra)+" liter "+köttÄtandeVäxt+"/dag");

        }
    }
}
