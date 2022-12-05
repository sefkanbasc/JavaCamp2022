public class CustomerManager {
    public void add(Customer customer){

        System.out.println("Müşteri eklendi" +  " " + customer.customerNumber);
    }

    //bulk insert

    public  void addMultiple(Customer[] customers){
        for (Customer customer : customers){
            add(customer);

        }

    }

}





