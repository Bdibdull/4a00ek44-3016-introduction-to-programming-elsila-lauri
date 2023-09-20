import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Kerro nimesi:");
        String nimi = c.readLine();
        if (nimi.equals("Jussi"))
        {
            System.out.println("Onpas sinulla tyhmä nimi.");
        }
        else
        {
            System.out.println("Onpas sinulla hieno nimi.");
        }
    }
}