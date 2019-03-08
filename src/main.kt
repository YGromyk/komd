import components.text.*
import components.*
import utils.println
import java.io.File


fun main() {
    val readme = readme {
        header(1) { "KoRd" }
        bold(BoldMeasurement.Bold2) { "KoRd is simple DSL that helps you to create beautiful readme files" }
        image {
            description = "This is an image"
            path = "images/kotlin-logo.png"
        }
        italic { "What is DSL?" }
        quote {
            "domain-specific language (DSL) is a computer language specialized to a particular application domain." +
                    " This is in contrast to a general-purpose language (GPL), " +
                    "which is broadly applicable across domains."
        }
        bold(BoldMeasurement.Bold1) { "KoRd" }
        italic { "It support all possible tags from Git" }
        quote { "Can quote" }
    }
    File("README.md").writeText(readme.renderText())
    readme.renderText().println()
}