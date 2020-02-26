package Bangun;
public class LimasPersegi extends Persegi
{
    private int tinggi;
    public LimasPersegi(int sisi, int tinggi)
    {
        super(sisi);
        this.tinggi = tinggi;
    }
    
    public float hitungVolume()
    {
        return super.hitungLuas()*this.tinggi/3;
    }
    
    private double getGarisTengah()
    {
        return Math.sqrt(Math.pow(tinggi, 2)+Math.pow(super.getSisi()/2, 2));
    }
    
    private double hitungSegitiga()
    {
        return getGarisTengah()*super.getSisi()/2;
    }
    
    public double hitungLuasPermukaan()
    {
        return super.hitungLuas()+4*hitungSegitiga();
    }
}