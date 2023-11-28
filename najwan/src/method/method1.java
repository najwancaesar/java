package method;
//Membuat method menentukan bilangan ganjil/genap
//tanpa pengembalian nilai
public class method1 {
     public static void main(String[] args){

        cariNilaiGanjilGenap(2);
        cariNilaiGanjilGenap(3);
        cariNilaiGanjilGenap(16);

        cariNamaTemen("najwan");
        cariNamaTemen("rafi");

     } 
        public static void cariNilaiGanjilGenap(int nilai) {
            nilai = nilai % 2;
            if (nilai == 1)
            System.out.println("Nilai Ganjil");
            else
            System.out.println("Nilai Genap");
        }
    
        public static void cariNamaTemen(String nama){
            String[] Nama = {"dima","rusli","najwan","ocefath","rafi"};
            for(int i =  0; i < Nama.length; i++){
                if (Nama[i] == nama){
                    System.out.println("Kamu memanggil : " + Nama[i]);
                    break;
                } 
                
            }
        }
    }
      