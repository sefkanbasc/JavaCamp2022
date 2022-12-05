public class Main {
    public static void main(String[] args) {
       IndividualCustomer individualCustomer = new IndividualCustomer();
       individualCustomer.customerNumber ="12556";

       CorparateCustomer corparateCustomer = new CorparateCustomer();
       corparateCustomer.customerNumber ="233656";

        CustomerManager customerManager = new CustomerManager();
        Customer[] customers = {individualCustomer,corparateCustomer};


        customerManager.addMultiple(customers);
    }
}