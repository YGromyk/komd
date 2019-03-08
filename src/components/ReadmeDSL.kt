package components

import components.text.*

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

fun Readme.italic(block: ItalicText.() -> String) =
    initComponent(ItalicText().apply { content = block() })

fun Readme.quote(block: QuotingText.() -> String) =
    initComponent(QuotingText().apply { content = block() })

fun Readme.image(block: Image.() -> Unit) = initComponent(Image().apply(block))
fun Readme.header(headerSize: Int, block: HeadingText.() -> String) = initComponent(
    HeadingText(
        headerSize
    ).apply { content = block() })
