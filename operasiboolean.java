public class operasiboolean {
    public static void main(String[] args) {
        
        var absen = 76;
        var nilaiAkhir = 80;
        boolean lulusAbsen = absen >= 75;
        boolean cekremidi = nilaiAkhir >= 75;

        var lulus = lulusAbsen && cekremidi;
        System.err.println("===========================");
        System.out.println(lulus);
    }
}
