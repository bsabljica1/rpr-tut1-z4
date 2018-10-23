package ba.unsa.etf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void ProvjeraDajIme () {
        assertEquals("Bakir", new Student ("Bakir", "Sabljica",18035).dajIme());
    }

    @Test
    void ProvjeraDajPrezime () {
        Student s=new Student ("Bakir", "Sabljica",18035);
        s.postaviPrezime("BLA");
        assertEquals("BLA", s.dajPrezime());
    }

    @Test
    void ProvjeraIspisStudenta () {
        Student s=new Student ("Bakir", "Sabljica",18035);
        assertEquals("Sabljica Bakir (18035)", s.toString());
    }

}