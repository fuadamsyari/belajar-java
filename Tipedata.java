public class Tipedata {
    public static void main(String[] args) {
        // Tipedata Number
        byte iniByte = 100;
        short iniShort = 100;
        int iniIntejer  = 100;
        long  iniLong = 100;
        long iniLong2 = 1000000l;
        // Floating point Number
        float iniFloat = 10.10f;
        double iniDouble = 10.10;
        // Literal Number
        int decimalInt = 25;
        int hexInt  = 0xA132B;
        int binaryDec = 0b10101010;
        // underscore
        long balence = 1_000_000_000;
        int sum = 1_000_000;
        // Konversi Tipe data Number
        // Widening casting Otomatis Byte, short, int, long, float, double
        // Narrowing Casting Manual Double, float, long, int, short, Byte
        // otomatis bisa sesuai urutan
        byte iniByte1 = 10;
        short iniShort1 = iniByte1;
        int iniIntejer1 = iniShort1;
        long iniLong1 = iniIntejer1;
        float iniFloat1 = iniLong1;
        double iniDouble1 = iniFloat1;
        // contoh Lain
        int iniInt2 = 1000;
        double iniDouble2 = (byte) iniInt2;

        // Tipe data Character\
        char a = 'A';
        char f = 'F';
        char n = 'N';
        System.out.println(a);
        System.out.println(f);
        System.out.println(n);

        // Tipe data Boolean True False
        // Default value adalah False
        boolean salah = false;
        boolean benar = true;
        System.out.println(salah);
        System.out.println(benar);

        // Tipe data String
        // petik 2 ""
        String NamaDepan = "Ahmad";
        String NamaTengah = "Fuad";
        String NamaBelakang = "Amsyari";
        String NamaLengkap  = NamaDepan + " " +  NamaTengah + " "  + NamaBelakang;
        System.out.println(NamaDepan);
        System.out.println(NamaTengah);
        System.out.println(NamaBelakang);
        System.out.println(NamaLengkap);

    }
}
