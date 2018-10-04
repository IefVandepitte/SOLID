package d

class Worker(name: String) :IWorker {

    override var name : String = ""

    init {
        this.name = name;
    }

    override fun work(){
        println("$name is working hard!")
    }
}