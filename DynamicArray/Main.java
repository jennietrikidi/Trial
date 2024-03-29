import jdk.jfr.EventFactory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        DynamicArray arr = new DynamicArray();
        arr.growArr(3);
        arr.add(6);
        arr.add(8);
        arr.add(90);
        arr.get(0);
        System.out.println(arr);
    }
}