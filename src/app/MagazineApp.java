package app;

import java.util.Scanner;

public class MagazineApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how much stock you wish to have in your Magazine: ");
        Magazine magazine = new Magazine(Integer.parseInt(scanner.nextLine()));

        magazine.stockUp();
        magazine.printStock();
        magazine.showStockID();
        System.out.print("Enter the name of the stock you wish to see the category ID and name for: ");
        magazine.showCategoryIDAndNameOfAStock(scanner.nextLine());
        magazine.printStockByPrice();

    }
}
