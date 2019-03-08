package components.text

class HeadingText(var headingSize: Int) : Component() {
    override fun renderText(): String {
        return "#".repeat(headingSize) + " $content"
    }
}