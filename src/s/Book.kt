package s

/**
 * This class defines a s.book.
 *
 *
 * A class in Kotlin can have a primary constructor which is part of the class header.
 */

class book(author: Author) {


    /**
     * Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.
     * During an instance initialization, the initializer blocks are executed in the same order as they
     * appear in the class body, interleaved with the property initializers:
     */
    init {
        println("Create a s.book from : $author")
    }

    /**
     * If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor
     */
    constructor(author : Author,  text: String,  title : String) : this(author){

    }

    /**
     * The content (text) of the s.book.
     * A reference must be explicitly marked as nullable when null value is possible. (therefore the ?)
     */
    var text: String? = null

    /**
     * The title of the s.book.
     */
    var title: String? = null

    /**
     * Prints the contents (the text) of the s.book to the standard output
     */
    fun print(){
        println(text)
    }


}