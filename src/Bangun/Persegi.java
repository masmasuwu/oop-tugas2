package Bangun;
public class Persegi implements BangunDuaDimensi
{
    private int sisi;
    public Persegi(int sisi)
    {
        this.sisi = sisi;
    }
    
    public int getSisi()
    {
        return sisi;
    }
    
    @Override
    public int hitungLuas()
    {
        return sisi*sisi;
    }

    public int hitungKeliling() 
    {
        return sisi*4;
    }
}
