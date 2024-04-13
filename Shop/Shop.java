public class Shop {
    private String name;
    private double banana;
    private double apple;
    private double orange;
    public Shop(){
        this.name=null;
        this.banana=0;
        this.apple=0;
        this.orange=0;
    }
    public Shop(String name, double banana,double apple, double orange){
        this.name=name;
        this.banana=banana;
        this.apple=apple;
        this.orange=orange;
    }
public void setData(String name, double banana,double apple, double orange){
    this.name=name;
    this.banana=banana;
    this.apple=apple;
    this.orange=orange;
    }
    public double getOrange() {
        return orange;
    }

    public double getApple() {
        return apple;
    }

    public double getBanana() {
        return banana;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", banana=" + banana +
                ", apple=" + apple +
                ", orange=" + orange +
                '}';
    }
}
