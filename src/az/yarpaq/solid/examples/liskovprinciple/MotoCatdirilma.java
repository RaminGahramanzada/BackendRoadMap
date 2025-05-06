package az.yarpaq.solid.examples.liskovprinciple;

public class MotoCatdirilma implements CatdirilmaStrategiyasi {

    @Override
    public void catdir(String adress, double agirliq) {
        if(agirliq>20){
            System.out.println("Moto bu paketi dasiya bilmez!");
        }else{
            System.out.println("Catdirildi: "+adress);
        }
    }
}
