package components

class BoldText : Component() {
    var boldMeasurement = BoldMeasurement.H1
    override fun renderText(): String {
        val tag = "*".repeat(boldMeasurement.measure)
        return "$tag$content$tag"
    }
}

enum class BoldMeasurement(val measure: Int) {
    H1(1), H2(2), H3(3);
}