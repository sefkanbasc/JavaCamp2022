public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new SmsLogger() ,new DatabaseLogger(),new EmailLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer sefkan = new Customer();
        sefkan.setFirstName("Sefkan");

        customerManager.add(sefkan);





    }
}

