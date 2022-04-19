import react.FC
import react.Props
import react.dom.aria.AriaRole
import react.dom.html.ButtonType
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.p
import react.router.dom.Link
import react.useState
import kotlin.random.Random

val FourZeroFour = FC<Props> {
    var showsNugget: Boolean by useState(false)

    h1 {
        +"404"
    }
    p {
        setClassName("lead")
        if (Random.nextInt(100) == 0 || showsNugget) {
            if (showsNugget) + "There ya go!"
            else +"Hey, want a nuggie?"
            if (showsNugget) img {
                setClassName("w-50")
                src = "/img/chicken-nugget-spinning.gif"
                alt = "Looks like your browser can't display the nugget :("
            } else button {
                setClassName("btn btn-outline-warning ml-3")
                type = ButtonType.button
                onClick = { showsNugget = true }
                +"Yes"
            }
        } else +randomMessages.random()
    }
    Link {
        to = "/"
        role = AriaRole.button
        setClassName("btn btn-secondary")
        +randomButtons.random()
    }
}

private val randomMessages = listOf(
    "Whoops, looks like you got lost!",
    "Nope, nothing here!",
    "Hmm... there's nothing here!",
    "Are you sure there's no typo in that link?",
    "This doesn't seem right...",
    "Broken link? \uD83D\uDC80",
    "You 404'd hard",
    "Lost the trail",
    "“Where do we go from here? Have we gotten lost?”",
)

private val randomButtons = listOf(
    "Want to go back?",
    "Get me out of here!",
    "Go back to civilisation",
    "It's too lonely here",
    "Return to safety",
    "I am scared",
    "Take me back!",
)
