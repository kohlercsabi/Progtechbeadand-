public class Gold extends CategoryDecorator {
    public Gold(ICharacter character) {
        super(character);
    }

    @Override
    public int getAcceleration() {return character.getAcceleration() + 74 ;};

    @Override
    public int getSprintSpeed() {
        return character.getSprintSpeed() + 74 ;    };

    @Override
    public int getPositioning() {
        return character.getPositioning() + 74 ;
    };

    @Override
    public int getFinishing() {
        return character.getFinishing() + 74 ;
    };

    @Override
    public int getVision() {
        return character.getVision() + 74 ;
    };

    @Override
    public int getCrossing() {
        return character.getCrossing() + 74 ;
    };

    @Override
    public int getAgility() {
        return character.getAgility() + 74 ;
    };

    @Override
    public int getBalance() {
        return character.getBalance() + 74 ;
    };

    @Override
    public int getInterceptions()  {
        return character.getInterceptions() + 74 ;
    };

    @Override
    public int getHeadingAccuracy() {
        return character.getHeadingAccuracy() + 74 ;    };

    @Override
    public int getJumping() {
        return character.getJumping() + 74;
    };

    @Override
    public int getStamina() {
        return character.getStamina() + 74;};

    @Override
    public void printValues() {character.printValues();};
}
