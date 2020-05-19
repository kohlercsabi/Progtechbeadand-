public class Silver extends CategoryDecorator {
    public Silver(ICharacter character) {
        super(character);
    }

    @Override
    public int getAcceleration() {
        return character.getAcceleration() + 50;
    }

    ;

    @Override
    public int getSprintSpeed() {
        return character.getSprintSpeed() + 50;
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
        return character.getAgility() + 50;
    }

    ;

    @Override
    public int getBalance() {
        return character.getBalance() + 50;
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


    @Override
    public int getPace() {
        return ((getAcceleration() + getSprintSpeed()) /2);
    }

    @Override
    public int getShooting() {
        return ((getPositioning() + getFinishing()) /2);
    }

    @Override
    public int getPassing() {
        return ((getVision() + getCrossing()) /2);
    }

    @Override
    public int getDribbling() {
        return ((getAgility() + getBalance()) /2);
    }

    @Override
    public int getDefending() {
        return ((getInterceptions() + getHeadingAccuracy()) / 2 );
    }

    @Override
    public int getPhysicality() {
        return ((getJumping() + getStamina()) /2);
    }

    @Override
    public int getOveral() {
        return ((getPace() + getShooting() + getPassing() + getDribbling() + getDefending() + getPhysicality()) /6);
    }



    @Override
    public void printValues() {
        character.printValues();
    }

    ;
}
