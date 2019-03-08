package components.text

class ListItemText : Component() {
    override fun renderText(): String {
        return "- $content"
    }
}

@Suppress("unused", "WeakerAccess")
class List : Component() {
    val listItems = mutableListOf<ListItemText>()
    override fun renderText(): String {
        return buildString {
            listItems.forEach {
                append(it.renderText() + "\n")
            }
        }
    }
}

fun List.listItem(block: ListItemText.() -> String): ListItemText {
    val listItemText = ListItemText()
    listItemText.content = listItemText.block()
    listItems.add(listItemText)
    return listItemText
}