package structual.decorator_revisited

class Weapon(vararg decorators: (Weapon) -> Weapon) {
    public var display: (Weapon) -> Weapon = decorators.fold({ this }) { acc, function ->
        { function(acc(it))}
    }

    fun showWeapon(): Weapon {
        return display.invoke(this)
    }
}