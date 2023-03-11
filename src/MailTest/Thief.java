package MailTest;

public class Thief implements MailService{

    private int minPrice;
    private int stolenValue = 0;

    public Thief (int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {

        if (mail instanceof MailPackage) {
            Package mailContent = ((MailPackage) mail).getContent();
            if (mailContent.getPrice() >= minPrice) {
                stolenValue += mailContent.getPrice();
                Package newPackage = new Package("stones instead of " + mailContent.getContent(), 0);
                return new MailPackage(mail.getFrom(), mail.getTo(), newPackage);
            }
        }
        return mail;
    }
}
