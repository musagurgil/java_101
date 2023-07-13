public class Main {
    public static void main(String[] args) {
        // Worker örneği
        Worker worker = new Worker();
        worker.work();
        worker.receivePayment();
        worker.eat();
        worker.manage();

        // OutsourceWorker örneği
        OutsourceWorker outsourceWorker = new OutsourceWorker();
        outsourceWorker.work();
        outsourceWorker.receivePayment();

        // Chef örneği
        Chef chef = new Chef();
        chef.work();
        chef.eat();

        // Manager örneği
        Manager manager = new Manager();
        manager.work();
        manager.manage();
    }
}