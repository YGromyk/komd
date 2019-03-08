package components.text

import components.Component

class QuotingText: Component() {
    override fun renderText(): String  = ">$content"
}