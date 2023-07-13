public class DatabaseHelper {
    public static class Crud{ //Create, read, update, delete
        public static void Delete(){
            System.out.println("Silme işlemi gerçekleştirildi.");
        }
        public static void Update(){
            System.out.println("Güncelleştirme işlemi gerçekleştirildi.");
        }
    }
    public static class Connection{
        public static void createConnection(){
        System.out.println("Bağlantı işlemi gerçekleştirildi.");
        }
    }
}
