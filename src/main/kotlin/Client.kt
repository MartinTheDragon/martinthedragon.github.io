import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    val container = document.createElement("div")
    document.body!!.appendChild(container)
    val root = createRoot(container)
    val welcome = App.create()
    root.render(welcome)
}
