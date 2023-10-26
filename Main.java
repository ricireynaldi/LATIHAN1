package modul2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LKBangun3D triD = new LKBangun3D();
        Scanner scan = new Scanner(System.in);

        System.out.println("Selamat datang di aplikasi Penghitung Bangun");
        System.out.println("--------------------------------------------\n");
        
        int menuBangun;
        do{
            System.out.println("Silahkan Pilih Bangun Yang Akan di Hitung");
            System.out.println("1. Bangun 2D\n2. Bangun 3D");
            System.out.print("pilih kamar :" );
            menuBangun = scan.nextInt();    
            if(menuBangun == 1){
                hitung2D();
            }else if(menuBangun == 2){
                hitung3D();
            }else{
                System.out.println("\nInputan Salah\nSilahkan Inputkan Ulang");   
            }
        }while(menuBangun <= 0 || menuBangun >= 3);
    }
    
    static void hitung2D(){
        //Memanggil class di Package modul2.bangun2d
        modul2.bangun2d.persegi persegi = new modul2.bangun2d.persegi();
        modul2.bangun2d.persegiPanjang persegiPanjang = new modul2.bangun2d.persegiPanjang();
        modul2.bangun2d.segitiga segitiga = new modul2.bangun2d.segitiga();
        modul2.bangun2d.lingkaran lingkaran = new modul2.bangun2d.lingkaran();
        modul2.bangun2d.jajarGenjang jajarGenjang = new modul2.bangun2d.jajarGenjang();
        modul2.bangun2d.belahKetupat belahKetupat = new modul2.bangun2d.belahKetupat();
        
        
        Scanner scan = new Scanner(System.in);

        char opr='y';
        do{  
            System.out.println("Menu Menghitung Bangun 2D");
            
            int menuBangun2D;
            do{
                System.out.println("Silahkan Pilih Bangun Yang Akan di Hitung");
                System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajar Genjang\n6. Belah Ketupat\n0. Kembali");
                System.out.print("pilih Jenis Bangun :" );
                menuBangun2D = scan.nextInt();    
                if(menuBangun2D == 0){
                    main(null);
                }else if(menuBangun2D == 1){
                    //menu Persegi
                    persegi.infoBangun();
                }else if(menuBangun2D == 2){
                    //menu Persegi Panjang
                    persegiPanjang.infoBangun();
                }else if(menuBangun2D == 3){
                    //menu Segitiga
                    segitiga.infoBangun();
                }else if(menuBangun2D == 4){
                    //menu Lingkaran
                    lingkaran.infoBangun();
                }else if(menuBangun2D == 5){
                    //menu Jajar Genjang
                    jajarGenjang.infoBangun();
                }else if(menuBangun2D == 6){
                    //menu Belah Ketupat
                    belahKetupat.infoBangun();
                }else{
                    System.out.println("\nInputan Salah\nSilahkan Inputkan Ulang");   
                }
    
            }while(menuBangun2D < 0 || menuBangun2D >= 7);
                
            System.out.print("Apakah anda ingin Menghitung Bangun Lagi?(y/t): ");
            opr = scan.next().charAt(0);    
        }while(opr == 'y' || opr == 'Y');
    }
    
    static void hitung3D(){
        //memanggil class di package modul2.bangun3d
        modul2.bangun3d.balok balok = new modul2.bangun3d.balok();
        modul2.bangun3d.bola bola = new modul2.bangun3d.bola();
        modul2.bangun3d.kerucut kerucut = new modul2.bangun3d.kerucut();
        modul2.bangun3d.kubus kubus = new modul2.bangun3d.kubus();
        modul2.bangun3d.tabung tabung = new modul2.bangun3d.tabung();

        Scanner scan = new Scanner(System.in);
        
        char opr='y';
        //looping untuk kembali ke menu awal
        do{
            
            System.out.println("Menu Menghitung Bangun 3D");
            
            int menuBangun3D;
            //looping untuk apabila inputan tidak sesuai
            do{
                System.out.println("Silahkan Pilih Bangun Yang Akan di Hitung");
                System.out.println("1. Kubus\n2. Balok\n3. Tabung\n4. Bola\n5. Kerucut\n0. Kembali");
                System.out.print("pilih Jenis Bangun :" );
                menuBangun3D = scan.nextInt();    
                if(menuBangun3D == 0){
                    main(null);
                }else if(menuBangun3D == 1){
                    //menu Kubus
                    kubus.infoBangun();
                }else if(menuBangun3D == 2){
                    //menu Balok
                    balok.infoBangun();
                }else if(menuBangun3D == 3){
                    //menu Tabung
                    tabung.infoBangun();
                }else if(menuBangun3D == 4){
                    //menu Bola
                    bola.infoBangun();
                }else if(menuBangun3D == 5){
                    //menu Kerucut
                    kerucut.infoBangun();
                }else{
                    System.out.println("\nInputan Salah\nSilahkan Inputkan Ulang");   
                }
                
            }while(menuBangun3D < 0 || menuBangun3D >= 6);
                
            System.out.print("Apakah anda ingin Menghitung Bangun Lagi?(y/t): ");
            opr = scan.next().charAt(0);    
        }while(opr == 'y' || opr == 'Y');
    }
    
}
