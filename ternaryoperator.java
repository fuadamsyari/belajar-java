public class ternaryoperator {
    public static void main(String[] args) {
        

        // tanpa ternary
        var nilai = 20;
        var ucapan = "";
        if (nilai >= 75) {
            ucapan = "Anda Lulus";
        } else {
            ucapan = "Anda remidi";
        }
        System.out.println(ucapan);
        System.out.println("++++++++++++++++++++++++++++");
        // ternary
        var biji = 80;
        var mau = biji >= 75 ? "Maka anda lulus" : "Anda remidi";
        System.out.println(mau);









    }
}
