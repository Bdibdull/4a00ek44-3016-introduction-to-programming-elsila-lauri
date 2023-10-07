import java.io.Console;
import java.util.Scanner;

class e02
{
    //muuttujat inputin lukemista varten
    //teoriassa tarvii vain scannerin?
    static Console c = System.console();
    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args)
    {
        System.out.println("Anna taulukon koko: ");
        int koko = Integer.parseInt(c.readLine());

        //syötteen kokoinen taulukko
        char [] merkkei = new char[koko];
        
        System.out.println("Anna merkkejä: ");
        for(int i = 0; i < koko; i++)
        {
            merkkei[i] = sc.next().charAt(0);
        }

        System.out.println("\nTuloste: ");

        for(int i = 0; i < koko; i++)
        {
            System.out.print(merkkei[i]);
        }
    }
}