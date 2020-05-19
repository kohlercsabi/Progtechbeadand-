public class Character implements ICharacter {
    private ValueStrategy valueStrategy;

    // generated values
    private int acceleration;
    private int sprintspeed;
    private int positioning;
    private int finishing;
    private int vision;
    private int crossing;
    private int agility;
    private int balance;
    private int interceptions;
    private int headingaccuracy;
    private int jumping;
    private int stamina;

    // calculated values
    private int pace;
    private int shooting;
    private int passing;
    private int dribbling;
    private int defending;
    private int physicality;
    private int overal;


    public Character(ValueStrategy valueStrategy) {
        this.valueStrategy = valueStrategy;
        setAcceleration();
        setSprintSpeed();
        setPositioning();
        setFinishing();
        setVision();
        setCrossing();
        setAgility();
        setBalance();
        setInterceptions();
        setHeadingAccuracy();
        setJumping();
        setStamina();


        this.pace = ((getAcceleration() + getSprintSpeed()) /2);
        this.shooting = ((getPositioning() + getFinishing()) /2);
        this.passing = ((getVision() + getCrossing()) /2);
        this.dribbling = ((getAgility() + getBalance()) /2);
        this.defending = ((getInterceptions() + getHeadingAccuracy()) / 2 );
        this.physicality = ((getJumping() + getStamina()) /2);
        this.overal = ((getPace() + getShooting() + getPassing() + getDribbling() + getDefending() + getPhysicality()) /6);


    }

    public void setAcceleration() {
        this.acceleration = valueStrategy.setAcceleration();
    }

    public void setSprintSpeed() {
        this.sprintspeed = valueStrategy.setSprintSpeed();
    }

    public void setPositioning() {
        this.positioning = valueStrategy.setPositioning();
    }

    public void setFinishing() {
        this.finishing = valueStrategy.setFinishing();
    }

    public void setVision() {
        this.vision = valueStrategy.setVision();
    }

    public void setCrossing() {
        this.crossing = valueStrategy.setCrossing();
    }

    public void setAgility() {
        this.agility = valueStrategy.setAgility();
    }

    public void setBalance() {
        this.balance = valueStrategy.setBalance();
    }

    public void setInterceptions() {
        this.interceptions = valueStrategy.setInterceptions();
    }
    public void setHeadingAccuracy() {
        this.headingaccuracy = valueStrategy.setHeadingAccuracy();
    }

    public void setJumping() {
        this.jumping = valueStrategy.setJumping();
    }

    public void setStamina() {
        this.stamina = valueStrategy.setStamina();
    }

    @Override
    public int getAcceleration() {
        return acceleration;
    }

    @Override
    public int getSprintSpeed() {
        return sprintspeed;
    }

    @Override
    public int getPositioning() {
        return positioning;
    }

    @Override
    public int getFinishing() {
        return finishing;
    }

    @Override
    public int getVision() {
        return vision;
    }

    @Override
    public int getCrossing() {
        return crossing;
    }

    @Override
    public int getAgility() {
        return agility;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public int getInterceptions() {
        return interceptions;
    }
    @Override
    public int getHeadingAccuracy() {
        return headingaccuracy;
    }

    @Override
    public int getJumping() {
        return jumping;
    }

    @Override
    public int getStamina() {
        return stamina;
    }



    @Override
    public void printValues() {



    };

    public int getPace() {
        return pace;
    }
    public int getShooting() {
        return shooting;
    }
    public int getPassing() {
        return passing;
    }
    public int getDribbling() {
        return dribbling;
    }
    public int getDefending() {
        return defending;
    }
    public int getPhysicality() {return physicality;}
    public int getOveral() {
        return overal;
    }

}
