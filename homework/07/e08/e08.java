import java.io.Console;

class e08
{
    static Console c = System.console();

    public static void main(String[] args)
    {
        System.out.println("Anna rivien määrä:");
        int pit1 = Integer.parseInt(c.readLine());

        System.out.println("Anna rivien pituus:");
        int pit2 = Integer.parseInt(c.readLine());

        int[][] luku = new int[pit1][pit2];

        for(int i = 0; i < luku.length; i++)
        {
            for(int j = 0; j < luku[i].length; j++)
            {
                System.out.println("Anna uusi luku:");
                luku[i][j] = Integer.parseInt(c.readLine());
            }
        }

        System.out.println();

        printTwoDimArray(luku);

        int max = 0;

        for(int i = 0; i < luku.length; i++)
        {
            for(int j = 0; j < luku[i].length; j++)
            {
                if(luku[i][j] > max)
                {
                    max = luku[i][j];
                }
            }
        }

        System.out.println("\nMaksimi on:");
        System.out.println(max);
    }

    public static void printTwoDimArray(int [][] myarray)
    {
        for(int i = 0; i < myarray.length; i++)
        {
            for(int j = 0; j < myarray[i].length; j++)
            {
                System.out.print(myarray[i][j]);
            }
            System.out.println();
        }
    }
}