package components

import java.util.*

@Suppress("unused")
class Readme : Component() {
    private val components = mutableListOf<Component>()
    override fun renderText(): String {
        return buildString {
            components.forEach { component ->
                append(component.renderText() + "\n")
            }
            append("Created at ${Date()}")
        }
    }

    fun <T : Component> initComponent(component: T): T {
        components.add(component)
        return component
    }
}

fun readme(block: Readme.() -> Unit): Readme {
    val readme = Readme()
    readme.block()
    return readme
}

fun Readme.bold(boldMeasurement: BoldMeasurement, block: BoldText.() -> String) = initComponent(
    BoldText().apply {
        content = block()
        this.boldMeasurement = boldMeasurement
    }
)

fun Readme.italic(block: ItalicText.() -> String) = initComponent(ItalicText().apply { content = block() })
fun Readme.quote(block: QuotingText.() -> String) = initComponent(QuotingText().apply { content = block() })
fun Readme.image(block: ImageLink.() -> Unit) = initComponent(ImageLink().apply(block))