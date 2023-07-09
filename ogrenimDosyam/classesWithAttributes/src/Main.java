public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "HP Laptop", 10000, 25);

       /* product.setId(1);
        product.setName("Laptop");
        product.setDescription("HP Laptop");
        product.setPrice(1000);
        product.setStockAmount(100);*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.get_code());


    }
}