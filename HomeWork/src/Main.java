public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1235,25,"Sefkan" , "Basci" , 8);
        Person person2 = new Person(2564,17,"Engin" , "Demiroğ",1);
        Person person3 = new Person(5661,28,"Fatma" , "bozdağ",4);



         Person[] person = {person1,person2,person3};

         System.out.println("Mülakata giren adaylar ");
         System.out.println("------------------------");

         for (Person  p: person){

             System.out.println(p.name + " " + p.surname +  "   " + p.id);

         }
        System.out.println("Mülakat Sonuçları");
        System.out.println("------------------------");

        PersonManager personManager = new PersonManager();
        personManager.Control(person1);
        personManager.Control(person2);
        personManager.Control(person3);

        System.out.println("Yönetici Sınavına Katılma Şartını sağlama Durumu");
        System.out.println("--------------------------");

        workingArea workingarea = new workingArea();
        workingarea.Area(person1);
        workingarea.Area(person2);
        workingarea.Area(person3);




    }
}