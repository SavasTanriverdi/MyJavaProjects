public class Main {
    public static void main(String[] args) {

        String a = "Merhaba";

        System.out.println(a + " Hoşgeldiniz...");

        String b = "Java";
        String c = "Programlama";
        String d = "Dili";

        System.out.println(b + " " + c + " " + d);

        String x = "Merhaba ";
        int y = 35;

        String z = a + y;

        System.out.println(z);

        double l = 3.52;
        byte j = 10;

        x = x + l + j;

        System.out.println(x);

        String t = "Java "
                + "Programlama "
                + "Dili " ;

        System.out.println(t);

        String k = "Java \tProgramlama \tDili"; // Bir Tab kadar boşluk bırakır.
        String s = "Java\nProgramlama\nDili"; // Bir alt satıra geçer.

        System.out.println(k);
        System.out.println(s);
    }
}