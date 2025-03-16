package structual.proxy

class HydraCase : Case {
    fun loadSkins(){}

    fun calculatePattern(){}

    fun calculateFloat(){}

    fun calculateSkin(){}

    constructor(){
        loadSkins()
        calculateFloat()
        calculatePattern()
        calculateSkin()
    }

    override fun openCase() {
        println("some weapon skin")
    }
}