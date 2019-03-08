package components.text

class BoldText : Component() {
    var boldMeasurement = BoldMeasurement.Bold1
    override fun renderText(): String {
        val tag = "*".repeat(boldMeasurement.measure)
        return "$tag$content$tag"
    }
}

enum class BoldMeasurement(val measure: Int) {
    Bold1(1), Bold2(2), Bold3(3);
}