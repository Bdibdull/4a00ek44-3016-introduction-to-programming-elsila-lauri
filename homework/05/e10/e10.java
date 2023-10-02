
class e10 {
    public static void main(String [] args)
    {
        String mj = MyString.replaceAll("Hitto mää oon hyvä videopeleissä", 'o', "terve");
        System.out.println(mj);
        mj = MyString.replaceAll("abc:abc:", 'a', "terve");
        System.out.println(mj);
    }
    
}

class MyString
{
    public static String replaceAll(String sana, char merk, String usana)
    {
        String rsana = "";
        for(int i = 0; i < sana.length(); i++)
        {
            if(sana.charAt(i) == merk)
            {
                rsana += usana;
            }
            else
            {
                rsana += sana.charAt(i);
            }
        }
        return rsana;
    }
}