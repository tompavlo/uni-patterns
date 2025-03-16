package structual.facade

open class Console {
    public fun open() {}
    public fun write(message: Message) {
        println(message.text)
    }

    public fun close() {}
}