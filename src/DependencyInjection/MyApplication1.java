package DependencyInjection;

public class MyApplication1 {

    private EmailService email = null;

    public MyApplication1(EmailService svc){
        this.email=svc;
    }

    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.email.sendEmail(msg, rec);
    }
}
