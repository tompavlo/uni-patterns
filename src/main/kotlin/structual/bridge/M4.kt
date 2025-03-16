package structual.bridge

class M4 : Weapon {
    override fun doTrick() {
        println("flip")
    }

    override fun doCrazyTrick() {
        println("reload-in-air")
    }

    override fun attack() {
        println("Pew-Pew")
    }
}