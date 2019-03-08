package components.text

class QuotingText: Component() {
    override fun renderText(): String  = ">$content"
}