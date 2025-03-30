package structual.bridge

class Knife : Weapon {
    override fun doTrick() {
        println("drop hand to hand")
    }

    override fun doCrazyTrick() {
        println("Harakiri")
    }

    override fun attack() {
        println("Cut-cut")
    }
}