package Sprint2.Inlamning2ny;

import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Huvudprogram {

    //Metod för att skriva ut resulatet
    public String outPutResult(Customer customer){
        String result;
        if(customer.getCustomerDate() == null){
            result = " har aldrig varit medlem";
        }
        else if (isMember(customer.getCustomerDate())){
            result = " är en betalande kund";
        }
        else
            result = " är en gammal kund";
        return customer.getName()+result;
    }
    //Metod för att kolla om personen är medlem
    public boolean isMember(LocalDate localDate){
        LocalDate dateNow = LocalDate.now(); //Skapar upp dagens datum
        if(localDate != null) {
            Period p = Period.between(localDate, dateNow);
            return p.getYears() == 0;
        }
    return false;
    }

    //Metod för att skriva i filen customer
    public void writeFile(Customer customer){
        String fileName2 ="src/Sprint2/Inlamning2ny/customer.txt"; //Filnamn
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2, true))){ //Här skapar jag upp en writer och lägger den i try with resoruches
            String customerString = String.format("%s , %s , %s\n","Personnummer: "+customer.getPersNr(),"Namn: "+customer.getName(),"Loggade in på gymmet: "+LocalDate.now());
            writer.write(customerString); //Här skriver jag ut i filen fileName2 den strängen som jag har skapat ovanför


        }
        catch (IOException e){ //Kontrollerar så att det inte finns några fel sånnafall kommer detta att köras
            System.out.println("Något gick fel");
            e.printStackTrace();
        }
    }

    //Metod för att skriva in ett namn och ta reda på om personen är medlem
    public Customer findCustomers(List<Customer> customerList) {
        Scanner scan = new Scanner(System.in); //Scanner för att få ut värdet som användaren matar in
        boolean found = true;

        System.out.println("Sök efter namn eller personnummer: ");
        String searchedValue = scan.nextLine().trim(); //Här använder jag min scanner och läser in det användaren skriver och tar bort eventuella osynliga tecken
        for (Customer c : customerList) {
            if (searchedValue.equals(c.getPersNr()) || searchedValue.equalsIgnoreCase(c.getName())) { //Equals för persnr och equalsIgnoreCase för namnet pga strunta i stora små bokstäver
                if(isMember(c.getCustomerDate())){
                    writeFile(c);  //Anropar metoden writeFile
                }
               return c;
            }


        }
        return new Customer("",searchedValue,null);

    }

    //Metod för att skapa upp en lista till alla kunder
    public List<Customer> createObjectCustomerList (List<String> findCustomersList){

        List<Customer> customerList = new ArrayList<>();

            for (int i = 0; i < findCustomersList.size(); i ++) {
                if(i %2 == 0) {
                    String personNumb = findCustomersList.get(i).split(", ")[0]; //Använder split för att dela upp firstLine till persnr
                    String personName = findCustomersList.get(i).split(", ")[1]; //Använder split för att dela upp firstLine till name
                    i++;
                    LocalDate customerDate = LocalDate.parse(findCustomersList.get(i)); //Tar reda på kundens datum
                    customerList.add(new Customer(personNumb, personName, customerDate));
                }


            }
            return customerList;

    }
    //Metod för att läsa filer
    public List<String> readFile(){
        String fileName = "src/Sprint2/Inlamning2ny/personposter.txt"; //Filnamnet
        List<String> personer = new ArrayList<>(); //Lista för o spara ner personer i
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){ //Skapar en reader som jag kan använda för att läsa från filen

            String firstLine ; //För att läsa in personnummer och namn
            String secondLine; //För att läsa in Datum

            while((firstLine = reader.readLine()) != null && (secondLine = reader.readLine()) != null){ //Kontrollerar så att inte någon av first/second line är tom
               // System.out.println("Namn och personnr: "+firstLine+ " Datum: "+ secondLine); skriver ut hela listan obs ta bort sen
                personer.add(firstLine); //Lägger till firstLine i listan
                personer.add(secondLine); //Lägger till datum i listan

            }

        }
        catch (IOException e){
            System.out.println("Något gick fel!");
            e.printStackTrace();
        }
        return personer;
    }

//Skapar upp en instans av Huvudprogram för att kunna anropa alla mina metoder som finns i den konstruktorn
    public static void main(String[] args) {
        Huvudprogram hp = new Huvudprogram();
        List<String> mainList = hp.readFile();
        List<Customer> customerMainList = hp.createObjectCustomerList(mainList);
        hp.readFile();
        Customer mainCust = hp.findCustomers(customerMainList);
        String outPutCus =  hp.outPutResult(mainCust);
        System.out.println(outPutCus);
        hp.isMember(mainCust.getCustomerDate());

    }
}
