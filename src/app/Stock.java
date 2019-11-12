package app;

public class Stock
{
    protected static int ID = 1;
    private String stockID;
    private String name;
    private double price;
    private Category category;

    public Stock(String name, double price, Category category)
    {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Stock()
    {
        stockID = ID + "";
        ID++;
    }

    public String getStockID()
    {
        return stockID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }
}
