import java.io.Console;


class e12 {
    public static void main(String [] args) {
        String yksi = "koirarotu";
        String kaksi = "raro";
        String kolme = "a";
        System.out.println(StringHelper.contains(yksi, kaksi));
        System.out.println(StringHelper.contains(yksi, kolme));
        System.out.println(StringHelper.contains(kaksi, yksi));
        System.out.println(StringHelper.contains("koirarotu", "raro"));
        System.out.println(StringHelper.contains("saippuakivikauppias", "kivi"));
        System.out.println(StringHelper.contains("kivi", "kivi"));
        System.out.println(StringHelper.contains("kiva", "a"));
    }
}

class StringHelper
{
    public static boolean contains(String a, String b)
    {
        //rekonstruktointia varten
        String sanaA = "";

        //käydään a:n jokainen merkki lävitse
        for(int i = 0; i < a.length(); i++)
        {
            //jokaisen merkin kohdalta rakennetaan a uudestaan
            //ja vertaillaan, onko se sama kuin b
            for(int j = i; j < a.length(); j++)
            {
                sanaA += a.charAt(j);
                if(sanaA.equals(b))
                {
                    return true;
                }
            }
            //nollataan sana uutta rakennusta varten
            sanaA = "";
        }
        //jossei kertakaan löydy yhtäsuuruutta, sitte false
        return false;
    }
}