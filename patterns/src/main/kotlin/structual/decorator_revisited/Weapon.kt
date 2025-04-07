package structual.decorator_revisited

class Weapon(vararg decorators:() -> Unit) {
    public var display: () -> Unit = { decorators.forEach { it.invoke() } }

}