public class Array {
    public static void main(String[] args) {
    // Membuat array
    String[] ArrayString = new String[3]; 
    ArrayString[0] = "Ahmad";
    ArrayString[1] = "Fuad";
    ArrayString[2] = "Amsyri";

    ArrayString[0] = null;

    // System.out.println(ArrayString[0]);
    // System.out.println(ArrayString[1]);
    // System.out.println(ArrayString[2]);

    // array integer
    int[] ArrayInt = new int[]{
        10,20,30,40,50
    };

    long[] contoh1 = new long[]{
        1,2,3,4,5,6,7,8,9,10
    } ;
    // System.out.println(contoh1[5]);
    // System.out.println(contoh1.length);

    // Array di dalam Array
    String[][] members = {
        {"fuad", "bagus", "dodit"},
        {"nuri", "angel"},
        {"joko"}
    };
    // System.out.println(members[0][2]);
    // System.out.println(members[1][0]);
    // System.out.println(members[1][1]);

    }






}
