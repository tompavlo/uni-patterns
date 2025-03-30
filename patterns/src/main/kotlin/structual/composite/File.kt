package structual.composite

class File(private val text: String) : Fileable {
    override fun read() {
        println(text)
    }
}