public class ProductManager {

    public void Control(Product product){

        if(product.getUnitPrice()<100){

            System.out.println("indirim sağlanamaz fiyatı suan çok düşük fiyat = " + " "  + product.getUnitPrice());

        }

        else {
            System.out.println( product.getName() + " "+ " ' de İndirim sağlanabilir");
            System.out.println( product.getName() + " " +  "Sepete eklendi "  + " " +  " Ürünün indirimli hali = " +  product.getUnitPriceAfterDiscount()  );


        }






    }
}
