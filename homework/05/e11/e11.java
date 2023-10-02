import java.io.Console;

class e11 {
    public static void main(String [] args)
    {
        Console c = System.console();

        System.out.println("Anna sana/virke: ");
        String sanvir = c.readLine();
        if(isPalindrome(sanvir))
        {
            System.out.println("Sana on palindromi.");
        }
        else
        {
            System.out.println("Sana ei ole palindromi.");
        }
    }

    public static boolean isPalindrome(String sana) {
        String sana2 = "";
        String sana3 = "";
        int luku = 0;

        //turhia välilyöntejä pois
        sana = sana.trim();

        //rekonstruktoidaan ilman tiettyjä merkkejä
        for (int l = 0; l < sana.length(); l++)
        {
            char merk = sana.charAt(l);
            //ylimääräiset merkit jätetään uudesta merkkijonosta pois
            //(tähän on varmasti fiksumpi tapa)
            if(merk != ',' && merk != ' ' && merk != '.')
            {
                sana2 += sana.charAt(l);
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