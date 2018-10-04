package i

class DesktopComponent : Component {

    override fun mouseover(event: String) {
        println("Mouse click Event Fired")

    }

    // No longer necessary
//
//     fun touch(event: String) {
//        throw UnsupportedOperationException("touch not supported the screen is not supported")
//
//
//    }
//
//    fun swipe(event: String) {
//        throw UnsupportedOperationException("swipe not supported")
//
//
//    }

    override fun validate() {
        println("All UI i valid")

    }

}