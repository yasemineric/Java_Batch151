package LAMBDA.day03;

public class Universite {// universite pojo class olusturduk
    private String name;
    private String bolumAdi;
    private int ogrenciSayisi;
    private int notOrtalaamsi;

    public Universite() {// Asagida parametreli bir constructor olusturunca default cons. öldü,
        // bizde elimizle parametresiz bir cons. üretiyoruz
    }

    public Universite(String name, String bolumAdi, int ogrenciSayisi, int notOrtalaamsi) {
        this.name = name;
        this.bolumAdi = bolumAdi;
        this.ogrenciSayisi = ogrenciSayisi;
        this.notOrtalaamsi = notOrtalaamsi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBolumAdi() {
        return bolumAdi;
    }

    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public int getNotOrtalaamsi() {
        return notOrtalaamsi;
    }

    public void setNotOrtalaamsi(int notOrtalaamsi) {
        this.notOrtalaamsi = notOrtalaamsi;
    }

    @Override// sag klick, toString yapip hepspni secince override etti
    public String toString() {
        return "Universite{" +
                "name='" + name + '\'' +
                ", bolumAdi='" + bolumAdi + '\'' +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", notOrtalaamsi=" + notOrtalaamsi +
                '}';
    }
}
