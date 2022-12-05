public class Main {
    public static void main(String[] args) {


        Product product1 = new Product();
        product1.setId(3);
        product1.setName("Hp I5");
        product1.setDetail("8 Gb Ram");
        product1.setDiscount(15);
        product1.setUnitPrice(12000);
        product1.setUnitStock(60);
        System.out.println(product1.getUnitPriceAfterDiscount());

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setDetail("16 Gb Ram");
        product2.setDiscount(25);
        product2.setUnitPrice(16000);
        product2.setUnitStock(25);
        System.out.println(product2.getUnitPriceAfterDiscount());

        Category category1= new Category();
        category1.setId(1);
        category1.setName("İçecek");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Yiyecek");

        System.out.println(category1.getName());
        System.out.println(category2.getName());







    }
}