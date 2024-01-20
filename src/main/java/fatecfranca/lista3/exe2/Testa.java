package fatecfranca.lista3.exe2;

public class Testa {

    public static void main(String[] args) {
        
        Person objPerson1 = new Person ("Josué", "@josuezinho");
        Message objMessage1 = new Message("Olá", objPerson1);
        Message objMessage2 = new Message("Boa noite!", objPerson1);
        
        Forum objForum = new Forum ("de esportes", "http//:forumdeesportes.com");
        objForum.addMessage(objMessage1);
        objForum.addMessage(objMessage2);
        System.out.println(objForum.toString());
        objForum.removeMessage(objMessage1);
        System.out.println(objForum.toString());
    }    
}
