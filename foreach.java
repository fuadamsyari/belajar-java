public class foreach {
    public static void main(String[] args) {



        // tanap foreach
        String[] array = {"fuad", "angel", "dodit", "bima", "vio"};

        for (var i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        System.out.println("==================");
        System.out.println("for each");

        // menggunakan foreach
        for (var name: array) {
            System.out.println(name);
        }
    }
}
