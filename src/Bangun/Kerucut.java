package Bangun;
public class Kerucut extends Lingkaran
{
    private int tinggi;
    public Kerucut(int r, int tinggi)
    {
        super(r);
        this.tinggi = tinggi;
    }
   
    public double hitungVolume()
    {
        return super.hitungLuas()*this.tinggi/3;
    }
    
    private double getGarisMiring()
    {
        return Math.sqrt(Math.pow(tinggi, 2)+Math.pow(super.getRadius(), 2));
    }
    
    public double hitungLuasPermukaan()
    {
        return super.hitungLuas()+Math.PI*super.getRadius()*this.getGarisMiring();
    }
}
