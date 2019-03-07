package components

class BoldText: Component() {
    override fun renderText(): String =
            "**$content**"
}

fun bold(block: BoldText.() -> String): String {
    val italic = BoldText()
    italic.content = block(italic)
    return italic.renderText()
}