import java.util.Arrays;

public class Triangle {
    private int[]triangleDegree=new int[3];

    public Triangle(int[]triangleDegree){
        this.triangleDegree[0]=triangleDegree[0];
        this.triangleDegree[1]=triangleDegree[1];
        this.triangleDegree[2]=180-triangleDegree[0]-triangleDegree[1];
    }


    public int[] getTriangleDegree() {
        return triangleDegree;
    }

    public void setTriangleDegree(int[] triangleDegree) {
        int sum=0;
        for (int i=0;i< triangleDegree.length;i++){
            sum=sum+triangleDegree[i];
        }
        if(sum==180){
            this.triangleDegree = triangleDegree;
        }
    }
    public int type(int[]triangleDegree){
        int type=0;
        for (int i=0;i<triangleDegree.length;i++){
            if(triangleDegree[i]==90){
                type=2;
                break;
            }else if(triangleDegree[i]<90){
                type=1;
            }else {
                type=3;
                break;
            }

        }
        return type;
    }
    public int specialType(int[]triangleDegree){
        int specialType=0;
        for (int i=0;i<triangleDegree.length-1;i++){
            for (int j=i+1;j<triangleDegree.length;j++){
                if(triangleDegree[i]==triangleDegree[j]&&triangleDegree[i]==60){
                    specialType=2;
                    break;
                }else if(triangleDegree[i]==triangleDegree[j]&&triangleDegree[i]!=45&&triangleDegree[i]!=60){
                    specialType=1;
                    break;
                }else if(triangleDegree[i]==triangleDegree[j]&&triangleDegree[i]+triangleDegree[j]==90){
                    specialType=3;
                    break;
                }
            }}
        return specialType;
    }

    @Override
    public String toString() {
        return "triangleDegree: " + Arrays.toString(triangleDegree) +
                "\n"+"type"+type(triangleDegree)+"\n"+specialType(triangleDegree);
    }
}
