package Sprint1.Inlamning1expriment;

public enum Drinks {
    /*Skapar en enum med 3 olika vätsketyper och tilldelar de ett värde i form av double för att använda till att räkna ut hur mycket vätska de ska ha
    Sedan ger jag de ett string värde med namnet på de sedan i mina subklasser så kan jag använda dessa genom getNumber och getDrinks
    */
    KRANVATTEN(0.5, "kranvatten"),
    MINERALVATTEN(2.0, "mineralvatten"),
    PROTEINDRYCK(0.1, "proteindryck");

    private final String drinks;
    private final Double number;

    Drinks(Double number, String drinks) {
        this.number = number;
        this.drinks = drinks;
    }

    public Double getNumber() {
        return number;
    }

    public String getDrinks() {
        return drinks;
    }
}