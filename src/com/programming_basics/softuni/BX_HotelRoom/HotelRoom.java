package com.programming_basics.softuni.BX_HotelRoom;

import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double priceStudioPerNight = 0.00;
        double priceApartmentPerNight = 0.00;
        double totalPriceStudio = 0.00;
        double totalPriceApartment = 0.00;

        switch (month) {
            case "May":
            case "October":
                priceStudioPerNight = 50.00;
                totalPriceStudio = days * priceStudioPerNight;

                if (days > 14) {
                    totalPriceStudio -= ((totalPriceStudio * 30) / 100);
                } else if (days > 7) {
                    totalPriceStudio -= ((totalPriceStudio * 5) / 100);
                }

                priceApartmentPerNight = 65.00;
                totalPriceApartment = days * priceApartmentPerNight;
                break;
            case "June":
            case "September":
                priceStudioPerNight = 75.20;
                totalPriceStudio = days * priceStudioPerNight;

                if (days > 14) {
                    totalPriceStudio -= ((totalPriceStudio * 20) / 100);
                }

                priceApartmentPerNight = 68.70;
                totalPriceApartment = days * priceApartmentPerNight;
                break;
            case "July":
            case "August":
                priceStudioPerNight = 76.00;
                totalPriceStudio = days * priceStudioPerNight;

                priceApartmentPerNight = 77.00;
                totalPriceApartment = days * priceApartmentPerNight;
                break;
        }

        if (days > 14) {
            totalPriceApartment -= ((totalPriceApartment * 10) / 100);
        }

        System.out.printf("Apartment: %.2f lv. \n", totalPriceApartment);
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);
    }
}
