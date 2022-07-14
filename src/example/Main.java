package example;

import example.model.Bet;
import example.storage.DataBase;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите value & risk через пробел:");
        String str = scanner.nextLine();
        String[] bet = str.split(" ");
        int value = Integer.parseInt(bet[0]);
        double risk = Double.parseDouble(bet[1]);
        Bet user3Bet = new Bet(value,risk);
        DataBase.bets[0]=user3Bet;
    //    System.out.println(user3Bet);
        System.out.println("Выводим bets storage");
        System.out.println(Arrays.toString(DataBase.bets));

    }
}
