package structual.proxy

class HydraCaseProxy : Case {
    private var hydraCase: HydraCase? = null

    override fun openCase() {
        if(hydraCase == null) hydraCase = HydraCase()
        return hydraCase!!.openCase()
    }
}