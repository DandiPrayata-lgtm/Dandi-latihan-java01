import java.util.Scanner;
public class DataDiri {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print ("Siapa nama kamu? ");
        String nama = s.nextLine ();

        System.out.print ("Berapa umur kamu? ");
        int umur = s.nextInt ();

        System.out.print ("Dari angkatan berapa kamu? ");
        int angkatan = s.nextInt ();
        s.nextLine();

        System.out.print ("Apa prodi kamu? ");
        String prodi = s.nextLine ();

        System.out.println ( "Hallo saya " + nama + " umur saya "
         + umur + " saya dari angkatan " + angkatan + " prodi saya " + prodi);

         if (umur > 18){
            System.out.println("Umur tergolong : Dewasa");
        } else{
            System.out.println("Umur tergolong : Muda");
        }
        if (umur > 22 && angkatan > 2025){
            System.out.println("Mahasiswa: In Danger");
        } else{
            System.out.println("Mahasiswa: Aman");
        } 
    }
}
