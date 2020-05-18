import org.junit.Test;


public class Skillcalulationtest {

    @Test
    public void Pacecalculation() {

        Character testpace = new Character(new Defender());

        assert testpace.getPace() == (testpace.getAcceleration() + testpace.getAcceleration()) / 2;

    }
    @Test
    public void Shootingcalculation() {

        Character testshooting = new Character(new Defender());

        assert testshooting.getShooting() == (testshooting.getPositioning() + testshooting.getFinishing()) / 2;

    }

    @Test
    public void Overalcalculation() {

        Character testoveral = new Character(new Defender());

        assert testoveral.getOveral() == (testoveral.getPace() + testoveral.getShooting() + testoveral.getPassing() +
                testoveral.getDribbling() + testoveral.getDefending() + testoveral.getPhysicality()) / 6;
    }
}
