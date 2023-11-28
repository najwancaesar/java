package method;


public class pemanggilanMethod {
    public static void main(String[] args) {
        int x,y,z = 0;
        y = 3;
        z = 6;
        int g = 0;
        x = cariNilaiGanjilGenap(y);
        g = cariNilaiGanjilGenap(z);

        if (x == 1)
        
        System.out.println("Angka "+y+" adalah Ganjil");
        else
        System.out.println("Angka "+y+" adalah Genap");

        if (g == 0)
        System.out.println("Angka "+z+" adalah Genap");
        else
        System.out.println("Angka "+z+" adalah Ganjil");
    }
    
    public static int cariNilaiGanjilGenap(int nilai) {
        nilai = nilai % 2;
        return nilai;
    }
    
}
