package MailTest;

public class UntrustworthyMailWorker implements MailService{
    private final MailService[] mailServices;
    private final MailService realMailService;

    public MailService getRealMailService() {
        return realMailService;
    }

    public UntrustworthyMailWorker (MailService[] mailServices) {
        this.mailServices = mailServices;
        this.realMailService = new RealMailService();

    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable temp = mail;
        for (int i = 0; i < mailServices.length; i++) {
            temp = mailServices[i].processMail(temp);
        }

        return realMailService.processMail(temp);
//        ??

//        if (mailServices.length == 0) {
//            return realMailService.processMail(mail);
//        }
//        Sendable current = mailServices[0].processMail(mail);
//        Sendable result = null;
//        for (int i = 1; i < mailServices.length; i++) {
//            result = mailServices[i].processMail(current);
//            current = result;
//        }
//
//        return realMailService.processMail(result);
    }
}
