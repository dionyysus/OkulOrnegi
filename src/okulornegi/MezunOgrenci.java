package okulornegi;


public class MezunOgrenci extends Ogrenci{
    private String calismaYeri;

    public MezunOgrenci(int okulNo, String isim, long tcKimlik, int yas,String calismaYeri){
        super(okulNo, isim, tcKimlik, yas);
        this.calismaYeri = calismaYeri;
    }

    public String getCalismaYeri() {
        return calismaYeri;
    }

    public void setCalismaYeri(String calismaYeri) {
        this.calismaYeri = calismaYeri;
    }
    
}
