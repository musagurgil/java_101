public class OutsourceWorker implements IWorkable, IPayable {
    @Override
    public void receivePayment() {
        System.out.println("OutsourceWorker çalışıyor...");
    }

    @Override
    public void work() {
        System.out.println("OutsourceWorker ödemesini alıyor...");
    }
}
