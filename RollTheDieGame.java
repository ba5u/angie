package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {
        int rolls = 5;
        int position = 0;
        for (int i = 0; i < rolls; i++) {

            Random random = new Random();
            int die = random.nextInt(6) + 1;
            position = position + die;
            if (position == 20 && i<rolls) {
                System.out.println("Congrat, you won");
                break;
            } else if (position>20 && i<=rolls){
                System.out.println("You lose");
                break;}
                else if(position <  20 && i==rolls){
                System.out.println("You lose");
                break;}
            else {System.out.println("Roll #"+ (i+1) + ": You 've rolled a "+ die+
                        ". You are on space "+position +" You need another " + (20 - position) + " to win");
            }
                                }
        }

    }