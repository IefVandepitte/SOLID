package i

interface TouchComponent : ScreenComponent {
    /**
     * Addressing a touch event
     */
    fun touch(event: String)

    /**
     * Adressing a swipe event
     */
    fun swipe(event: String)
}