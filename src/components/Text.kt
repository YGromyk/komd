package components

abstract class Component(var content: String = "") {
    abstract fun renderText(): String
}