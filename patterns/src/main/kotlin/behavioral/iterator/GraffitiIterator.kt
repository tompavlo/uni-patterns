package behavioral.iterator

class GraffitiIterator(private val graffitInventory: GraffitInventory) : Iterator<Graffiti> {

    private var index = -1
    override fun hasNext(): Boolean {
        return index <2
    }

    override fun next(): Graffiti {
        index++;
        return when (index) {
            0 -> {
                graffitInventory.mainGraffiti
            }

            1 -> {
                graffitInventory.winGraffiti
            }

            2 -> {
                graffitInventory.killGraffiti
            }

            else -> throw IndexOutOfBoundsException()
        }
    }
}