import java.io.Console;
import java.io.*;
import java.lang.*;

class e16 {
    public static void main(String [] args) {

        Console c = System.console();
        String nimi = "";
        String [] nimet = new String[10];
        String [] back = new String[10];
        int i = 0;

        System.out.println("Anna nimiä: ");

        while(!nimi.equals("lopeta"))
        {
            nimi = c.readLine();

            if(i < nimet.length && !nimi.equals("lopeta"))
            {
                nimet[i] = nimi;
            }
            else
            {
                //kopioidaan nimet-taulukko back-taulukkoon
                for(int j = 0; j < i; j++)
                {
                    back[j] = nimet[j];
                }
                //tyhjenettään nimet ja suurennettaan kokoa
                nimet = new String [i+15]; //koko offset pitäisi olla enemmän kuin 10
                //kopioidaan back-taulukosta nimet nimet-taulukkoon
                for(int j = 0; j < i; j++)
                {
                    nimet[j] = back[j];
                }
                //tyhjenettään back ja suurennetaan kokoa
                back = new String [i+15];
            }

            i++;
        }

        System.out.println("\nAnnoit nimet:");

        //tulostetaan annetut nimet
        for(int j = 0; j < nimet.length; j++)
        {
            //tyhjäarvoja ei tulosteta
            if(nimet[j] != null)
            {
                System.out.println(nimet[j]);
            }
        }

    }
}