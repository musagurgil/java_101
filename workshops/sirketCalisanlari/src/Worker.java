public class Worker implements IWorkable, IPayable, IEatable, IManageable {

    @Override
    public void eat() {
        System.out.println("Worker yemek yiyor...");
    }

    @Override
    public void receivePayment() {
        System.out.println("Worker ödemesini alıyor...");
    }

    @Override
    public void work() {
        System.out.println("Worker çalışıyor...");
    }

    @Override
    public void manage() {
        System.out.println("Worker yönetim görevlerini yerine getiriyor...");
    }
}
