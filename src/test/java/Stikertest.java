import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;


public class Stikertest {

    @Test
    public void teststrikerisstriker() {
        Character teststriker = new Character(new Striker());


        assert teststriker.getAcceleration() >= 1;
        assert teststriker.getSprintSpeed() >= 1;
        assert teststriker.getPositioning() >= 25;
        assert teststriker.getFinishing() >= 25;
        assert teststriker.getVision() >= 1;
        assert teststriker.getCrossing() >= 1;
        assert teststriker.getAgility() >= 1;
        assert teststriker.getBalance() >= 1;
        assert teststriker.getInterceptions() >= 1;
        assert teststriker.getHeadingAccuracy() >= 1;
        assert teststriker.getJumping() >= 1;
        assert teststriker.getStamina() >= 1;

    }
}
