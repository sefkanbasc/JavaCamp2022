public class PersonManager {


    public  void Control(Person person){

        if (person.age >18){

            System.out.println( person.name +  " " + person.surname + " "  + "İşe alınabilir");
        }
        else {

            System.out.println(  person.name + " " + person.surname + " "  + "Yaş Sınırı altındasınız işe alınmanız Mümkün değil");
        }


    }
}
