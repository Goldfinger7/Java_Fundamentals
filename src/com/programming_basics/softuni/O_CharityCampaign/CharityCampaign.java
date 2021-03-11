package com.programming_basics.softuni.O_CharityCampaign;

import java.util.Scanner;

public class CharityCampaign {
    private static final double CAKEPRICE = 45.00;
    private static final double WAFFLEPRICE = 5.80;
    private static final double PANCAKEPRICE = 3.20;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int runningDays = Integer.parseInt(scanner.nextLine());
        int cakeBosses = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());


        double cakeMoney = cakes * CAKEPRICE;
        double waffleMoney = waffles * WAFFLEPRICE;
        double pancakeMoney = pancakes * PANCAKEPRICE;
        double moneyPerDay = (cakeMoney + waffleMoney + pancakeMoney) * cakeBosses;
        double moneyForTheCampaign = moneyPerDay * runningDays;
        double raisedMoney = moneyForTheCampaign - (moneyForTheCampaign / 8);

        System.out.printf("%.2f", raisedMoney);
    }
}
