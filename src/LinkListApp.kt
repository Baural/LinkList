object LinkListApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val theList = LinkList()
        theList.insertFisrt(22, 2.99)
        theList.insertFisrt(44, 4.99)
        theList.insertFisrt(66, 6.99)
        theList.insertFisrt(88, 8.99)
        theList.displayList()
        while (!theList.isEmpty) {
            val aLink = theList.deleteFirst()
            print("Delete ")
            aLink!!.displayLink()
        }
        theList.displayList()
    }
}