import csstype.ClassName
import react.PropsWithClassName

fun PropsWithClassName.setClassName(name: String) {
    className = ClassName(name)
}
