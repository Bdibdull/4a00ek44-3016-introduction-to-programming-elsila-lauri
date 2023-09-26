import java.io.Console;
import java.io.*;
import java.lang.*;

class e14 {
    public static void main(String [] args) {

        Console c = System.console();

        System.out.println("Anna pelialueen koko: ");
        int koko = Integer.parseInt(c.readLine());

        //muuttujia
        int paikka = 1;
        boolean vuoro = true;
        String [] ruudut = new String[koko];
        String rivi = "";

        //täytetään lista tyhjillä ruuduilla ensiksi
        for (int j = 0; j < ruudut.length; j++)
        {
            ruudut[j] = " ";
        }

        while(true) //tulee olemaan tosi kunnes voitto-> break
        {
            if(vuoro) //jos vuoro on tosi (eli on x:n vuoro)
            {
                System.out.println("\n\nAnna X:lle paikka");
                paikka = Integer.parseInt(c.readLine())-1;
                if(ruudut[paikka].equals("X") || ruudut[paikka].equals("0"))
                {
                    System.out.println("Ruutu otettu!");
                } else {
                    ruudut[paikka] = "X";
                    vuoro = false;

                }
            } else { // 0:n vuoro
                System.out.println("\n\nAnna 0:lle paikka");
                paikka = Integer.parseInt(c.readLine())-1;
                if(ruudut[paikka].equals("X") || ruudut[paikka].equals("0"))
                {
                    System.out.println("Ruutu otettu!");
                } else {
                    ruudut[paikka] = "0";
                    vuoro = true;
                }
            }

            //printataan pelialue
            for(int l = 0; l < ruudut.length; l++)
            {
                System.out.print("|" + (l + 1) + "|");
            }
            System.out.println(); // väli
            for(int i = 0; i < ruudut.length; i++)
            {
                System.out.print("[" + ruudut[i] + "]");
            }

            System.out.println();

            //nollataan rivi ennen rekonstruktiota
            rivi = "";

            //rekonstruktoidaan rivi ruutujen sisällöstä
            for (int k = 0; k < ruudut.length; k++)
            {
                rivi += ruudut[k];
            }

            //kun kaikkien solujen sisältö on merkkijonossa,
            //tarkistetaan, onko missään kohta kolme X tai 0 peräkkäin
            if(rivi.contains("XXX"))
            {
                System.out.println("X voitti!");
                break;
            }
            if(rivi.contains("000"))
            {
                System.out.println("0 voitti!");
                break;
            }

            //jos yksikään solu ei ole tyhjä (" ")
            //eikä kumpikaan ole voittanut (ylhäällä),
            //tulee tasapeli
            if(rivi.contains(" ") == false)
            {
                System.out.println("Tasapeli!");
                break;
            }
        }
    }
}