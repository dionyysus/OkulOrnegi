package okulornegi;


public class Ogrenci extends Kisi{
    
    private int okulNo;

    public Ogrenci(int okulNo, String isim, long tcKimlik, int yas) {
        super(isim, tcKimlik, yas);
        this.okulNo = okulNo;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    @Override
    public String toString() {
        return "Ogrenci adi: " + getIsim() + " TC NO: " + getTcKimlik() + " Yas: "+ getYas()+ " Okul no: " + getOkulNo();
    }

    
    
  
}
