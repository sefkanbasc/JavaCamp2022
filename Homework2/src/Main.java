public class Main {
    public static void main(String[] args) {
       User user = new User();
       user.setId(256);
       user.setName("Sefkan");
       user.setLastName("Basci");

       UserManager userManager = new UserManager();
       userManager.addUser(user);

       Student student = new Student();
       student.setId(522);
       student.setName("Melik");
       student.setLastName("Basci");
       student.setUniversty("Karabük");

       StudentManager studentManager = new StudentManager();
       studentManager.addLesson(student);

       Instructor instructor = new Instructor();
       instructor.setId(2356);
       instructor.setName("İzzet");
       instructor.setLastName("Atılgan");
       instructor.setBranch("Fizik");

       InstructorManager instructorManager = new InstructorManager();
       instructorManager.addBranch(instructor);




    }
}