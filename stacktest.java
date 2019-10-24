public class stacktest {
        public static void main (String [] args){
            stack c = new stack(6);

            System.out.println("tumpukkan koran : ");
            c.tumpukkoran("MX");
            c.tumpukkoran("TRIBUN");
            c.tumpukkoran("LAMPUHIJAU");
            c.tumpukkoran("RIAUPOS");
            c.tumpukkoran("LAMPUMERAH");

            System.out.println();
            System.out.println("koran yang diambil :");
            System.out.println(c.ambilkoran());
            System.out.println(c.ambilkoran());


    }
}
