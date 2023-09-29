import java.util.*;
public class Pizza{
   private String crust;
   private String cheese;
   private String toppings;
   private String size;
   private String isVeg;
   private int quantity;
   private String carryBag;
   private String delivaryType;
   private String orderConfirm;
   private int bill;
   Pizza(){
    this.bill=0;
   }
   void addCrust(String crust){
    
    if(crust.equals("Maida")){
       this.bill+=50;
    }
    if(crust.equals("Wheat")){
        this.bill+=100;
    }
    if(crust.equals("Handtoast")){
        this.bill+=30;
    }
   }
   void addCheese(String cheese){
    if(cheese.equals("yes")){
        this.bill+=50;
    }
   }
   void addToppings(String toppings){
    if(toppings.equals("Tomato")){
        this.bill+=50;
    }
    if(toppings.equals("Onion")){
       this.bill+=30;
    }
    if(toppings.equals("Mushroom")){
       this.bill+=50;
    }
    if(toppings.equals("Panner")){
       this.bill+=50;
    }
    if(toppings.equals("Sweetcorn")){
       this.bill+=20;
    }
    if(toppings.equals("Olives")){
       this.bill+=45;
    }
    }
    void addSize(String size){
     if(size.equals("Regular")){
        this.bill+=100;
     }
     if(size.equals("Medium")){
       this.bill+=150;
     }
     if(size.equals("Large")){
       this.bill+=200;
     }
     
    }
    void isaddVeg(String isVeg){
     
    if(isVeg.equals("yes")){
      this.bill+=50;
     }
     if(isVeg.equals("no")){
      this.bill+=80;
     }
    }
    void addQuantity(int quantity){
        
            this.bill=quantity*bill;
        
    }
     void addCarryBag(String carryBag){
        if(carryBag.equals("yes")){
           this.bill+=10;
        }
    }
    void addDelivaryType(String delivaryType){
        if(delivaryType.equals("Home")){
           this.bill+=60;
        }
       if(delivaryType.equals("Office")){
           this.bill+=60;
        }
        if(delivaryType.equals("Doorstep")){
           this.bill+=100;
        }
    }
    void addOrderConfirm(String orderConfirm){
        if(orderConfirm.equals("yes")){
            System.out.println("<<-----ORDER CONFIRMED----->>"); 
        }else{
             System.out.println("<<-----ORDER CANCELLED----->>");
           this.bill=0;
        }
    }
    int getBill(){
        return this.bill;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        Pizza p=new Pizza();
        System.out.println("-->Select the crust you want:");
        System.out.println("1.Maida");
        System.out.println("2.Wheat");
        System.out.println("3.Handtoast");
        String cr=sc.nextLine();
        p.addCrust(cr);
        System.out.println("-->Do yow want cheese:");
        String ch=sc.nextLine();
        p.addCheese(ch);
        System.out.println("-->Select the toppings:");
        System.out.println("Tomato");
        String o1=sc.nextLine();
        if(o1.equals("yes")){
            p.addToppings("Tomato");
        }
        System.out.println("Onion");
        String o2=sc.nextLine();
        if(o2.equals("yes")){
            p.addToppings("Onion");
        } 
        System.out.println("Mushroom");
        String o3=sc.nextLine();
        if(o3.equals("yes")){
            p.addToppings("Mushroom");
        } 
        System.out.println("Panner");
        String o4=sc.nextLine();
        if(o4.equals("yes")){
            p.addToppings("Panner");
        } 
        System.out.println("Sweetcorn");
        String o5=sc.nextLine();
        if(o5.equals("yes")){
            p.addToppings("Sweetcorn");
        } 
        System.out.println("Olives");
        String o6=sc.nextLine();
        if(o6.equals("yes")){
            p.addToppings("Olives");
        } 
        System.out.println("-->Enter the size:");
        System.out.println("1.Regular");
        System.out.println("2.Medium");
        System.out.println("3.Large");
        String sz=sc.nextLine();
        p.addSize(sz);
        System.out.println("-->isVeg?");
        String veg=sc.nextLine();
        p.isaddVeg(veg);
        System.out.println("-->Please enter the Quantity:");
        int v=sc.nextInt();
        p.addQuantity(v);
        sc.nextLine();
        System.out.println("-->Do you want carrybag:");
        String c1=sc.nextLine();
        p.addCarryBag(c1);
        System.out.println("-->Please select the mode of delivary:");
        System.out.println("1.Home");
        System.out.println("2.Office");
        System.out.println("3.Doorstep");
        String dt=sc.nextLine();
        p.addDelivaryType(dt);
        System.out.println("Please Confirm the Order:");
       String or=sc.nextLine();
        p.addOrderConfirm(or);
        int ans=p.getBill();
        if(ans==0){
            return;
        }
        System.out.print("Total Bill--->>");
        System.out.println(ans);
        System.out.println("Thanks for visting Pizza Lover,visit again :)");
        System.out.println("Have a Good Day :)");
    }
}
