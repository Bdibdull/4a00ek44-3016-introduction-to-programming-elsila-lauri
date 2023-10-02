import java.io.Console;

class e13 {
    public static void main(String [] args)
    {
        Console c = System.console();

        System.out.println("Anna minimi: ");
        int mini = Integer.parseInt(c.readLine());

        System.out.println("Anna maksimi: ");
        int maxi = Integer.parseInt(c.readLine());

        System.out.println(); //spacing

        //tulostetaan satunnainen luku annetulta väliltä 10 kertaa
        //(kymmenen kertaa koska hauskempaa vaikkei kysytty)
        for (int i = 0; i < 10; i++)
        {
            System.out.println(MyMath.getRandom(mini, maxi));
        }
    }
}

class MyMath
{
    public static int getRandom(int min, int max)
    {
        //vaihteluväli
        int vali = max - min;

        int rando = (int)(Math.random()*(vali+1))+min;

        return rando;
    }
}