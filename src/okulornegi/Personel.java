package okulornegi;


public class Personel extends Kisi{
    private String pozisyon;

    public Personel(String pozisyon, String isim, long tcKimlik, int yas) {
        super(isim, tcKimlik, yas);
        this.pozisyon = pozisyon;
    }
    
    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "Adi: " + getIsim() + " Yas: " + getYas() + " TC Kimlik: " + getTcKimlik() + "Pozisyon" + getPozisyon();
    }
    
    
}

