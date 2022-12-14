package ba.unsa.etf.rpr;

import java.util.ArrayList;

public interface LaptopDao {
    public void dodajLaptopUListu(Laptop laptop);
    public void dodajLaptopUFile(Laptop laptop);
    public Laptop getLaptop(String procesor);
    void napuniListu(ArrayList<Laptop> laptopi);
    void vratiPodatkeIzDatoteke();
}
