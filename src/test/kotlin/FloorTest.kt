import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FloorTest {

    @Test
    fun `isSpotAvailable should return true if spots are available`() {
        val spots = List(30) { Spot() }
        val floor = Floor(spots)

        val isSpotAvailable = floor.isSpotAvailable()

        assertEquals(true, isSpotAvailable)
    }

    @Test
    fun `isSpotAvailable should return false if spots are not available`() {
        val spots = List(30) { Spot(SpotStatus.BOOKED) }
        val floor = Floor(spots)

        val isSpotAvailable = floor.isSpotAvailable()

        assertEquals(false, isSpotAvailable)
    }
}