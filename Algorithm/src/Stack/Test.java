package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        double computerChoice =  Math.random();
        String choice = "";
        if (computerChoice<=0.25){
            choice = "rock";
        }

        else if (computerChoice<=0.50) {
            choice = "paper";
        }
        else if (computerChoice<=0.75){
            choice= "Tank";
        }
        else{
            choice ="scissors";
        }
        System.out.println(choice+""+computerChoice);
    }
}
