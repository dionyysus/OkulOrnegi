package okulornegi;

public class OkulOrnegi {

    
    public static void main(String[] args) {
        Personel mudur = new Personel("mudur","ahmet",432423435,40);
        System.out.println(mudur);
        
        Ogrenci gizem = new Ogrenci(361,"gizem", 3242542, 20);
        System.out.println(gizem);
        
        MezunOgrenci mezun = new MezunOgrenci(12,"irem", 58989564, 19,"istanbul");
        System.out.println(mezun);
    }
    
}
