import java.util.Arrays;

public class Basketballer {
    private String name;
    private int[]points;
    private int[] rebounds;
    private int[]assists;
    public Basketballer(String name,int[]points,int[]rebounds,int[]assists){
        this.name=name;
        this.points=points;
        this.rebounds=rebounds;
        this.assists=assists;
    }
    public int[] getAssists() {
        return assists;
    }
    public void setAssists(int[] assists) {
        this.assists = assists;
    }

    public int[] getRebounds() {
        return rebounds;
    }

    public void setRebounds(int[] rebounds) {
        this.rebounds = rebounds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getPoints() {
        return points;
    }

    public void setPoints(int[] points) {
        this.points = points;
    }
    public int countDoubles(){
        int count=0;
        for (int i=0;i< points.length;i++){
            if(points[i]>9&&rebounds[i]>9&&assists[i]<10){
                count++;
            }else if(points[i]>9&&assists[i]>9&&rebounds[i]<10){
                count++;
            }else if(assists[i]>9&&rebounds[i]>9&&points[i]<10){
                count++;
            }
        }
        return count;
    }
    public int countTriple(){
        int count=0;
        for (int i=0;i< points.length;i++){
            if(points[i]>9&&rebounds[i]>9&&assists[i]>9){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Basketballer{" +
                "name='" + name + '\'' +
                ", points=" + Arrays.toString(points) +
                ", rebounds=" + Arrays.toString(rebounds) +
                ", assists=" + Arrays.toString(assists) +
                '}';
    }
}

