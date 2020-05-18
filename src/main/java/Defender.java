public class Defender extends ValueStrategy {


    public int setAcceleration() { return ValueGenerator.max25(); }
    public int setSprintSpeed() {return ValueGenerator.max25();};
    public int setPositioning() {return ValueGenerator.max25();};
    public int setFinishing() {return ValueGenerator.max25();};
    public int setVision() {return ValueGenerator.max25();};
    public int setCrossing() {return ValueGenerator.max25();};
    public int setAgility() {return ValueGenerator.max25();};
    public int setBalance() {return ValueGenerator.max25();};
    public int setInterceptions() {return ValueGenerator.between2550();}
    public int setHeadingAccuracy() {return ValueGenerator.between2550();};
    public int setJumping() {return ValueGenerator.max25();};
    public int setStamina() {return ValueGenerator.max25();};

    public int setPace(){return 0;};
    public int setShooting(){return 0;};
    public int setPassing(){return 0;};
    public int setDribbling(){return 0;};
    public int setDefending(){return 0;};
    public int setPshysicality() {return 0;};
    public int setOveral(){return 0;};

}
