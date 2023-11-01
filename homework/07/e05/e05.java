import java.io.Console;

class e05
{
    static Console c = System.console();

    public static void main(String[] args)
    {
        int[][] luku = {{0, 0, 0},{0, 0, 0}};

        for(int i = 0; i < luku.length; i++)
        {
            for(int j = 0; j < luku[i].length; j++)
            {
                System.out.println("Anna uusi luku:");
                luku[i][j] = Integer.parseInt(c.readLine());
            }
        }

        printTwoDimArray(luku);
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