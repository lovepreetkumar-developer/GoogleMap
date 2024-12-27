package bajaj.aditya.hw5.model

class AlientAlert : ArrayList<AlientAlertItem>()

data class AlientAlertItem(
    val lat: Double = 0.0,
    val lon: Double = 0.0,
    val ship: Int = 0
)