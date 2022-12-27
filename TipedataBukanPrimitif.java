public class TipedataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger  = 100;
        Long iniLong = 10000L;
        
        Byte iniByte = null;
        System.out.println(iniByte);
        iniByte = 100;
        System.out.println(iniByte);

        // konfersi ke bukan Primitif
        int iniInt = 100;
        Integer iniInt2 = iniInt;

        System.err.println(iniInt2);

        Integer iniObjek = iniInt2;
        short iniShort = iniObjek.shortValue();





    }
}
