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
        int year=0;
        Candidate[] candidate = new Candidate[340000];
        Candidate bestM = new Candidate();
        Candidate bestW=new Candidate();
        Candidate worst = new Candidate();
        for (int i=0;i< candidate.length;i++){
            int avarage = random.nextInt(0,101);
            if(avarage==0) {
                year = random.nextInt(0,10);
            }
            int sallary = random.nextInt(3000,35000);
            int lang = random.nextInt(0,4);
            candidate[i]=new Candidate(avarage,lang,sallary,year);
            candidate[i].suitableApplicants();
            System.out.println(candidate[i]);
        }
        bestW=mostSuitable(candidate,1);
        bestM=mostSuitable(candidate,2);
        worst=mostSuitable(candidate,0);
        System.out.println(bestM+"  "+bestW+"  "+worst);
    }

    public static Candidate mostSuitable(Candidate[]candidates,int type){
        int best=0;
        int highest=1000000;
        Candidate bestC = new Candidate();
        for (int i=0;i<candidates.length;i++) {
            if(candidates[i].suitableApplicants()==type){
                if (candidates[i].getAverage() > best) {
                    best = candidates[i].getAverage();
                    bestC=candidates[i];
                }}
            else if(candidates[i].suitableApplicants()==type){
                if (candidates[i].getYearExpirience() > best) {
                    best = candidates[i].getYearExpirience();
                    bestC=candidates[i];
                } }else if(candidates[i].suitableApplicants()==type) {
                if (candidates[i].getPaymentExpectation()<=highest){
                    highest=candidates[i].getPaymentExpectation();
                    bestC=candidates[i];
                }
            }
        }
        return bestC;
    }
}

