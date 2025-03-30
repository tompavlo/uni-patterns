package behavioral.iterator

import java.util.*
import java.util.function.Consumer

class GraffitInventory(
    var mainGraffiti: Graffiti,
    var winGraffiti: Graffiti,
    var killGraffiti: Graffiti
) : Iterable<Graffiti> {
    override fun iterator(): Iterator<Graffiti> {
        return GraffitiIterator(this)
    }

}