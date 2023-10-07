import java.io.Console;


class e09 {
    public static void main(String [] args) {
        String [] stringArray = {"22", "66", "88", "99"};

        int [] intArray = StringHelper.toIntArray(stringArray);
        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }
}

class StringHelper
{
    public static int [] toIntArray(String [] tauluk)
    {
        int [] utauluk = new int[tauluk.length];
        for(int i = 0; i < tauluk.length; i++)
        {
            utauluk[i] = Integer.parseInt(tauluk[i]);
        }

        return utauluk;
    }
}