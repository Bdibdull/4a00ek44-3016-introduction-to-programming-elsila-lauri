import java.io.Console;

class e07
{
    static Console c = System.console();

    public static void main(String [] args)
    {
        int [] lukui = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(laskeKeskiarvo(lukui));
    }

    public static double laskeKeskiarvo(int [] lista)
    {
        double sum = 0;
        for(int i = 0; i < lista.length; i++)
        {
            sum += lista[i];
        }
        sum = sum/lista.length;
        return sum;
    }
}