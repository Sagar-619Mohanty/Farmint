public class Product {
    public int id ;
    public String Product_name;
    public double Product_price;
    public int Product_Quantity;
    public String Product_Catagory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return Product_name;
    }

    public double getProduct_price() {
        return Product_price;
    }

    public void setProduct_price(double product_price) {
        Product_price = product_price;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }


    public int getProduct_Quantity() {
        return Product_Quantity;
    }

    public void setProduct_Quantity(int product_Quantity) {
        Product_Quantity = product_Quantity;
    }

    public String getProduct_Catagory() {
        return Product_Catagory;
    }

    public void setProduct_Catagory(String product_Catagory) {
        Product_Catagory = product_Catagory;
    }
}
