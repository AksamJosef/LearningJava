package MailTest;

import java.security.spec.ECFieldF2m;

public class Inspector implements MailService{

    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static class IllegalPackageException extends Exception {
        public IllegalPackageException(){
            super("IllegalPackageException");
        }
    }
    public static class StolenPackageException extends Exception {
        public StolenPackageException() {
            super("StolenPackageException");
        }
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            Package mailContent = ((MailPackage) mail).getContent();
            if (mailContent.getContent().equals("stones")) {
                try {
                    throw new StolenPackageException();
                } catch (StolenPackageException e) {
                    throw new RuntimeException(e);
                }
            }

            if (mailContent.getContent().contains(WEAPONS) || mailContent.getContent().equals(BANNED_SUBSTANCE) ) {
                try {
                    throw new IllegalPackageException();
                } catch (IllegalPackageException ignored) {
                }
            }
        }
        return mail;
    }
}
