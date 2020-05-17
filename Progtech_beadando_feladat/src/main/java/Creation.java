public class Creation {
    static void createCharacter(String name, Positions positions, Category category) {
        ICharacter baseCharacter = null;
        ICharacter decoratedCharacter;

        switch (positions) {
            case Defender:
                baseCharacter = new Character(new Defender());
                break;
            case Goalkeeper:
                baseCharacter = new Character(new Goalkeeper());
                break;
            case Striker:
                baseCharacter = new Character(new Striker());
                break;
            case Midfielder:
                baseCharacter = new Character( new Midfielder());
                break;

        }

        switch (category) {
            case Bronze:
                decoratedCharacter = new Bronze(baseCharacter);
                break;
            case Silver:
                decoratedCharacter = new Silver(baseCharacter);
                break;
            case Gold:
                decoratedCharacter = new Gold(baseCharacter);
                break;
            default:
                decoratedCharacter = baseCharacter;
                break;
        }

        System.out.println("Your footballer details:");
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Position: " + positions);
        decoratedCharacter.printValues();
    }
}
