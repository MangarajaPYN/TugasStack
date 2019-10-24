public class stack {

    private String tumpukankoran[];
    private int koranteratas;

    public stack(int jumlah)
    {
        tumpukankoran = new String[jumlah];
        koranteratas = -1;
    }

    public void tumpukkoran(String koran)
    {
        if( koranteratas < tumpukankoran.length-1 ) {
            tumpukankoran[++koranteratas] = koran;
            System.out.println(koran);
        }
    }

    public String ambilkoran() {
        if( koranteratas >= 0 ) {
            String temp = tumpukankoran[koranteratas--];
            return temp;
        }
        return "";
    }

    public void print()
    {
        for (int i = tumpukankoran.length-1; i >= 0; i--) {
            System.out.println(tumpukankoran[i]);
        }
    }
}