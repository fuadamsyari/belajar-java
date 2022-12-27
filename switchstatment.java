public class switchstatment {
    public static void main(String[] args) {
        

        var golgaji = "A";

        switch (golgaji) {
            case "A":
                System.out.println("Gaji anda 5.000.000");
                break;
            case "B":
                System.out.println("Gaji anda 3.000.000");
                break;
            case "C":
                System.out.println("Gaji anda 2.000.000");
                break;
            default:
                System.out.println("Mungkin anda tidak bekerja disini");
        }

        System.out.println("================================");

        // switch lamda
        switch (golgaji) {
            case "A" -> {System.out.println("Gaji anda 5 juta");}
            case "B" -> {System.out.println("Gaji anda 3 juta");}
            case "C" -> {System.out.println("Gaji anda 2 juta");}
            default -> {System.out.println("Anda tidak bekerja disini");}
        }

        System.out.println("-========================-");

        
        // tanpa yield
        var gaji = "A";
        String ucapan;
        switch (gaji) {
            case "A" -> ucapan = "Gaji anda 5 juta";
            case "B" -> ucapan = "Gaji anda 3 juta";
            case "C" -> ucapan = "Gaji anda 2 juta";
            default -> {
                ucapan = "anda tidak digaji";
            }
        }
        System.out.println(ucapan);
        // menggunakan yield
        var upah = "B";
        ucapan = switch (upah) {
            case "A" : yield "Upah anda 5 juta";
            case "B" : yield "Upah anda 3 juta";
            case "C" : yield "Upah anda 2 juta";
            default : yield "Anda tidak bekerja disini";
        };

        System.out.println(ucapan);
    }
}
