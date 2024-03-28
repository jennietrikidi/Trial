import jdk.jfr.EventFactory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Actor bestActor = new Actor();
        int age=0;
        int acts=0;
        String name =null;
        Actor[]actors=createActors(name,age,acts);
        printActors(actors);
        Act act = new Act("the baluze",180,actors,2);
        Actor[]actorsAccepted = acceptedToAct(actors,act.getLevel());
        printActors(actorsAccepted);

        for (int i=0;i<actors.length;i++){
            if(actors[i].getActs()> bestActor.getActs()){
                bestActor=actors[i];
            }
        }
        System.out.println(bestActor);
    }























    public static void printActors(Actor[]actors){
        for (int i=0;i< actors.length;i++){
            System.out.println(actors[i]);
            System.out.println("------------------------------");
        }
    }
    public static Actor[] createActors(String name,int age,int acts){
        Actor[]actors=new Actor[10];
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i< actors.length;i++){
            name=input.nextLine();
            age=scanner.nextInt();
            acts=scanner.nextInt();
            actors[i]=new Actor(name,age,acts);
        }
        return actors;
    }
    public static Actor[] acceptedToAct(Actor[]actors, int level){
        int count=0;
        for (int i=0;i<actors.length;i++) {
            if (level == 1) {
                if(actors[i].getAge()>15&&actors[i].getActs()>2){
                    count++;
                }
            } else if (level == 2) {
                if(actors[i].getAge()>24&&actors[i].getActs()>4){
                    count++;
                }
            } else {
                count=actors.length;
            }
        }
        Actor[]actorsAccepted = new Actor[count];
        int j=0;
        for (int i=0;i<actors.length;i++) {
            if (level == 1) {
                if(actors[i].getAge()>15&&actors[i].getActs()>2){
                    actorsAccepted[j]=actors[i];
                    j++;
                }
            } else if (level == 2) {
                if(actors[i].getAge()>24&&actors[i].getActs()>4){
                    actorsAccepted[j]=actors[i];
                    j++;
                }
            } else {
                actorsAccepted[i]=actors[i];
            }
        }
        return actorsAccepted;
    }
}