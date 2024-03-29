import jdk.jfr.EventFactory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[]num ={30,30,20};
        Triangle triangle=new Triangle(num);
        System.out.println(triangle.toString());
    }
}