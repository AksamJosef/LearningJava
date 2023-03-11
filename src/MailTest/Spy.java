package MailTest;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService{
    public static final String AUSTIN_POWERS = "Austin Powers";

    private Logger LOGGER = null; //= Logger.getLogger(Spy.class.getName());

    public Spy (Logger logger) {
        this.LOGGER = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo().equals(AUSTIN_POWERS)) {
                LOGGER.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                        new Object[] {mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()});

            } else {
                LOGGER.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[] {mail.getFrom(), mail.getTo()});
            }
        }
        return mail;
    }
}
