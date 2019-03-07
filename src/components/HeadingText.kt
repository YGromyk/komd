package components

class HeadingText(var headingSize: Int) : Component() {
    override fun renderText(): String {
        return "#".repeat(headingSize) + " $content"
    }
}

fun heading(headingSize: Int, block: HeadingText.() -> String): String {
    val headingText = HeadingText(headingSize)
    headingText.content = block(headingText)
    return headingText.renderText()
}