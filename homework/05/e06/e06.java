import java.io.Console;

class e05 {
    public static void main(String [] args) {
        Console c = System.console();

        System.out.println("Anna kaksi lukua: ");
        int luku1 = Integer.parseInt(c.readLine());
        int luku2 = Integer.parseInt(c.readLine());

        System.out.println(laske(luku1, luku2));
    }
    public static int laske(int luku1, int luku2) {
        return (luku1+luku2);
    }
}