package org.example;

import java.util.Random;
import java.util.Scanner;
public class Test {
    Random rand;
    int x;
    int y;
    int sum;
    int vid1;
    int vid2;
    int vid3;
    int pravdaVid;
    boolean pravda;
    Scanner scanner;
    int sumPlayer;
    int r;
    public Test(){
        this.rand = new Random();
        this.x = rand.nextInt(9)+1;
        this.y = rand.nextInt(9)+1;
        this.sum = this.x * this.y;
        this.vid1 = rand.nextInt(72) + 10;
        this.vid2 = rand.nextInt(72) + 10;
        this.vid3 = rand.nextInt(72) + 10;
        pravda = false;
        scanner = new Scanner(System.in);
        pravdaVid = 0;
        r = rand.nextInt(3) + 1;

    }
    public void  ShowVidpovid(int v, int p){
        System.out.println(p + ". " + v);
        if(v == sum){
            pravdaVid = p;
        }
    }
    public void ShowTest(){
        System.out.println(x + " * " + y);
        if(r == 1){
            ShowVidpovid(sum,1);
            ShowVidpovid(vid1,2);
            ShowVidpovid(vid2,3);
            ShowVidpovid(vid3,4);
        }
        if(r == 2){
            ShowVidpovid(vid1,1);
            ShowVidpovid(vid3,2);
            ShowVidpovid(sum,3);
            ShowVidpovid(vid2,4);
        }
        if(r == 3){
            ShowVidpovid(vid3,1);
            ShowVidpovid(sum,2);
            ShowVidpovid(vid2,3);
            ShowVidpovid(vid1,4);
        }
        if(r == 4){
            ShowVidpovid(vid2,1);
            ShowVidpovid(vid1,2);
            ShowVidpovid(vid3,3);
            ShowVidpovid(sum,4);
        }
        System.out.println("Введiть варiант вiдповiдi");
        sumPlayer = scanner.nextInt();
        if(pravdaVid == sumPlayer){
            pravda = true;
        }
        System.out.println("-----------------------------------");

    }
    public void ShowPravdaVid(){
        System.out.println("====================================");

        System.out.println(x + " * " + y);
        if(r == 1){
            ShowVidpovid(sum,1);
            ShowVidpovid(vid1,2);
            ShowVidpovid(vid2,3);
            ShowVidpovid(vid3,4);
        }
        if(r == 2){
            ShowVidpovid(vid1,1);
            ShowVidpovid(vid3,2);
            ShowVidpovid(sum,3);
            ShowVidpovid(vid2,4);
        }
        if(r == 3){
            ShowVidpovid(vid3,1);
            ShowVidpovid(sum,2);
            ShowVidpovid(vid2,3);
            ShowVidpovid(vid1,4);
        }
        if(r == 4){
            ShowVidpovid(vid2,1);
            ShowVidpovid(vid1,2);
            ShowVidpovid(vid3,3);
            ShowVidpovid(sum,4);
        }

        System.out.println("Ви вибрали " + sumPlayer);
        if(pravda){
            System.out.println("Відповідь правильна");
        } else {
            System.out.println("Відповідь не правильна");
        }

    }
}
