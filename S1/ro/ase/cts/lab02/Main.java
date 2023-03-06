package ro.ase.cts.lab02;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OShop o = new OShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5, 1,Category.ELECTRONIC, new Date());
        Product p2 = new Product("Frigider", 207.95, 1,Category.HANDMADE, new Date());

        System.out.println(p1.getExpirationDate());

        Product p3 = new Product(p1);

        p3.setQuantity(5);
        p3.setName("Paine");

        o.modifyProductList(true,p1);
        o.modifyProductList(true,p2);

        o.modifyProductList(false, p1);
        System.out.println(p1.equals(p2));
    }
}

class OShop {
    private String onlineShopName;
    private String img;
    private ArrayList<Product> products;

    OShop(String onlineShopName, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.img = img;
        this.onlineShopName = onlineShopName;
    }

    public void modifyProductList(boolean isUnderOrderLimit, Product p)
    {
        if(isUnderOrderLimit == true)
        {
            this.products.add(p);
        }
        else
            this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

//equals =>  isEquals
enum Category{
    ELECTRONIC, HANDMADE, SPORTS, CLOTHING
}

class Product
{
    private static final String EUROPEAN_DATE_FORMAT = "dd/MM/yyyy";

    private static int count = 0;
    private int id;
    private String name;
    private double price;
    private int type;
    private Category category;
    private int quantity;

    private Date expirationDate; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int pt, Category category, Date expirationDate)
    {
        this.count ++;
        this.id = count;
        this.name = name;
        this.price = price;
        this.type = pt;
        this.category = category;
        this.expirationDate = expirationDate;
    }

    public Product(Product originalProduct)
    {
        this.id = originalProduct.id;
        this.name = originalProduct.name;
        this.price = originalProduct.price;
        this.type = originalProduct.type;
        this.category = originalProduct.category;
        this.expirationDate = originalProduct.expirationDate;
        this.details = originalProduct.details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Category getCategory()
    {
        return this.category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public boolean equals(Product p) {
        if (isEqualId(p.id)) {
            if (isEqualName(p.name)) {
                if (isEqualPrice(p.price)) {
                    if (isEqualCategory(p.category))
                        if(isEqualType(p.type))
                            return true;
                }
            }
        }
        return false;
    }

    private boolean isEqualId(int id)
    {
        if(this.id == id)
            return true;
        return false;
    }

    private boolean isEqualName(String name)
    {
        if (this.name.equals(name))
            return true;
        return false;
    }

    private boolean isEqualPrice(double price)
    {
        if(this.price == price)
            return true;
        return false;
    }

    private boolean isEqualCategory(Category category)
    {
        if(this.category == category)
            return true;
        return false;
    }

    private boolean isEqualType(int type)
    {
        if(this.type == type)
            return true;
        return false;
    }

    public void modifyPrice(boolean flag, double value)
    {
        if(flag)
            increaseValue(value);
        else
            decreaseValue(value);
    }

    private double increaseValue(double value)
    {
        return this.price + this.price*value;
    }

    private double decreaseValue(double value)
    {
        return this.price - this.price*value/100;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String username;
    private String Id;
    private ArrayList<Order> listOfOrders;
    private ArrayList<Order> listOfCommands;

    public User(String username, String Id)
    {
        this.username = username;
        this.Id = Id;
        listOfOrders=new ArrayList<Order>();
        listOfCommands=new ArrayList<Order>();
    }

    public void addOrder(Order order)
    {
        this.listOfOrders.add(order);
    }

    public void addCommand(Order command)
    {
        this.listOfCommands.add(command);
    }
}

class Order
{
    private ArrayList<Product> listOfOrders;
    private String address;

    public Order()
    {
        listOfOrders = new ArrayList<Product>();
    }
    public void add(Product p)
    {
        if(listOfOrders.size() > 99)
            return;

        listOfOrders.add(p);
    }

    public void remove(Product p)
    {
        listOfOrders.remove(p);
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class InventoryProduct
{
    private Product product;
    private int quantity;

    public InventoryProduct(Product product, int quantity)
    {
        this.product = new Product(product);
        this.quantity = quantity;
    }
    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

