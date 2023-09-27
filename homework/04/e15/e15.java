import java.io.Console;
import java.io.*;
import java.lang.*;

class e15 {
    public static void main(String [] args) {

        Console c = System.console();

        String [] shuffled = new String[args.length];

        int [] random = new int [args.length];
        int rando = 0;
        
        //rakennetaan shuffled-taulukko argsin pituuden perusteella
        for(int i = 0; i < args.length; i++)
        {
            //satunnainen luku luokkaa 0-argsin pituus
            rando = (int)(Math.random()*args.length);

            //jos satunnaisesti valittu jäsen ei ole tyhjä, 
            //asetetaan satunnainen jäsen shuffleen
            if(!args[rando].equals(" "))
            {
                shuffled[i] = args[rando];
                //tyhjennetään jo käytetty jäsen
                args[rando] = " ";
            }
            else
            {
                //jos satunnaisesti valittu jäsen oli tyhjä,
                //peruutetaan for-loopissa askel
                i--;
            }
        }

        //tulostus
        for(int j = 0; j < args.length; j++)
        {
            System.out.print(" " + shuffled[j]);
        }

    }
}