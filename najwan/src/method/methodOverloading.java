package method;
// Method Overloading
public class methodOverloading {

    //Driver code
    public static void main(String[] args) {
        
        //Panggil method cariluas
        System.out.println(cariLuas(6.0,3));
        System.out.println(cariLuas(10,2));
        System.out.println(cariLuas(21));
    }
    // Overloaded cari luas SegiTiga
    public static double cariLuas(double alas, int tinggi) {
        return (1/2f * (alas * tinggi ));

    }
    // Overloaded cari luas Persegi Panjang
    public static int cariLuas(int panjang, int lebar) {
        return (panjang * lebar);
    }

    // Overloaded cari luas Lingkaran
    public static int cariLuas(int r) {
         double phi = 22/7f;
        // System.out.println(phi);
        int hasil = 0;
        if(r % 2 == 1){
           
            hasil = (int)(phi * r * r);
        }
        return hasil;

    }

    
}
