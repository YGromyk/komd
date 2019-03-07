package components

class ListItemText : Component() {
    override fun renderText(): String {
        return "- $content"
    }
}

class List : Component() {
    val listItems = mutableListOf<ListItemText>()
    override fun renderText(): String {
        buildString {
            listItems.forEach {
                append(it.renderText() + "\n")
            }
        }
    }
}

fun listItem(block: ListItemText.() -> String): ListItemText {
    val listItemText = ListItemText()
    listItemText.content = block(listItemText)
    return listItemText
}
