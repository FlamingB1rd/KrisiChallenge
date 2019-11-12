package app;

import java.util.Scanner;

public class MagazineApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Magazine magazine = new Magazine();

        magazine.stockUp();
        magazine.printStock();
        System.out.print("Enter the name of the stock you wish to see the category ID and name for: ");
        magazine.showCategoryIDAndNameOfAStock(scanner.nextLine());
    }
}
