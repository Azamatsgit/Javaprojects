package Cunstructor;

public class Massage {

    private String body;
    private  String sender;
    private String receiver;

    public Massage(String body) {
        this(body, "Unknown", "Unknown");
        System.out.println("This is 1args constructor");
    }

    public Massage(String body, String receiver) {
        this(body, "Unknown", receiver);

    }


    public String toString() {
        return "Massage{" +
                "body='" + body + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }

    public Massage(){
        this("","Unknown", "Unknown");
    }

    public Massage(String body, String sender, String receiver) {
        this.body = body;
        this.sender = "Unknown";
        this.receiver = "Unknown";


    }

    public String getBody() {

        return body;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }
}
