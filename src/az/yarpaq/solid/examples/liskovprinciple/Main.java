package az.yarpaq.solid.examples.liskovprinciple;

public class Main {
    public static void main(String[] args) {
        CatdirilmaServisi servis = new CatdirilmaServisi(new VeloCatdirilma());
        servis.sifarisEt("Narimanov", 3);

        servis.setStrategiya(new MotoCatdirilma());
        servis.sifarisEt("Narimanov", 18);
    }
}
