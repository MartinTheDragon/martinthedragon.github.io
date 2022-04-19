package components

import react.FC
import react.Props
import react.dom.aria.ariaControls
import react.dom.aria.ariaExpanded
import react.dom.aria.ariaLabel
import react.dom.html.ButtonType
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.span
import react.dom.html.ReactHTML.ul
import react.router.dom.NavLink
import setClassName

val Navigation = FC<NavigationProps> { props ->
    nav {
        setClassName("navbar navbar-expand-lg fixed-top navbar-dark bg-primary")
        div {
            setClassName("container")
            NavLink {
                setClassName("navbar-brand")
                to = "/"
                +"MartinTheDragon"
            }
            button {
                setClassName("navbar-toggler")
                type = ButtonType.button
                asDynamic()["data-bs-toggle"] = "collapse"
                asDynamic()["data-bs-target"] = "#navbarColor01"
                ariaControls = "navbarColor01"
                ariaExpanded = false
                ariaLabel = "Toggle navigation"
                span {
                    setClassName("navbar-toggler-icon")
                }
            }
            div {
                setClassName("navbar-collapse collapse")
                id = "navbarColor01"
                ul {
                    setClassName("navbar-nav me-auto mb-2 mb-lg-0")
                    for ((name, link) in props.links) li {
                        setClassName("nav-item")
                        NavLink {
                            setClassName("nav-link${if (props.current == name) " active" else ""}")
                            to = link
                            +name
                            if (props.current == name) span {
                                setClassName("visually-hidden")
                                +"(current)"
                            }
                        }
                    }
                }
            }
        }
    }
}

external interface NavigationProps : Props {
    var links: Map<String, String>
    var current: String?
}
