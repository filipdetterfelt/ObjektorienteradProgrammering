package Sprint1.Inlamning1expriment;

abstract class Växter implements Interface {

    public enum PlantsInHotel{
        IGGE("Igge"),

        LAURA("Laura"),
        MEATLOAF("Meatloaf"),
        OLOF ("Olof");

        private final String nameOfPlants;

        PlantsInHotel(String nameOfPlants){
            this.nameOfPlants = nameOfPlants;
        }

        public String getNameOfPlants() {
            return nameOfPlants;
        }
    }

    //Skapar upp ett antal instansvariabler och sedan kapslar jag in de med hjälp av get and set
    private String name;
    private double height;
    private String unit;


    public  Växter(String name, double height, String unit){
        this.name = name;
        this.height = height;
        this.unit = unit;
    }
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.unit = unit;
    }
    public void setPlant(String name,double height,String unit){
        this.name = name;
        this.height = height;
        this.unit = unit;
    }
//Denna är jag osäker på om den äns används kolla upp detta!!
    public void plantsInHotel(){

    }
}
