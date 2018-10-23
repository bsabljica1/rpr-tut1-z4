package ba.unsa.etf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void ProvjeraDajIme () {
        assertEquals("Biologija", new Predmet ("Biologija", 18,30).dajImePredmeta());
    }

    @Test
    void ProvjeraDajSifru () {
        assertEquals(18, new Predmet ("Biologija", 18,30).dajSifruPredmeta());
    }

    @Test
    void ProvjeriMaxBrojStudenata() {
        assertThrows(Exception.class,()->{
            Predmet p =new Predmet("RPR", 2017, 1);
            Student s1=new Student("Mehmed","Mehic",11111);
            Student s2=new Student ("Domagoj","Vida",22222);
            p.upisi(s1);
            p.upisi(s2);
        });
    }
    }