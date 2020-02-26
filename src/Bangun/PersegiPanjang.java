package Bangun;
public class PersegiPanjang implements BangunDuaDimensi
{
    private int panjang;
    private int lebar;
    public PersegiPanjang(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public int getPanjang()
    {
        return panjang;
    }
    
    public int getLebar()
    {
        return lebar;
    }
    
    @Override
    public int hitungLuas()
    {
        return panjang*lebar;
    }

    public int hitungKeliling() 
    {
        return 2*(panjang+lebar);
    }
}
