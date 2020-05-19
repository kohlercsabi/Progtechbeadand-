public class Creation {
    static void createCharacter(String name, Positions positions, Category category) {
        ICharacter  baseCharacter = null;
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

        System.out.println("Your football player skills:");
        System.out.println("Acceleration: " + decoratedCharacter.getAcceleration());
        System.out.println("Sprint speed: " + decoratedCharacter.getSprintSpeed());
        System.out.println("Positioning: " + decoratedCharacter.getPositioning());
        System.out.println("Finishing: " + decoratedCharacter.getFinishing());
        System.out.println("Vision: " + decoratedCharacter.getVision());
        System.out.println("Crossing: " + decoratedCharacter.getCrossing());
        System.out.println("Agility: " + decoratedCharacter.getAgility());
        System.out.println("Balance: " + decoratedCharacter.getBalance());
        System.out.println("Interceptions: " + decoratedCharacter.getInterceptions());
        System.out.println("Heading Accuracy: " + decoratedCharacter.getHeadingAccuracy());
        System.out.println("Jumping: " + decoratedCharacter.getJumping());
        System.out.println("Stamina: " + decoratedCharacter.getStamina());

        System.out.println("Your football player summarized values:");
        System.out.println("Pace: " + decoratedCharacter.getPace());
        System.out.println("Shooting: " + decoratedCharacter.getShooting());
        System.out.println("Passing: " + decoratedCharacter.getPassing());
        System.out.println("Dribbling: " + decoratedCharacter.getDribbling());
        System.out.println("Defending: " + decoratedCharacter.getDefending());
        System.out.println("Physicality: " + decoratedCharacter.getPhysicality());
        System.out.println("Overal: " + decoratedCharacter.getOveral());

        decoratedCharacter.printValues();
    }
}
