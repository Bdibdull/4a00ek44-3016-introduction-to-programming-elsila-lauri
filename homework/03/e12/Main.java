import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 

        for(int i = 0; i < 5; i++)
        {
            System.out.println(Math.random());
        }

    }
}