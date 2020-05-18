import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;


public class Defendertest {

    @Test
    public void testdefenderisdefender() {
        Character testdefender = new Character(new Defender());


        assert testdefender.getAcceleration() >= 1;
        assert testdefender.getSprintSpeed() >= 1;
        assert testdefender.getPositioning() >= 1;
        assert testdefender.getFinishing() >= 1;
        assert testdefender.getVision() >= 1;
        assert testdefender.getCrossing() >= 1;
        assert testdefender.getAgility() >= 1;
        assert testdefender.getBalance() >= 1;
        assert testdefender.getInterceptions() >= 25;
        assert testdefender.getHeadingAccuracy() >= 25;
        assert testdefender.getJumping() >= 1;
        assert testdefender.getStamina() >= 1;

    }
}