public class methodoverloading {
    public static void main(String[] args) {
        
        sayHello();
        sayHello("Fuad");
        sayHello("Fuad", "Amsyari");

    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String namaDepan){
        System.out.println("Hello" + namaDepan);
    }
    static void sayHello(String namaDepan, String namaBelakang){
        System.out.println("Hello" + namaDepan + namaBelakang);
    }
}
