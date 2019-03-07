package components

class ItalicText : Component() {
    override fun renderText(): String = "*$content*"
}

fun italic(block: ItalicText.() -> String): String {
    val italic = ItalicText()
    italic.content = block(italic)
    return italic.renderText()
}