import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Kerro nimesi: ");
        String nimi = c.readLine();

        for(int i = 0; i < nimi.length(); i ++)
        {
            System.out.println(nimi.charAt(i));
        }
    }
}