package structual.composite

class Directory(private val name: String,
private val fileabls : List<Fileable>) : Fileable {
    override fun read() {
        println("Directory's name $name")
        fileabls.forEach {it.read()}
    }
}