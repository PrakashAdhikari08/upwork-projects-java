package arvin;

import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {

        int numberOfEnemies = 0;
        int numberOFSoldiers = 0;
        int numberOfAllies = 0;
        int levelOfHealth = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the number of Enemies: ");
        numberOfEnemies = sc.nextInt();

        System.out.print("Please Enter the number of Soldiers: ");
        numberOFSoldiers = sc.nextInt();

        System.out.print("Please Enter the number of Allies: ");
        numberOfAllies = sc.nextInt();

        System.out.print("Please Enter the level of Health: ");
        levelOfHealth = sc.nextInt();

        GamePlayer g1 = new Fighter();
        communicate(g1);


    }

    public static void communicate(GamePlayer player){
        System.out.println(player.getClass().getTypeName());

    }
}
