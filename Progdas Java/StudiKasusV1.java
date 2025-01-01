public class StudiKasusV1 {
    public static void main(String[] args) {
        // Budi, seorang mahasiswa, baru pertama kali berbelanja di ShopSmart. Ia membeli beberapa alat tulis dan camilan, dengan total belanja Rp300.000. Setelah selesai, ia terkejut melihat bahwa ia mendapatkan diskon 10%. "Wah, ternyata hemat juga belanja di sini," ujar Budi.

        double totalBelanja = 300000 ;
        double diskon = 10 ;
        double hargaDiskon = totalBelanja * (diskon / 100) ;
        double hargaAkhir = totalBelanja - hargaDiskon ;

        System.out.println("Total Belanjanya Yaitu: " + hargaAkhir);

        System.out.println("------------------------------------");

        // Suatu hari, Bu Nia, pelanggan setia ShopSmart, sedang berbelanja untuk keperluan rumah tangga. Setelah memasukkan barang ke keranjang belanja, total belanjaannya mencapai Rp600.000. Bu Nia segera menyelesaikan pesanannya. Saat melihat faktur pembayarannya, ia sangat senang karena mendapatkan diskon 20%!

        double totalBelanjaBuNia = 600000 ;
        double diskonBuNia = 20 ;
        double hargaDiskonBuNia = totalBelanjaBuNia * (diskonBuNia / 100) ;
        double hargaAkhirBuNia = totalBelanjaBuNia - hargaDiskonBuNia ;

        System.out.println("Total Akhir Belanjaan Bu Nia: " + hargaAkhirBuNia);

        System.out.println("------------------------------------------------");

        //  Bu Tika, Pelanggan Setia Bu Tika, seorang pekerja kantoran, memarkir mobilnya di Megapark dari pagi hingga malam, total 12 jam. Saat ia memeriksa tarif parkir, mesin menunjukkan bahwa biaya maksimal telah tercapai:
        // Jam pertama: Rp5.000.
        // 11 jam tambahan: Rp3.000 x 11 = Rp33.000.
        // Namun, karena biaya parkir harian dibatasi, total biaya yang ia bayar hanyalah Rp20.000.

        double totalJam = 12;
        double jamPertama  = 5000;
        double jamTambahan = (totalJam - 1) * 3000;
        double totalBayar = jamPertama + jamTambahan;
        double batasBiayaHArian = 20000 ;

        if (totalBayar > batasBiayaHArian) {
            System.out.println("Total Biaya Parkir yang kamu Rp: " + batasBiayaHArian);
        } else {
            System.out.println("Total Biaya Parkir yang kamu Rp: " + totalBayar);
        }
    }
}
