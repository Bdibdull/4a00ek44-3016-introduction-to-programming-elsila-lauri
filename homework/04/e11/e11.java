import java.io.Console;

class e11 {
    public static void main(String [] args) {
        String [] kps = new String[3];

        kps[0] = "kivi";
        kps[1] = "paperi";
        kps[2] = "sakset";

        int rando = (int)(Math.random()*3);

        System.out.println(kps[rando]);
    }
}