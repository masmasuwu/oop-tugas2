package Bangun;
public class LimasPersegiPanjang extends PersegiPanjang
{
    private int tinggi;
    public LimasPersegiPanjang(int panjang, int lebar, int tinggi)
    {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public float hitungVolume()
    {
        return super.hitungLuas()*this.tinggi;
    }
    
    private double hitungSegitigaPanjang()
    {
        float garisTengah = (int) Math.sqrt(Math.pow(tinggi, 2)+Math.pow(super.getPanjang()/2, 2));
        float luasSegitiga = super.getLebar()*garisTengah/2;
        return luasSegitiga;
    }
    
    private double hitungSegitigaLebar()
    {
        float garisTengah = (int) Math.sqrt(Math.pow(tinggi, 2)+Math.pow(super.getLebar()/2, 2));
        float luasSegitiga = super.getPanjang()*garisTengah/2;
        return luasSegitiga;
    }
    
    public double hitungLuasPermukaan()
    {
        return super.hitungLuas()+2*hitungSegitigaPanjang()+2*hitungSegitigaLebar();
    }
}