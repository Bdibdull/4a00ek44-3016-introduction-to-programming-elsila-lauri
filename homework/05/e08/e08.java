import java.io.Console;

class e08 {
    public static void main(String [] args) {
        Console c = System.console();

        System.out.println("Anna neliön korkeus:");
        int kork = Integer.parseInt(c.readLine());

        for(int i = 0; i < kork; i++)
        {
            toista(kork, 'x');
        }
        
    }
    public static void toista(int määrä, char merk)
    {
        String sana = "";
        for(int i = 0; i < määrä; i++)
        {
            sana += merk;
        }
        System.out.println(sana);
    }
}