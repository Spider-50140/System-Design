public class AddMushroom extends Topping{
        BasePizza basePizza;

        public AddMushroom(BasePizza basePizza){
            this.basePizza = basePizza;
        }

        public int cost(){
            return basePizza.cost() + 30;
        }

}
