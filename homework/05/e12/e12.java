import java.io.Console;

class e12 {
    public static void main(String [] args)
    {
        Console c = System.console();

        System.out.println("Anna sana/virke: ");
        String sanvir = c.readLine();

        //tuloste
        if(isPalindrome(sanvir, false))
        {
            System.out.println("Merkkijono on palindromi.");
        }
        else
        {
            System.out.println("Merkkijono ei ole palindromi.");
        }
    }

    public static boolean isPalindrome(String sana, boolean incWS) {
        //incWS: include whitespaces -
        //totuusarvo, huomioidaanko välilyöntejä vai ei
        //jos false, välilyönnit poistetaan
        //jos true, välilyönnit saa pysyä
        //String sana on vain funktiolle annettu merkkijono,
        //jonka palindromiutta testataan

        String sana2 = "";
        String sana3 = "";
        int luku = 0;

        //turhia välilyöntejä pois
        if(!incWS)
        {
            sana = sana.trim();
        }
        
        //rekonstruktoidaan ilman tiettyjä merkkejä
        for (int l = 0; l < sana.length(); l++)
        {
            //tämänhetkinen kirjain käsittelyssä
            char merk = sana.charAt(l);
            //ylimääräiset merkit jätetään uudesta merkkijonosta pois
            //(tähän on varmasti fiksumpi tapa)
            if(merk != ',' && merk != '.')
            {
                //jos välilyönnit halutaan pois
                if(!incWS && merk != ' ')
                {
                    sana2 += sana.charAt(l);
                }
                else if(incWS)
                {
                    sana2 += sana.charAt(l);
                }
            }
        }

        //rekonstruktoidaan vielä takaperin
        for (int j = sana2.length()-1; j > -1; j--)
        {
            sana3 += sana2.charAt(j);
        }

        //on palindromi
        if(sana3.equalsIgnoreCase(sana2))
        {
            return true;
        }
        else //ei ole palindromi
        {
            return false;
        }
    }
}