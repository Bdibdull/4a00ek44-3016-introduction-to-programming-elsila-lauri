import java.io.Console;  

public class Main {
    public static void main(String [] args) {

        Console c = System.console();
        String ope = "";

        while(!ope.equals("exit"))
        {
            System.out.println("Anna luku yksi tai lopeta (exit): ");
            double luku1 = Double.parseDouble(c.readLine());

            System.out.println("Anna operaattori: ");
            ope = c.readLine();

            System.out.println("Anna luku kaksi: ");
            double luku2 = Double.parseDouble(c.readLine());

            if(ope.equals("+"))
            {
                System.out.println(luku1 + " " + ope + " " + luku2 + " = " + (luku1+luku2));
            }
            else if(ope.equals("/"))
            {
                System.out.println(luku1 + " " + ope + " " + luku2 + " = " + (luku1/luku2));
            }
            else if(ope.equals("-"))
            {
                System.out.println(luku1 + " " + ope + " " + luku2 + " = " + (luku1-luku2));
            }
            else if(ope.equals("*"))
            {
                System.out.println(luku1 + " " + ope + " " + luku2 + " = " + (luku1*luku2));
            }
            else
            {
                System.out.println("Virheellinen syöte!");
            }
            System.out.println();
        }

    }
}