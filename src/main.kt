import components.*
import utils.println
import java.io.File

fun main() {
    val readme = readme {
        bold(BoldMeasurement.H1) { "KoRd" }
        bold(BoldMeasurement.H2) { "KoRd is simple DSL that helps you to create beautiful readme files" }
        italic { "It support all possible tags from Git" }
        quote { "Can quote" }
        image {
            description = "This is image"
            path = "images/kotlin-logo.png"
        }
    }
    File("README.md").writeText(readme.renderText())
    readme.renderText().println()
}