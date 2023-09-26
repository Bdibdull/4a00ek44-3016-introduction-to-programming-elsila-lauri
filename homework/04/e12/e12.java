
class e12 {
    public static void main(String [] args) {
        double tulos = 0;
        double luku1 = Integer.parseInt(args[0]);
        double luku2 = Integer.parseInt(args[2]);

        if (args[1].equals("+"))
        {
            tulos = luku1 + luku2;
        }
        else if (args[1].equals("/"))
        {
            tulos = luku1 / luku2;
        }
        else if (args[1].equals("-"))
        {
            tulos = luku1 - luku2;
        }
        else if (args[1].equals("x"))
        {
            tulos = luku1 * luku2;
        }

        System.out.println("Tulos = " + tulos);
    }
}