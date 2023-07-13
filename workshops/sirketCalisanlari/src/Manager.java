public class Manager implements IWorkable,IManageable{
    @Override
    public void manage() {
        System.out.println("Manager çalışıyor...");
    }

    @Override
    public void work() {
        System.out.println("Manager yönetim görevlerini yerine getiriyor...");
    }
}
