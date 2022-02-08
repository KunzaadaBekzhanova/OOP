package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        At at1 = new At("Jenny",5,30);
        At at2 = new At("Enny",9,32);

        At[] attar = {at1,at2};

        Ui ui1 = new Ui("Katya",1,19);
        Ui ui2 = new Ui("Jenya",6,12);
        Ui ui3 = new Ui("Masha",10,6);
        Ui ui4 = new Ui("Olya",13,30);
        Ui ui5 = new Ui("Inna",7,14);

        Ui[] uilar = {ui1,ui2,ui3,ui4,ui5};

        Koi koi1 = new Koi("Ash",3,25);
        Koi koi2 = new Koi("Daili",9,17);
        Koi koi3 = new Koi("Mini",2,19);
        Koi koi4 = new Koi("Aza",4,17);
        Koi koi5 = new Koi("Moon",15,24);
        Koi koi6 = new Koi("Sisiliya",2,12);
        Koi koi7 = new Koi("Bembi",3,15);
        Koi koi8 = new Koi("Lil",6,36);

        Koi[] koilor = {koi1,koi2,koi3,koi4,koi5,koi6,koi7};



        Jailoo jailoo1 = new Jailoo("Kara-Shoro","Jalalabad","Janybek",uilar,koilor,attar);
        System.out.println("Bizdin fermaga kosh keldiniz!");
        System.out.println("------------***------------");
        System.out.println("Fermabyzdyn aty: "+jailoo1.getJailo()+". Daregibiz: "+jailoo1.getAdress()+". Mykty chabanybyzdyn aty: "+jailoo1.getChaban());
        System.out.println("Anan bizdin fermada: "+uilar.length+" ui, "+koilor.length+" koi, "+attar.length+" bar.\nAlardayn attary:");
        System.out.println("Krasavitsa uilarybyz jonundo maalymat:");
        for (Ui a: jailoo1.getUilar()) {
            System.out.print(a.getName()+", "+a.getAge()+" jashta, "+a.getWeight()+"kg.\n");
        }
        System.out.println("Umnitsa koilorubuz jonundo maalymat:");
        for (Koi b: jailoo1.getKoilor()) {
            System.out.print(b.getName()+", "+b.getAge()+" jashta, "+b.getWeight()+"kg.\n");
        }
        System.out.println("Mykty attarybyz jonundo maalymat:");
        for (At c: jailoo1.getAttar()) {
            System.out.print(c.getName()+", "+c.getAge()+" jashta, "+c.getWeight()+"kg.\n");
        }
        System.out.println("Bizdin jailoogo kelgeniniz uchun chon rahmat! \nJanybarlarybyz abdan kubanychta!!!");


        Jailoo jailoo2 = new Jailoo();

    }
}
