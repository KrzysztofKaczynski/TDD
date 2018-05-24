public class NotificationService {
    private EmailService emailService;
    private PigeonService pigeonService;

    public NotificationService(EmailService emailService, PigeonService pigeonService) {
        this.emailService = emailService;
        this.pigeonService = pigeonService;
    }
    public void sendNotifacation(){
        if (emailService.isAvailable()){
            emailService.sendEmail("Email");
        }else if (pigeonService.isAvailable()){
            pigeonService.sendMessage("Message");

        }

    }
}
