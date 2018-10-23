package ba.unsa.etf;

public class Predmet {

    private String imePredmeta;
    private int sifraPredmeta;
    private int velicina;
    private int maxBrStudenata;
    private Student [] student;

    public Predmet(String imePredmeta, int sifraPredmeta, int maxBrStudenata){
        this.imePredmeta=imePredmeta;
        this.velicina=0;
        this.sifraPredmeta=sifraPredmeta;
        this.maxBrStudenata=maxBrStudenata;
        student= new Student[maxBrStudenata];
    }

    public String dajImePredmeta() {
        return imePredmeta;
    }

    public void postaviImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int dajSifruPredmeta() {
        return sifraPredmeta;
    }

    public void postaviSifruPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public Predmet upisi(Student s) throws Exception{
        if (velicina>=maxBrStudenata) throw new Exception("Dostignut maksimalan broj studenata");
        else {
            student[velicina] = s;
            velicina++;
        }
            return this;
    }

    public Predmet ispisi(Student s){
        for(int i=0;i<velicina;i++){
            if(s.equals(student[i])){
                for(int j=i; j<velicina-1; j++){
                    student[j]=student[j+1];
                }
                i=velicina;
                velicina--;
            }
        }
        return this;
    }

    public void ispisStudenata(){
        for(int i=0;i<velicina;i++){
            System.out.println(i+". "+ student[i]);
        }
    }
}
