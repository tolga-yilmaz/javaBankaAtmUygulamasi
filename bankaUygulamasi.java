package bankaUygulamasi;

import java.util.Scanner;

public class bankaUygulamasi {

    static Scanner sc = new Scanner(System.in);

    static int hesaptakiPara = 0;

    public static void main(String[] args) {

        String adSoyad;
        adSoyad = adSoyadAl();
        int secenek;

        do {

            menu(adSoyad);

            secenek = secenekAl();

            if (secenek == 4) {

                break;
            }

            secenekKontrol(secenek);
            menuYonlendir();
        } while (secenek != 4);

    }

    public static void secenekKontrol(int secenek) {

        if (secenek == 1) {
            paraYatir();
        } else if (secenek == 2) {
            paraCekme();
        } else if (secenek == 3) {
            bakiyeSorgulama();
        } else if (secenek == 4) {
            cikis();
        } else {
            System.out.println("Yanlış bir seçenek seçtiniz. lütfen tekrar deneyiniz.");
        }
    }

    public static void paraYatir() {
        int yatirilanPara;

        System.out.println("Para yatırmayı seçtiniz. Bakiyeniz: " + hesaptakiPara);
        do {
            System.out.print("Yatırmak istediğiniz miktar: ");
            yatirilanPara = sc.nextInt();

            if (yatirilanPara < 0) {
                System.out.println("Yanlış değer girdiniz. Tekrar deneyin.");
            }

            System.out.println();
        } while (yatirilanPara < 0);

        hesaptakiPara = hesaptakiPara + yatirilanPara;
        System.out.println("Para yatırma işleminiz gerçekleşti. Şuan ki bakiyeniz" + hesaptakiPara);

    }

    public static void paraCekme() {

        int cekilenPara;
        System.out.println("Para çekmeyi seçtiniz. Hesabınızdaki para: " + hesaptakiPara);

        do {
            System.out.print("Çekmek istediğiniz tutar: ");
            cekilenPara = sc.nextInt();

            if (cekilenPara > hesaptakiPara) {
                System.out.println("Hesabınızda olmayan miktarda rakam girdiniz. Lütfen tekrar deneyiniz. ");
            }
        } while (cekilenPara > hesaptakiPara);

        hesaptakiPara = hesaptakiPara - cekilenPara;

        System.out.println("Para çektikten sonraki bakiyeniz: " + hesaptakiPara);

    }

    public static void bakiyeSorgulama() {

        System.out.println("Hesabınızdaki miktar: " + hesaptakiPara);

    }

    public static void cikis() {

        System.out.println("Çıkış yapılıyor. İyi günler");
    }

    public static String adSoyadAl() {

        String ad;
        String soyad;
        System.out.print("hoşgeldiniz, lütfen ilerlemek için");
        System.out.print("adınızı giriniz : ");
        ad = sc.next();

        System.out.print("soyadınızı giriniz: ");
        soyad = sc.next();

        System.out.println();

        return ad + " " + soyad;

    }

    public static void menu(String adSoyad) {

        System.out.println("Hoşgeldin " + adSoyad);
        System.out.println("*MENU*");
        System.out.println("1 Para yatırma");
        System.out.println("2 Para çekme");
        System.out.println("3 Bakiye Sorgulama\n4 Çıkış");

        System.out.println();

    }

    public static int secenekAl() {

        System.out.print("Bir seçenek giriniz: ");
        int secenek = sc.nextInt();
        System.out.println();

        return secenek;

    }

    public static void menuYonlendir() {

        System.out.println("\n Menüye yönlendiriyorsunuz...\n");
    }

}
