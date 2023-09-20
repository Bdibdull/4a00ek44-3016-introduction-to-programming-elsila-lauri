import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 

        String nimi = "";
        String pnimi = "";

        do{
            System.out.println("\nAnna nimi: ");
            nimi = c.readLine();
            pnimi += nimi;
            System.out.println(pnimi);
        }while(!nimi.equals("lopeta"));
    }
}