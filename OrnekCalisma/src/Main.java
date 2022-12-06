import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


         Product product = new Product();
         product.setUnitPrice(100);
         product.setId(25);
         product.setDiscount(15);
         product.setName("Defter");

         ProductManager productManager = new ProductManager();
         productManager.Control(product);

    }
}