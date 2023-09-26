public class Farmint {
    public static void main(String[] args) {
        Product pr =  new Product();
        pr.setId(101);
        System.out.println(pr.id);
        pr.setProduct_name("");
        System.out.println(pr.Product_name);
        pr.setProduct_price(100.00);
        System.out.println(pr.Product_price);
        pr.setProduct_Catagory("");
        System.out.println(pr.Product_Catagory);
        pr.setProduct_Quantity(1);
        System.out.println(pr.Product_Quantity);

        Payment pay = new Payment();
        pay.setAmount(100);
        System.out.println(pay.amount);
        for(Payment.payment_methods paymentMethods : Payment.payment_methods.values()){
            System.out.println(paymentMethods);
        }

        Riders ride = new Riders();
        ride.setRider_id(101);
        System.out.println(ride.Rider_id);
        ride.setRider_name("");
        System.out.println(ride.Rider_name);
        ride.setRider_vehicle("");
        System.out.println(ride.Rider_vehicle);
        ride.setRider_vehicle_no(1234);
        System.out.println(ride.Rider_vehicle_no);
        for (Riders.Gender gen : Riders.Gender.values()) {
            System.out.println(gen);
        }


        Farmint_Internal farmintInternal = new Farmint_Internal();
        farmintInternal.setFarmint_Backend("Develops App's backend technology");
        System.out.println(farmintInternal.Farmint_Backend);
        farmintInternal.setFarmint_Frontend("Make app more beautiful and user-friendly");
        System.out.println(farmintInternal.Farmint_Frontend);
        farmintInternal.setFarmint_Marketing("Increase popularity and help to get more customer");
        System.out.println(farmintInternal.Farmint_Marketing);
        farmintInternal.setFarmint_Sales("Provide all kind of support and help to solve all kind of queries");
        System.out.println(farmintInternal.Farmint_Sales);

        Farmint_App farmintApp = new Farmint_App();
        farmintApp.setBuyer_app("App for buyers");
        System.out.println(farmintApp.Buyer_app);
        farmintApp.setSeller_app("App for sellers");
        System.out.println(farmintApp.Seller_app);
        farmintApp.setAll_Customised_App("Customised app for all type of sellers");
        System.out.println(farmintApp.All_Customised_App);

        Farmint_Account farmintAccount = new Farmint_Account();
        farmintAccount.setSign_up("Give your details for signup");
        System.out.println(farmintAccount.Sign_up);
        farmintAccount.setLogin("Login to go to use the app");
        System.out.println(farmintAccount.Login);
        farmintAccount.setProfile("edit,save or delete profile picture. edit name or address or mobile number");
        System.out.println(farmintAccount.Profile);
        farmintAccount.setLog_out("logout the account");
        System.out.println(farmintAccount.Log_out);
    }
}