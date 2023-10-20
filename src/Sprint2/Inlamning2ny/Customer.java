package Sprint2.Inlamning2ny;

import java.time.LocalDate;

public class Customer {
//Skapar upp 3 instansvariabler
    private String persNr;
    private String name;
    private LocalDate customerDate;

    //Konstruktor
    Customer(String persNr ,String name, LocalDate customerDate){
        this.persNr = persNr;
        this.name = name;
        this.customerDate = customerDate;
    }

    //Inkaplsing av mina private instansvariabler här ovan med getter and setter
    public String getPersNr() {
        return persNr;
    }

    public void setPersNr(String persNr) {
        this.persNr = persNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCustomerDate() {
        return customerDate;
    }

    public void setCustomerDate(LocalDate customerDate) {
        this.customerDate = customerDate;
    }
}
