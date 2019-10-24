public class stacktest {
        public static void main(String[] args) {

                //menumpuk buku
                stack x = new stack(5);
                x.tumpukkbuku("ipa");
                x.tumpukkbuku("ips");
                x.tumpukkbuku("bindo");
                x.tumpukkbuku("bingg");
                x.tumpukkbuku("bjepang");

                System.out.println();
                x.tumpukkan();
                System.out.println();
                System.out.println("ambil buku "+x.ambilbuku().namabuku);
                System.out.println("ambil buku "+x.ambilbuku().namabuku);
                System.out.println("ambil buku "+x.ambilbuku().namabuku);

                System.out.println();
                x.tumpukkan();
    }
}