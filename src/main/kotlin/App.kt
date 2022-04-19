import components.Footer
import components.Navigation
import csstype.Flex
import csstype.FlexBasis
import csstype.FlexGrow
import csstype.FlexShrink
import emotion.react.css
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
        div {
            css {
                flex = Flex("1".unsafeCast<FlexGrow>(), "0".unsafeCast<FlexShrink>(), "auto".unsafeCast<FlexBasis>())
            }
            div {
                setClassName("container")
                Navigation {
                    links = mapOf(
                        "Home" to "/",
                        "About" to "/about",
                        "Contact" to "/contact",
                    )
                    current = null
                }
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
        }
        Footer()
    }
}
