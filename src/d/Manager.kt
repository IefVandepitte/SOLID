package d

/**
 * Manager class. Manages only 1 worker for simplicity reasons.
 */
class Manager(worker : IWorker) {

    /**
     * We create a property which holds the worker
     * the manager manages.
     */
    var worker :IWorker

    init {
        this.worker = worker
    }

    /**
     * Manages its worker
     */
    fun manage(){
        worker.work()
    }
}