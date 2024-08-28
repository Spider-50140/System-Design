//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BasePizza basePizza1 = new Margarita();
        BasePizza basePizza2 = new AddCheese(basePizza1);
        BasePizza basePizza3 = new AddMushroom(new FarmHouse());

        System.out.println(basePizza1.cost());
        System.out.println(basePizza2.cost());
        System.out.println(basePizza3.cost());


    }
}