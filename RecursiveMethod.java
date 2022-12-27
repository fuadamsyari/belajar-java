public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorial(5));


        loop(60);

    } 
    // tanpa recursive
    static int faktorial(int value){
        var result = 1;
        for (var i = 1; i <= value; i++) {
            result *= i;
            
        }
        return result;
    }
    // menggunakan recursive
    static int factorial(int value){
        if (value == 1) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }
    // contoh eoro stackoverflow

    static void loop(int value){
        if (value == 0) {
            System.out.println("loop selesai");
        } else {
            System.out.println("value " + value);
            loop(value - 1);
        }
    }
}
