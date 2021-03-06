package components

import components.text.Component
import java.util.*

@Suppress("unused")
class Readme : Component() {
    private val components = mutableListOf<Component>()
    override fun renderText(): String {
        return buildString {
            components.forEach { component ->
                append(component.renderText() + "\n\n")
            }
            append("Created at ${Date()}")
        }
    }

    fun <T : Component> initComponent(component: T): T {
        components.add(component)
        return component
    }
}