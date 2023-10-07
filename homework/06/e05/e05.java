import java.io.Console;

class e05
{
    static Console c = System.console();

    public static void main(String [] args)
    {
        System.out.println(jaa(1,1));
        System.out.println(jaa(1,2));
        System.out.println(jaa(2,1));
    }

    public static double jaa(int luku1, int luku2)
    {
        //käännetään molemmat muuttujat samalla kun jaetaan
        //tehokkuus jippii
        return (double)(luku1)/(double)(luku2);
    }
}