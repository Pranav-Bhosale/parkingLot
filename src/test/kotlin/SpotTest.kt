import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SpotTest {
    @Test
    fun `isAvailable should return true if spot is available`() {
        val spot = Spot()

        val isAvailable = spot.isAvailable()

        assertEquals(true, isAvailable)
    }

    @Test
    fun `isAvailable should return false if spot is not available`() {
        val spot = Spot(SpotStatus.BOOKED)

        val isAvailable = spot.isAvailable()

        assertEquals(false, isAvailable)
    }
}