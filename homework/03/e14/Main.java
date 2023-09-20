import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Anna salasana: ");
        String salasana = c.readLine();

        boolean pitkä = false;
        boolean pkirjain = false;
        boolean ikirjain = false;
        boolean nro = false;

        if(salasana.length() >= 8)
        {
            pitkä = true;
        }

        for(int i = 0; i < salasana.length(); i++)
        {
            if(Character.isLowerCase(salasana.charAt(i)))
            {
                pkirjain = true;
            }
            else if(Character.isUpperCase(salasana.charAt(i)))
            {
                ikirjain = true;
            }
            else if(Character.isDigit(salasana.charAt(i)))
            {
                nro = true;
            }
            //else if, sillä jos ehto on tosi, tämä kirjaimen kohdalla
            //ei ole järkevää enää tarkastaa muita
        }

        boolean kaikki = pitkä && pkirjain && ikirjain && nro;
        if(kaikki)
        {
            System.out.println("Salasana hyväksytty.");
        }
        else
        {
            if(pitkä == false)
            {
                System.out.print("Salasana on liian lyhyt. ");
            }
            if(pkirjain == false)
            {
                System.out.print("Salasanassa ei ole pientä kirjainta.\n");
            }
            if(ikirjain == false)
            {
                System.out.print("Salasanassa ei ole isoa kirjainta. ");
            }
            if(nro == false)
            {
                System.out.print("Salasanassa ei ole numeroa.");
            }
        }

    }
}