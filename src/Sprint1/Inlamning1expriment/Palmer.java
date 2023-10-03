package Sprint1.Inlamning1expriment;

import javax.swing.*;

public class Palmer extends Växter {

    String palm = Drinks.KRANVATTEN.getDrinks();
    Double palmSiffra = Drinks.KRANVATTEN.getNumber();


    public Palmer(String name, double height ,String unit){
        super(name,height,unit);
    }

    public void printPlant(){
        JOptionPane.showMessageDialog(null,"Palmen "+getName()
                +" är "+getHeight()+" "+getUnit()+" hög");
    }

    @Override
    public void printFormel(){
        if(!getUnit().equalsIgnoreCase("meter")){
            double meter = getHeight() /100;

            JOptionPane.showMessageDialog(null,"Palmen " +getName()+" behöver "
                    +(palmSiffra*meter)+" liter"+palm+"/dag");
        }
        else {JOptionPane.showMessageDialog(null,"Palmen " +getName()+" behöver "
                +(palmSiffra*getHeight())+" liter "+palm+"/dag");

        }


    }
}
