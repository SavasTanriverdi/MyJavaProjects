public class Main {
    public static void main(String[] args) {
        // Double : 64 bit - 8 byte
        // Float : 32 bit - 8 byte

        // Otomatik Dönüştürme : int --> float --> double

        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;

        System.out.println("\bDouble");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        float x = 5.0f;
        float w = (float) 4.0;
        float y = 4.0f;
        float z = 4f;
        float t = 4.23f;

        System.out.println("\bFloat");
        System.out.println(x);
        System.out.println(w);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);

        int q = 22 / 7;
        float p = 22f / 7f;
        double r = 22d / 7d;

        System.out.println("Double ve Float arasındaki fark:");
        System.out.println("q: " + q);
        System.out.println("p: " + p);
        System.out.println("r: " + r);

        double i = 5;
        float j = (float) i;

        System.out.println(j);

        double sayi1 = 70.25;
        double sayi2 = 60d;
        double sayi3 = 80.2;

        System.out.println("Ortalama double: " + (sayi1 + sayi2 + sayi3) / 3);

        float x1 = 70.25f;
        float x2 = 60f;
        float x3 = 80.2f;

        System.out.println("Ortalama float: " + (x1 + x2 + x3) / 3);

    }
}