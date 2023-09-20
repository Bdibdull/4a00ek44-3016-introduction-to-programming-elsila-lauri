import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Anna sana: ");
        String sana = c.readLine();
        int luku = 0;
        int j = sana.length() - 1;

        //for loop jossa lasketaan muuttujaa i nollasta ylöspäin ja j sanan pituudesta alaspäin
        for (int i = 0; i < sana.length(); i++)
        {
            if (sana.charAt(i) == sana.charAt(j))
            {
                luku = 1;
            }
            else
            {
                luku = 0;
                //ei järkeä jatkaa jos on yksikin virhe
                break;
            }
            j--;
        }

        if(luku == 1)
        {
            System.out.println("Sana on palindromi.");
        }
        else
        {
            System.out.println("Sana ei ole palindromi.");
        }

    }
}