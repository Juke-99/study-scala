class SideEffectCode {
    // def purchaseMusic(price: Price): Music = {
    //     val music = new Music()
    //     price.charge(price.point)
    //     music
    // }

    def purchaseMusic(price: Price): (Music, Point) {
        val music = new Music()
        (music, Point(price, music.point))
    }
}