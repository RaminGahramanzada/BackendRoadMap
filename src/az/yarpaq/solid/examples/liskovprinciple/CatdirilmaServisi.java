package az.yarpaq.solid.examples.liskovprinciple;

public class CatdirilmaServisi {
    private CatdirilmaStrategiyasi strategiya;

    public CatdirilmaServisi(CatdirilmaStrategiyasi strategiya) {
        this.strategiya = strategiya;
    }

    public void setStrategiya(CatdirilmaStrategiyasi strategiya) {
        this.strategiya = strategiya;
    }

    public void sifarisEt(String adress, double agirliq){
        strategiya.catdir(adress,agirliq);
    }
}
