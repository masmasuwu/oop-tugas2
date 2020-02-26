package Bangun;
public class Lingkaran implements BangunDuaDimensi
{
    private int radius;
    public Lingkaran(int r)
    {
        radius = r;
    }
    
    public int getRadius()
    {
        return this.radius;
    }
    
    public int hitungLuas()
    {
        return (int) (Math.PI*Math.pow(radius, 2));
    }
    
    public int hitungKeliling()
    {
        return (int) Math.PI*2*radius;
    }
}
