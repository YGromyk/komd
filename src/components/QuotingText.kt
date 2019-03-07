package components

class QuotingText: Component() {
    override fun renderText(): String  = ">$content"
}

fun quoting(block: QuotingText.() -> String): String {
    val quotingText = QuotingText()
    quotingText.content = block(quotingText)
    return quotingText.renderText()
}