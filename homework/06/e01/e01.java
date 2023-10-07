import java.io.Console;

class e01
{
    static Console c = System.console();

    public static void main(String [] args)
    {
        int [] lukui = new int[10];
        System.out.println("Anna kokonaislukuja: ");
        
        for(int i = 0; i < 10; i++)
        {
            lukui[i] = Integer.parseInt(c.readLine());
        }

        System.out.println("\nAnnoit luvut: ");

        for(int i = 0; i < 10; i++)
        {
            System.out.println(lukui[i]);
        }
    }
}