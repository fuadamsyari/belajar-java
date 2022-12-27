public class breakcontinue {
    public static void main(String[] args) {
        
        var i = 0;

        while (true) {
            System.out.println("perulangan" + i);
            i++;

            if (i >10) {
                break;
            }

        }
        System.out.println("========================");


        // contoh dari continue
        for (var a = 1; a <=100 ; a++) {
            if (a % 2 == 0) {
                continue;
            }
            System.out.println(a);
        }





    }
}
