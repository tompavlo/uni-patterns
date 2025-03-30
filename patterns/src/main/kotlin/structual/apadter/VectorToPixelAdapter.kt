package structual.apadter

class VectorToPixelAdapter : TextureRender() {
    fun convertToPixel(vectorTexture: VectorTexture) = PixelTexture()


    fun render(vectorTexture: VectorTexture){
       super.render(convertToPixel(vectorTexture))
    }
}