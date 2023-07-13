public class ProductManager {
    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("Ekleme işlemi tamamlandı.");
        }else{
            System.out.println("Ürün bilgileri geçersizdir.");
        }
    }


}
