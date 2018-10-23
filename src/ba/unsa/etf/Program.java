package ba.unsa.etf;

public class Program {
    public static void main(String[] args) {

        Student s1=new Student("Bakir", "Sabljica",18035);
        Student s2=new Student("Solomon", "Bicakcic", 17022);
        Student s3=new Student("Domagoj", "Vida", 18033);
        Predmet p=new Predmet("RPR", 10, 3);
        try {
            p.upisi(s1);
            p.upisi(s2);
            p.upisi(s3);
            p.ispisStudenata();
            p.ispisi(s3);
            p.ispisStudenata();
        }
            catch (Exception e){
                System.out.println(e.getMessage());

            }
    }
}