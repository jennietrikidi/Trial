import jdk.jfr.EventFactory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        Shop[]shops=new Shop[4];
        shops[0]=new Shop("dafna",3,4,5);
        shops[1]=new Shop("lori",2,7,2);
        shops[2]=new Shop("moor",1,9,20);
        shops[3]=new Shop("amore",100,200,1);
        createHotel(shops,10,1,0);
    }
    public static void createHotel(Shop[]shops,int banana,int apple,int orange){
        int k=0;
        double small=banana*shops[0].getBanana()+apple*shops[0].getApple()+orange*shops[0].getOrange();;
        double big=0;
        double sum=0;

        for (int i=0;i<shops.length;i++){
            sum=banana*shops[i].getBanana()+apple*shops[i].getApple()+orange*shops[i].getOrange();
            if (sum>big){
                big=sum;
            }else if(small>sum){
                small=sum;
                k=i;
            }
        }
        System.out.println(shops[k]+"  "+small);
    }
}

