package program;

public class Main {
    //psvn
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Giraffe g1 = new Giraffe("Giraffe1");
        Giraffe g2 = new Giraffe("Giraffe2");

        zoo.Add(g1);
        zoo.Add(g2);

        zoo.feedAllAnimals();
    }
}
