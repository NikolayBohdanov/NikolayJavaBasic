package homeWork11;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Hi, please input value of your bet and risk coefficient:");
        System.out.println("Bet value: ");
        int a = user.nextInt();
        System.out.println("Risk value: ");
        double b = user.nextDouble();
        Bet userBet = new Bet();
        userBet.setBet(a);
        userBet.setRisk(b);
        System.out.println("Your bet value: " + userBet.getBet());
        System.out.println("Your bet value: " + userBet.getRisk());
        user.close();
    }
}

class Bet {
    private int bet;
    private double risk;

    public Bet() {
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public int getBet() {
        return bet;
    }

    public double getRisk() {
        return risk;
    }
}