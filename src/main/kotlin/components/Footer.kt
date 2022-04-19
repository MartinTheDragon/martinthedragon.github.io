package components

import react.FC
import react.Props
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.footer
import react.dom.html.ReactHTML.p
import setClassName

val Footer = FC<Props> {
    footer {
        id = "footer"
        setClassName("position-absolute bottom-0 w-100 py-2 border-top border-light border-1")
        div {
            setClassName("container")
            div {
                setClassName("row justify-content-center text-center text-white-50")
                p {
                    setClassName("col-4 m-0")
                    +"Copyright © MartinTheDragon 2022"
                }
                p {
                    setClassName("col-4 m-0")
                    +"Website made with "
                    a { href = "https://kotlinlang.org/"; +"Kotlin/JS" }
                    +", "
                    a { href = "https://reactjs.org/"; +"React" }
                    +", "
                    a { href = "https://getbootstrap.com/"; +"Bootstrap" }
                    +" and ❤"
                }
            }
        }
    }
}
