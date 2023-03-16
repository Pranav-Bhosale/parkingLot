data class Floor(val spots: List<Spot>) {
    fun isSpotAvailable(): Boolean {
        val availableSpots = spots.filter { spot -> spot.isAvailable() }
        return availableSpots.isNotEmpty()
    }

}
