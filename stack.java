public class stack {

    buku tumpukkanbuku[];
    int bukupalingatas;

    public stack(int jumlah) {
    tumpukkanbuku = new buku[jumlah];
    bukupalingatas = -1;
}
    public void tumpukkbuku(String buku) {
        if( bukupalingatas < tumpukkanbuku.length-1 ) {
            tumpukkanbuku[++bukupalingatas]=new buku(buku);
        }
    }

    public buku ambilbuku() {
        if( bukupalingatas >= 0 ) {
            buku temp = tumpukkanbuku[bukupalingatas--];
            return temp;
        }
        return null;
    }

    public void tumpukkan() {
        System.out.println("tumpukkan : ");
        for (int i = bukupalingatas; i >= 0; i--) {
            System.out.printf("nama buku :%s \n", tumpukkanbuku[i].namabuku, tumpukkanbuku[i]);
        }
    }
}