import Classes.*;

public class GameApp {
    public static void main(String[] args) {
        Characters characters = new Characters(new Knight());

        System.out.println(characters.attackStrategy());
        System.out.println(characters.defenceStrategy());

        characters.setStrategy(new Archer());

        System.out.println(characters.attackStrategy());
        System.out.println(characters.defenceStrategy());

        characters.setStrategy(new Wizard());

        System.out.println(characters.attackStrategy());
        System.out.println(characters.defenceStrategy());
    }
}
