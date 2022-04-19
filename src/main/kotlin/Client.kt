import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    val container = document.getElementById("body") ?: error("No body tag!")
    val root = createRoot(container)
    val welcome = App.create()
    root.render(welcome)
}
