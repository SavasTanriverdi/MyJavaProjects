public class Main {
    public static void main(String[] args) {
        int a = 4; // 32bit yani 4byte yer kaplıyor -> -2^31 en dusuk en yüksek 2^31

        System.out.println("\nINT");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        byte b = 100;

        System.out.println("\nBYTE");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short c = 1000;
        System.out.println("\nSHORT");
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        long d = 1000;
        System.out.println("\nLONG");
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        

    }
}