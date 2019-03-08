package components

abstract class Component(var content: String = "") {
    abstract fun renderText(): String
    fun <T : Component> initTag(tag: T): Component {
        return tag
    }
}