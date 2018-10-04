package i

/**
 * The Component interface. We can use these components on different flavours of devices.
 */
interface Component : ScreenComponent {

    /**
     * Function to address a mouseOver event
     */
    fun mouseover(event: String)

}