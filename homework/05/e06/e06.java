import java.io.Console;

class e06 {
    public static void main(String [] args) {
        toista('x', 7);
        
    }
    public static void toista(char merk, int määrä)
    {
        for(int i = 0; i < määrä; i++)
        {
            System.out.print(merk);
        }
    }
}