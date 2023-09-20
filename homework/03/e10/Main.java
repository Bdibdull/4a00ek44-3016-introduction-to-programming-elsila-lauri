import java.io.Console;  

public class Main {
    public static void main(String [] args) {

        Console c = System.console();

        System.out.print("Anna luku yksi: ");
        int luku1 = Integer.parseInt(c.readLine());

        System.out.print("Anna luku kaksi: ");
        int luku2 = Integer.parseInt(c.readLine());

        int isoluku;
        int pluku;
        if(luku1 > luku2)
        {
            isoluku = luku1;
            pluku = luku2;
            
        }
        else
        {
            isoluku = luku2;
            pluku = luku1;
        }

        for(int i = pluku; i <= isoluku; i++)
        {
            System.out.println(i);
        }
    }
}