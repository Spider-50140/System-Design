public class AddCheese extends Topping{
    BasePizza basePizza;

    public AddCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int cost(){
       return basePizza.cost() + 20;
    }
}
