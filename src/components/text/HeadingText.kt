package components.text

import components.Component

class HeadingText(var headingSize: Int) : Component() {
    override fun renderText(): String {
        return "#".repeat(headingSize) + " $content"
    }
}