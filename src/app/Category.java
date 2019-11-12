package app;

public class Category
{
    private static int ID = Stock.ID;
    private String categoryID;
    private String name;

    public Category(String name)
    {
        categoryID = ID + "";
        this.name = name;
    }

    public String getCategoryID()
    {
        return categoryID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
