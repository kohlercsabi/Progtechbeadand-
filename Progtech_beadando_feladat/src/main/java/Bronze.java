public class Bronze extends CategoryDecorator {
    public Bronze(ICharacter character) {
        super(character);
    }

    @Override
    public int getAcceleration() {
        return character.getAcceleration() + 25;
    }

    ;

    @Override
    public int getSprintSpeed() {
        return character.getSprintSpeed() + 25;
    }

    ;

    @Override
    public int getPositioning() {
        return character.getPositioning() + 25;
    }

    ;

    @Override
    public int getFinishing() {
        return character.getFinishing() + 25;
    }

    ;

    @Override
    public int getVision() {
        return character.getVision() + 25;
    }

    ;

    @Override
    public int getCrossing() {
        return character.getCrossing() + 25;
    }

    ;

    @Override
    public int getAgility() {
        return character.getAgility() + 25;
    }

    ;

    @Override
    public int getBalance() {
        return character.getBalance() + 25;
    }

    ;

    @Override
    public int getInterceptions() {
        return character.getInterceptions() + 25;
    }

    ;

    @Override
    public int getHeadingAccuracy() {
        return character.getHeadingAccuracy() + 25;
    }

    ;

    @Override
    public int getJumping() {
        return character.getJumping() + 25;
    }

    ;

    @Override
    public int getStamina() {
        return character.getStamina() + 25;
    }

    ;

    @Override
    public void printValues() {
        character.printValues();
    }

    ;
}