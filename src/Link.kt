class Link(var iData: Int, var dData: Double) {
    @JvmField
    var next: Link? = null
    fun displayLink() {
        println("{$iData, $dData} ")
    }

}