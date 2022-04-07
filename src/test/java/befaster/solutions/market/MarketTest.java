package befaster.solutions.market;

import befaster.solutions.CHK.CheckoutSolution;
import befaster.solutions.SUM.SumSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


        import org.junit.Before;
        import org.junit.Test;

        import static org.hamcrest.MatcherAssert.assertThat;
        import static org.hamcrest.Matchers.equalTo;

public class MarketTest {
    private CheckoutSolution market;

    @Before
    public void setUp() {

        market = new CheckoutSolution();
    }

    @Test
    public void markettest() {
        //task1
        //assertThat(market.checkout("ABCD"), equalTo(115));
        //assertThat(market.checkout("AAABCD"), equalTo(195));
        //assertThat(market.checkout("AAABBCD"), equalTo(210));
        //assertThat(market.checkout("AAABBCCDD"), equalTo(245));
        //task2
        assertThat(market.checkout("ABCDEE"), equalTo(165));
        assertThat(market.checkout("ABCDEEEE"), equalTo(245));
        assertThat(market.checkout("ABBCDEEEE"), equalTo(245));
        assertThat(market.checkout("ABBCDEEEEE"), equalTo(285));
        assertThat(market.checkout("AAAAA"), equalTo(200));
        assertThat(market.checkout("AAAAAA"), equalTo(250));
        assertThat(market.checkout("AAAAAAA"), equalTo(300));
        assertThat(market.checkout("AAAAAAAA"), equalTo(330));





    }
}





