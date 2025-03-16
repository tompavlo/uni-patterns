package structual.flyweight

object ParticleFactory {
    private val particleSet = mutableMapOf<String, ParticleType>()

    fun getParticleType(name: String, texture: String, color: String): ParticleType{
        return particleSet.getOrPut(name){
            ParticleType(name, texture, color)
        }
    }
}