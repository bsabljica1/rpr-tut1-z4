package ba.unsa.etf;

public class Student {

    private String ime, prezime;
    private int brojIndeksa;

    public Student(String ime, String prezime, int brojIndeksa){
        this.ime=ime; this.prezime=prezime; this.brojIndeksa=brojIndeksa;
    }

    public String dajIme() {
        return ime;
    }

    public void postaviIme(String ime) {
        this.ime = ime;
    }

    public String dajPrezime() {
        return prezime;
    }

    public void postaviPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int dajBrojIndeksa() {
        return brojIndeksa;
    }

    public void postaviBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    @Override
    public String toString(){ return prezime +" "+ ime + " ("+brojIndeksa+")";}
}