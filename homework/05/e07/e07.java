import java.io.Console;

class e07 {
    public static void main(String [] args) {
        System.out.println(toista(7, 'x'));
        
    }
    public static String toista(int määrä, char merk)
    {
        String sana = "";
        for(int i = 0; i < määrä; i++)
        {
            sana += merk;
        }
        return sana;
    }
}