import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        // Test creating RewardValue with a cash value
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        // Test creating RewardValue with a miles value
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        // Test converting from cash to miles
        double cashValue = 200;
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = cashValue / 0.0035; // Conversion rate from cash to miles
        assertEquals(expectedMiles, rewardValue.getMilesValue(), 0.001); // Delta allows for slight precision difference
    }

    @Test
    void convert_from_miles_to_cash() {
        // Test converting from miles to cash
        int milesValue = 5000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * 0.0035; // Conversion rate from miles to cash
        assertEquals(expectedCash, rewardValue.getCashValue(), 0.001); // Delta allows for slight precision difference
    }
}
