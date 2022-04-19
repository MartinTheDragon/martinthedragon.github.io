import components.Footer
import components.Navigation
import pages.About
import pages.Home
import react.FC
import react.Props
import react.create
import react.dom.html.ReactHTML.div
import react.router.Route
import react.router.Routes
import react.router.dom.BrowserRouter

val App = FC<Props> {
    BrowserRouter {
        Navigation {
            links = mapOf(
                "Home" to "/",
                "About" to "/about",
                "Contact" to "/contact",
            )
            current = null
        }
        div {
            setClassName("container")
            Routes {
                Route {
                    path = "/"
                    element = Home.create()
                }
                Route {
                    path = "about"
                    element = About.create()
                }
                Route {
                    path = "*"
                    element = FourZeroFour.create()
                }
            }
        }
        Footer()
    }
}
