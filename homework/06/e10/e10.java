import java.io.Console;


class e10 {
    public static void main(String [] args) {
        String yksi = "laatikko";
        String kaksi = "laatikko";
        String kolme = "banaani";
        String neljä = "laatikko ";

        System.out.println(StringHelper.equals(yksi, kaksi));
        System.out.println(StringHelper.equals(yksi, kolme));
        System.out.println(StringHelper.equals(kaksi, kolme));
        System.out.println(StringHelper.equals(yksi, neljä));
    }
}

class StringHelper
{
    public static int [] toIntArray(String [] tauluk)
    {
        int [] utauluk = new int[tauluk.length];
        for(int i = 0; i < tauluk.length; i++)
        {
            utauluk[i] = Integer.parseInt(tauluk[i]);
        }

        return utauluk;
    }

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
}