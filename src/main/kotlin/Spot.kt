class Spot(
    private var status: SpotStatus = SpotStatus.FREE
) {
    fun isAvailable(): Boolean {
        return status == SpotStatus.FREE
    }
}
