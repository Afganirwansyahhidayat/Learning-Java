public class StudiKasusV1 {
    public static void main(String[] args) {
        // Budi, seorang mahasiswa, baru pertama kali berbelanja di ShopSmart. Ia membeli beberapa alat tulis dan camilan, dengan total belanja Rp300.000. Setelah             selesai, ia terkejut melihat bahwa ia mendapatkan diskon 10%. "Wah, ternyata hemat juga belanja di sini," ujar Budi.

        double totalBelanja = 300000 ;
        double diskon = 10 ;
        double hargaDiskon = totalBelanja * (diskon / 100) ;
        double hargaAkhir = totalBelanja - hargaDiskon ;

        System.out.println("Total Belanjanya Yaitu: " + hargaAkhir);

        System.out.println("------------------------------------");

        // Suatu hari, Bu Nia, pelanggan setia ShopSmart, sedang berbelanja untuk keperluan rumah tangga. Setelah memasukkan barang ke keranjang belanja, total                 belanjaannya mencapai Rp600.000. Bu Nia segera menyelesaikan pesanannya. Saat melihat faktur pembayarannya, ia sangat senang karena mendapatkan diskon 20%!

        double totalBelanjaBuNia = 600000 ;
        double diskonBuNia = 20 ;
        double hargaDiskonBuNia = totalBelanjaBuNia * (diskonBuNia / 100) ;
        double hargaAkhirBuNia = totalBelanjaBuNia - hargaDiskonBuNia ;

        System.out.println("Total Akhir Belanjaan Bu Nia: " + hargaAkhirBuNia);
    }
}
