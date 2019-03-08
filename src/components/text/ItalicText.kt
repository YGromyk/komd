package components.text

class ItalicText : Component() {
    override fun renderText(): String = "*$content*"
}