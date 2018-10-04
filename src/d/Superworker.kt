package d

class Superworker(name: String) : IWorker {

    override var name : String = ""

    init {
        this.name = name
    }

    override fun work(){
        println("$name is doing awesome superwork")
    }
}