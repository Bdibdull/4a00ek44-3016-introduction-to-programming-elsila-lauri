import java.io.Console;


class e11 {
    public static void main(String [] args) {
        String [] nimii = (StringHelper.split("taavo:paavo,kaavio,lauri", ','));
        System.out.println(nimii[0]);
        System.out.println(nimii[1]);
        System.out.println(nimii[2]);
    }
}

class StringHelper
{
    //muuttaa merkkijonotaulukon kokonaislukutaulukoksi
    public static int [] toIntArray(String [] tauluk)
    {
        int [] utauluk = new int[tauluk.length];
        for(int i = 0; i < tauluk.length; i++)
        {
            utauluk[i] = Integer.parseInt(tauluk[i]);
        }

        return utauluk;
    }

    //tarkistaa kahden merkkijonon yhtäsuuruuden
    public static boolean equals(String a, String b)
    {
        if(a.length() == b.length())
        {
            for(int i = 0; i < a.length(); i++)
            {
                if(a.charAt(i) != b.charAt(i))
                {
                    //yksikään merkki eri, niin false
                    return false;
                }
            }
        }
        else //jos merkkijonot eripituisia, niin välitön return false
        {
            return false;
        }
        //vain jos päännyt kaikista testeistä: return true
        return true;
    }

    //halkaisee annetun merkkijonon erotinmerkin kohdalta
    public static String [] split(String merjono, char ero)
    {
        //taulukko, jonka sitten palautamme
        String [] sanoi = new String[1];

        //sanoi-taulukon pituuden muuttamista varten
        String [] backup = new String[1];

        //sana/sanat, jota uudelleenrakennetaan
        String sana = "";

        //sanoi-taulukon pituus 
        int pituus = 1;

        //kun ollaan merkkijonon viimeisessä merkissä
        boolean lopus = false;
        for(int i = 0; i < merjono.length(); i++)
        {
            lopus = i == (merjono.length()-1);

            if(merjono.charAt(i) == ero || lopus)
            {
                //kopioidiaan sanoi backup-taulukkoon
                for(int j = 0; j < sanoi.length; j++)
                {
                    backup[j] = sanoi[j];
                }
                //pidennetään sanoi-taulukkoo
                sanoi = new String[pituus];

                //sama homma toisipäi
                for(int j = 0; j < backup.length; j++)
                {
                    sanoi[j] = backup[j];
                }
                backup = new String[pituus];

                //viimeinen merkkijonon merkki ei tule ilman tätä,
                //sillä tässä if-lauseessa ei merkkiä normisti
                //lisätä sana-muuttujaan
                if(lopus)
                {
                    sana += merjono.charAt(i);
                }

                //lisätään indexii pituus-1 alla olevan else-lauseen
                //luoma sana
                sanoi[(pituus-1)] = sana;
                //tyhjennetään sana-muuttuja
                sana = "";
                //lisätään taulukon pituutta
                pituus += 1;
            }
            else //konstruktoidaan sanaa (jossei olla lopussa tai ero-merkissä)
            {
                sana += merjono.charAt(i);
            }
        }

        return sanoi;
    }
}