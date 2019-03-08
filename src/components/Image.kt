package components

class Image: Component() {
    var description: String = ""
    var path: String = ""
    override fun renderText(): String = "![$description]($path)"
}