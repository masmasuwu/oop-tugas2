package Bangun;
public class Balok extends PersegiPanjang
{
    private int tinggi;
    public Balok(int panjang, int lebar, int tinggi) 
    {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public double hitungVolume()
    {
        return super.getPanjang()*super.getLebar()*tinggi;
    }
    
    public double hitungLuasPermukaan()
    {
        return 2*super.hitungLuas() + 2*(super.getPanjang()+this.tinggi) + 2*(super.getLebar()+this.tinggi); 
    }
    
}