package behavioral.execute_around

class ScriptLoader private constructor(){
    companion object{
        fun use(usage: () -> Unit) {
            val engine = ScriptLoader()
            try {
                engine.initializeScript { usage() }
            } finally {
                println("Cleaned-up engine resource")
            }
        }
    }

    fun initializeScript(script: () -> Unit) {}
}