import org.junit.Test;

public class Valuegeneratortest {

        @Test
        public void between25and50() {
            int generation = ValueGenerator.between2550();
            assert generation > 25 && generation < 50;
        }
        @Test
        public void max25() {
        int generation = ValueGenerator.max25();
        assert generation > 1 && generation < 25;
    }

}
