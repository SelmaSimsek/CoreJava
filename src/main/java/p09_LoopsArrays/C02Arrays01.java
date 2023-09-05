package p09_LoopsArrays;

import java.util.Arrays;

public class C02Arrays01 {
    public static void main(String[] args) {

        int a = 13;

        // Arrayler coklu data saklamaya izin verirler. kac data saklanacagi önceden belirtilmek zorundadir.
        //Array nasil olusturulur?
        String stdNames [] = new String[5]; //memory de, default degeri olarak null olusur.

        //Arayy ler console'a nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]
        //toString methodu kullanilmadan sadece array ismi ile yazdirilirsa, java o Array in adresini yazdirir.

        //Array e eleman ekleme nasil yapilir?
        stdNames [2] = "Alperen";
        stdNames [4] = "Cemil";
        stdNames [3] = "Tuba";
        stdNames [1] = "Ahmet";
        stdNames [0] = "Selma";
        System.out.println(Arrays.toString(stdNames));

        //Array den spesific bir elemani almak?
        System.out.println(stdNames[2]); //Alperen

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.


        //Arraylar ayni anda tek tip data tutabilirler
        //Not stringlerde kullandigimiz lenght() methoddur
        // Arayler de kullandigimiz lenght variabledir.
        String cities [] = new String[5];
        cities[0]="Miami";
        cities[1]="Sivas";
        cities[2]="Yozgat";
        cities[3]="Ankara";
        cities[4]="Bursa";

        //1.yol
        int totalChar = 0;
        for (int i = 0; i<cities.length ; i++) {

            totalChar = totalChar + cities[i].length();

        }
        System.out.println(totalChar);

        //2.yol   for-each loop (enhanced loop)
        // collection larla Arrayler ile kullanilir

        int sum = 0;

        for (String w :cities) {
            sum = sum + w.length();

        }
        System.out.println(sum);









    }
}
