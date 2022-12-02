public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Lenovo V14",15000,20,"16 GB Ram");  // referans oluşturma , instance
        Product product2 = new Product(2,"Lenovo V15",18000,30,"32 GB RAM");
        Product product3 = new Product(3,"Hp İ5",10000,50,"8 GB RAM");

        /*

       // constructor kullanmadan
        product1.id=1;
        product1.name="Lenovo V14";
        product1.unitPrice=15000 ;
        product1.detail="16 GB Ram";
        product1.unitStock=50;

        Product product2 = new Product();
        product2.id=2;
        product2.name="Lenovo V15";
        product2.unitPrice=18000;
        product2.detail="32 GB Ram";
        product2.unitStock=20;

        Product product3 = new Product();
        product3.id=3;
        product3.name="Hp İ5";
        product3.unitPrice=10000;
        product3.detail="8 GB Ram";
        product3.unitStock=80;
        */




        Product[] products = {product1,product2,product3};
        System.out.println(products.length);

        for (Product product : products){
              System.out.println(product.name + " " +  product.id + " " +  product.unitPrice +" " + product.detail + " " + product.unitStock);
        }


        Category category1 = new Category();
        category1.id =1;
        category1.name ="Bilgisayar";

        Category category2=  new Category();
        category2.id=2;
        category2.name = "Ev/Bahçe";

        Category[] categories = {category1,category2};
        for (Category category:categories){

            System.out.println(category.name + " " + category.id  );
        }

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
    }
}