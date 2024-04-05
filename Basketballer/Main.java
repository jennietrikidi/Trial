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
        Basketballer[]basketballers=new Basketballer[3];
        int [] first={8,89,6};
        int [] second={81,89,6};
        int [] third={89,89,68};
        basketballers[0]=new Basketballer("john",first,second,first);
        basketballers[1]=new Basketballer("lily",second,third,second);
        basketballers[2]=new Basketballer("dan",third,third,first);
        System.out.println(basketballers[0]+"\n"+basketballers[1]+"\n"+basketballers[2]);
        String bestPlayer = getMaxTripleDoubler(basketballers);
        System.out.println(bestPlayer);
    }
    public static String getMaxTripleDoubler(Basketballer[]basketballers){
        String bestBasketballer=null;
        int biggestScore=0;
        int placeOfbiggest=0;
        for (int i=0;i<basketballers.length;i++){
            if(basketballers[i].countTriple()>biggestScore){
                biggestScore=basketballers[i].countTriple();
                placeOfbiggest=i;
            }
        }
        return  bestBasketballer =basketballers[placeOfbiggest].getName();
    }

}
