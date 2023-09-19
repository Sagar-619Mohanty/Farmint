public class Farmint {
    public static void main(String[] args) {
        Agro agro = new Agro();
        System.out.println("Welcome to Farmint!");
        agro.setVegetables("types of Vegetables");
        agro.setFruits("types of Fruit");
        agro.setGroceries("types of Groceries");
        agro.setVegetables_Price(700-1000);
        agro.setFruits_Price(100-500);
        agro.setGroceries_Price(200-800);
        System.out.println(agro.Vegetables);
        System.out.println(agro.Fruits);
        System.out.println(agro.Groceries);
        System.out.println(agro.Vegetables_Price);
        System.out.println(agro.fruits_Price);
        System.out.println(agro.Groceries_Price);

        Dairy dairy = new Dairy();
        dairy.setMilk("types of milk");
        dairy.setMilk_Quantity(1-5);
        dairy.setMilk_price(20-100);
        System.out.println(dairy.milk);
        System.out.println(dairy.milk_Quantity);
        System.out.println(dairy.milk_price);
        dairy.setCurd("types of curd");
        dairy.setCurd_Quantity(1-5);
        dairy.setCheese_price(10-30);
        System.out.println(dairy.curd);
        System.out.println(dairy.curd_Quantity);
        System.out.println(dairy.curd_price);
        dairy.setButter("types of butter");
        dairy.setButter_Quantity(100-1);
        dairy.setButter_price(20-100);
        System.out.println(dairy.butter);
        System.out.println(dairy.butter_Quantity);
        System.out.println(dairy.butter_price);
        dairy.setGhee("types of ghee");
        dairy.setGhee_Quantity(100-1);
        dairy.setGhee_price(170-1000);
        System.out.println(dairy.ghee);
        System.out.println(dairy.ghee_Quantity);
        System.out.println(dairy.ghee_price);
        dairy.setCheese("types of cheese");
        dairy.setCheese_Quantity(50-1);
        dairy.setCheese_price(40-600);
        System.out.println(dairy.cheese);
        System.out.println(dairy.cheese_Quantity);
        System.out.println(dairy.cheese_price);

        Payments pay = new Payments();
        pay.setCOD("Manually Cash Payment");
        System.out.println(pay.COD);
        pay.setUPI("Payment through UPIs");
        System.out.println(pay.UPI);
        pay.setDebit_Card("Payments through Debit-Card");
        System.out.println(pay.Debit_Card);
        pay.setCredit_Card("Payments through Credit-Card");
        System.out.println(pay.Credit_Card);


        Riders ride = new Riders();
        ride.setSmall_riders("short-distance riders");
        System.out.println(ride.Small_riders);
        ride.setDistance_riders("remote areas riders");
        System.out.println(ride.Distance_riders);
        ride.setDairy_riders("more caution should be taken with bottle and carrat");
        System.out.println(ride.Dairy_riders);
        ride.setVegetables_riders("should be deliver fresh");
        System.out.println(ride.Vegetables_riders);
        ride.setGrocery_riders("all kinds of groceries");
        System.out.println(ride.Grocery_riders);


        Farmint_Internal farmintInternal = new Farmint_Internal();
        farmintInternal.setFarmint_Backend("Develops App's backend technology");
        System.out.println(farmintInternal.Farmint_Backend);
        farmintInternal.setFarmint_Frontend("Make app more beautiful and user-friendly");
        System.out.println(farmintInternal.Farmint_Frontend);
        farmintInternal.setFarmint_Marketing("Increase popularity and help to get more customer");
        System.out.println(farmintInternal.Farmint_Marketing);
        farmintInternal.setFarmint_Sales("Provide all kind of support and help to solve all kind of queries");
        System.out.println(farmintInternal.Farmint_Sales);
    }
}