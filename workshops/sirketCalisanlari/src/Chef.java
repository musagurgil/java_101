public class Chef implements IWorkable, IEatable {
    @Override
    public void eat() {
        System.out.println("Chef çalışıyor...");
    }

    @Override
    public void work() {
        System.out.println("Chef yemek yiyor...");
    }
}
