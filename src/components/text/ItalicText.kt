package components.text

import components.Component

class ItalicText : Component() {
    override fun renderText(): String = "*$content*"
}