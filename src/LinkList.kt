class LinkList {
    private var first: Link? = null
    val isEmpty: Boolean
        get() = first == null

    fun insertFisrt(id: Int, dd: Double) {
        val newLink = Link(id, dd)
        newLink.next = first
        first = newLink
    }

    fun deleteFirst(): Link? {
        val temp = first
        first = first!!.next
        return temp
    }

    fun displayList() {
        println("List (first-->last): ")
        var current = first
        while (current != null) {
            current.displayLink()
            current = current.next
        }
        println("")
    }

}