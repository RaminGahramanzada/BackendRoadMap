package az.yarpaq.solid.examples.liskovprinciple;

public class VeloCatdirilma implements CatdirilmaStrategiyasi{
    @Override
    public void catdir(String adress, double agirliq) {
        if(agirliq>5){
            System.out.println("Velo bu paketi dasiya bilmez");
        }else{
            System.out.println("Catdirildi: "+adress);
        }
    }
}
