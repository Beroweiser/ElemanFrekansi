import java.util.Arrays;

public class Frekans {
    static boolean isRepetition(int[] arr, int value) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                a++;
                if (a > 1)
                    return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] dizi = { 10, 20, 20, 10, 10, 20, 5, 20 };
        int[] list = new int[dizi.length];
        System.out.println(Arrays.toString(dizi));

        System.out.println("Tekrar Sayıları");
        int sayac = 0;

        for (int i = 0; i < dizi.length; i++) {
            sayac = 0;
            for (int j = i; j < dizi.length; j++) {
                list[i] = dizi[i];
                // isRepetition metodu tekrar eden sayı ise true veriyor Yani
                // tekrar eden sayılar sadece bir defa if e girebilir
                if (!isRepetition(list, list[i])) {
                    if (dizi[i] == dizi[j]) {
                        sayac++;
                        // sayac kac tekrar oldugunu veriyor
                    }
                }
            }
            //sayacagirmedi sayac 0 ise tekrar var ve if lere girmez ve aynı seyi tekrar yazdırmaz.
            if (sayac != 0)
                System.out.println(dizi[i] + " sayısı " + sayac + " keretekrar edildi.");
        }
    }
}
