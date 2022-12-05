public class LoggerManager {


    public void  log(int LogType){

        if (LogType ==1){
            System.out.println("Veritabanına Loglandı");
        }
        else if (LogType==2) {
            System.out.println("Dosyaya Bağlandı");
        }
        else {
            System.out.println("Email gönderidi");
        }
    }
}
