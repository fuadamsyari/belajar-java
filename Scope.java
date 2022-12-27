public class Scope {
    public static void main(String[] args) {
        

        say("");
    }


    static void say(String name){
        String hello = "hello" + name;

        if (!name.isBlank()) {
            String hi = "hai" + name;
            System.out.println(hi);
        }
        System.out.println(hello);
        // System.out.println(hi);
    }
}
