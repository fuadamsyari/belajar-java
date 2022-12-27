public class MethodVariabelArgumen {
    public static void main(String[] args) {
     
        say("fuad", 50,95,60,90,95,90);


    }
    static void say (String name, int... values){
        var total = 0;
        
        for (int i : values) {
            total += i;
        }

        var totalnilai = total / values.length;

        if (totalnilai >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus" );
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus" );

        }


    }
}
