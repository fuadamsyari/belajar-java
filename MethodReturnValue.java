public class MethodReturnValue {
    public static void main(String[] args) {
        // membuat aplikasi penggabung nama

        // membuat wadah penampung untuk Nama depan dan belakang
        String namaDepan = "Fuad";
        String namaBelakang = "Amsyari";

        // membuat wadah untuk hasil penggabungan
        String namaLengkap = gabung(namaDepan,namaBelakang);

        // mencetak hasil penggabungkan
        System.out.println("++++++++++++++++");
        System.out.println(namaLengkap);
        System.out.println("++++++++++++++++");


        System.out.println(hitung(100, "x" , 100));

    }
    // method atau function penggabung nama
    static String gabung (String namaDepan, String namaBelakang){
        // membuat operasi method fungction
        var hasil = namaDepan + " " + namaBelakang;
        // mengembalikan nilai hasil
        return hasil;
    }

    static int hitung (int value, String operasi, int value2){
        switch (operasi) {
            case "+" :  return value + value2;
            case "-" :  return value - value2;
            case ":" :  return value / value2;
            case "x" :  return value * value2;
            default : return 0 ;
        }
    }
}
