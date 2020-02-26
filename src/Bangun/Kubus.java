package Bangun;
public class Kubus extends Persegi
{
    public Kubus(int sisi)
    {
        super(sisi);
    }
    
    public int hitungVolume()
    {
        return super.hitungLuas()*super.getSisi();
    }
    
    public int hitungLuasPermukaan()
    {
        return super.hitungLuas()*6;
    }
}