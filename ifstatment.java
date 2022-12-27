public class ifstatment {
    public static void main(String[] args) {
        
        // if statment
        var nilai = 75;
        var absen = 75;

        if (nilai >= 75 && absen >=95) {
            System.out.println("anda lulus");
        }else {
            System.out.println("Anda Remidial");
        }

        System.out.println("=========================");

        if (nilai >= 80 && absen >=80) {
            System.out.println("Nilai anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai anda C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai anda D");
        } else {
            System.out.println("Nilai anda E");
        }

    }
}
