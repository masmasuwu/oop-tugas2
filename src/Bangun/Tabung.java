package Bangun;
public class Tabung extends Lingkaran
{
    private int tinggi;
    public Tabung(int r, int tinggi)
    {
        super(r);
        this.tinggi = tinggi;
    }
   
    public double hitungVolume()
    {
        return super.hitungLuas()*this.tinggi;
    }
    
    public double hitungLuasPermukaan()
    {
        return super.hitungKeliling()*this.tinggi;
    }
}
