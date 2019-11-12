package app;

import java.util.Scanner;

public class Magazine
{
    private Stock[] stock = new Stock[3];

    public void stockUp()
    {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < stock.length ; i++)
        {
            stock[i] = new Stock();

            System.out.print("Enter the name of the stock: ");
            stock[i].setName(scanner.nextLine());
            System.out.print("Enter the price of the stock: ");
            stock[i].setPrice(Double.parseDouble(scanner.nextLine()));
            System.out.print("Enter the category of the stock: ");
            stock[i].setCategory(new Category(scanner.nextLine()));
            System.out.println("\n---------------- NEXT STOCK ----------------");
        }
    }

    public void printStock()
    {
        for(int i = 0; i < stock.length; i++)
        {
            System.out.printf("Stock number %d is:\n", i);
            System.out.println(stock[i].getName());
        }
    }

    public void showStockID()
    {
        for (Stock singleStock : stock)
        {
            System.out.println(singleStock.getStockID());
        }
    }

    public void showCategoryIDAndNameOfAStock(String stockName)
    {
        for(int i = 0; i < stock.length; i++)
        {
            if(stock[i].getName().toLowerCase().equals(stockName.toLowerCase()))
            {
                System.out.println("The category name for this stock is: " + stock[i].getCategory().getName());
                System.out.println("The category ID for this stock is: " + stock[i].getCategory().getCategoryID());
                break;
            }
        }
    }

    public void printStockByPrice()
    {

    }
}
