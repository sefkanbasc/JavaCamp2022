public class workingArea {

    public  void Area(Person person){
         if (person.age >18 && person.experince >6){

             System.out.println("Deneyim açınızdan dolayı yönetici sınavına katılabilirsiniz = " + person.name + "  "+ person.surname);
         }
         else if (person.age > 18 && person.experince >1){

             System.out.println("Deneyim yılınız 6.yılına ulaştıktan sonra yönetici sınavına katılabilirsiniz = " + person.name + " " + person.surname);
         }

         else {

             System.out.println("Maalesef yaş sınırından dolayı iki sınavda başarılı olsanız dahi kabul edilemediniz");
         }
    }

}
