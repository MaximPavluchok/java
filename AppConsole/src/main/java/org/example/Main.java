package org.example;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(9)+1;
        List<Test> test = new ArrayList<>();
        for(int i = 0; i < x;i++){
            test.add(new Test());
        }
        for (Test item : test) {
            item.ShowTest();
        }
        for (Test item : test) {
            item.ShowPravdaVid();
        }

    }
}
