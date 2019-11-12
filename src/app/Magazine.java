package app;

import java.util.Scanner;

public class Magazine
{
    private int amountOfStock;
    private Stock[] stock;

    public Magazine (int amountOfStock)
    {
        this.amountOfStock = amountOfStock;
        stock = new Stock[amountOfStock];
    }

    public void stockUp()
    {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < stock.length ; i++)
        {
            stock[i] = new Stock();

            System.out.println("\n---------------- NEXT STOCK ----------------");
            System.out.print("Enter the name of the stock: ");
            stock[i].setName(scanner.nextLine());
            System.out.print("Enter the price of the stock: ");
            stock[i].setPrice(Double.parseDouble(scanner.nextLine()));
            System.out.print("Enter the category (name) of the stock: ");
            stock[i].setCategory(new Category(scanner.nextLine()));
        }
    }

    public void printStock()
    {
        System.out.println("\n---------------- PRINTING STOCK ----------------");
        for(int i = 0; i < stock.length; i++)
        {
            System.out.printf("Stock number %d is: ", i+1);
            System.out.println(stock[i].getName());
        }
    }

    public void showStockID()
    {
        System.out.println("\n---------------- SHOWING STOCK ITEM's ID ----------------");
        for(int i = 0; i < stock.length; i++)
        {
            System.out.printf("The ID of the stock number %d is: ", i+1);
            System.out.println(stock[i].getStockID());
        }
    }

    public void showCategoryIDAndNameOfAStock(String stockName)
    {
        System.out.println("\n---------------- CATEGORY ID AND NAME BY STOCK ----------------");
        for(int i = 0; i < stock.length; i++)
        {
            if(stock[i].getName().toLowerCase().equals(stockName.toLowerCase()))
            {
                System.out.println("The category name for this stock is: " + stock[i].getCategory().getName());
                System.out.println("The category ID for this stock is: " + stock[i].getCategory().getCategoryID());
                System.out.println();
                break;
            }
        }
    }

    public void printStockByPrice()
    {
        System.out.println("\n---------------- SORTING BY PRICE FROM LOWEST TO HIGHEST ----------------");

        int n = stock.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (stock[j].getPrice() > stock[j+1].getPrice())
                {
                    Stock temp = stock[j];
                    stock[j] = stock[j+1];
                    stock[j+1] = temp;
                }

        for(int i = 0; i < stock.length; i++)
        {
            System.out.printf("Stock number %d is: ", i+1);
            System.out.print(stock[i].getName());
            System.out.println(" with price: " + stock[i].getPrice());
        }
    }
}
