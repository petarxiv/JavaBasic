package Class26;

public class ShoppingCart {

    double OriginalPrice;
    double discount=.15;
    void setDiscount(double discount){
        if(discount>0&&discount<=.15){
            this.discount=discount;

        }else{
            System.out.println("Can't have that much discount");
        }
    }
    public double getDiscount(){
        return discount;
    }

    void calculatePrice(){
        double price=OriginalPrice-(OriginalPrice*discount);
                System.out.println(price);

    }

}
