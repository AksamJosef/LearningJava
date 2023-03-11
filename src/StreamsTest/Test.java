package StreamsTest;

import org.w3c.dom.Node;

//import java.lang.foreign.Linker;
import java.util.*;
import java.util.function.Consumer;

public class Test {

    public static interface Sendable<T> {
        String getFrom();
        String getTo();
        T getContent();
    }

    public static class SendableClass<T> implements Sendable<T> {
        private String from, to;
        private T content;

        public SendableClass(String from, String to, T content) {
            this.from = from;
            this.to = to;
            this.content = content;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public T getContent() {
            return content;
        }
    }



    public static class MailMessage extends SendableClass<String> {
        private String from;
        private String to;
        private String content;

        public MailMessage(String from, String to, String content) {
            super(from, to, content);
        }

        public String getFrom() {
            return super.getFrom();
        }


        public String getTo() {
            return super.getTo();
        }

        public String getContent() {
            return super.getContent();
        }

    }

    public static class Salary extends SendableClass<Integer> {
        private String from;
        private String to;
        private Integer salary;

        public Salary(String from, String to, Integer salary) {
            super(from, to, salary);
        }

        public String getTo() {
            return super.getTo();
        }

        public String getFrom() {
            return super.getFrom();
        }

        public Integer getSalary() {
            return super.getContent();
        }


    }



    public static class MailService <T> implements Consumer<Sendable<T>>{


        private Map<String, List<T>> mailBox = new HashMap<>() {
            @Override
            public List<T> get(Object key) {
                return (super.get(key) == null) ? Collections.emptyList() : super.get(key);
//                if (mailBox.get(key) == null) {
////                    List<T> value = Collections.emptyList();
////                    put((String) key, value);
//                    return Collections.emptyList();
//
//                }
//                return super.get(key);//Collections.emptyList();
            }
        };

        public Map<String, List<T>> getMailBox() {
            return mailBox;

        }


        @Override
        public void accept(Sendable<T> sendable) {
            if (mailBox.containsKey(sendable.getTo())) {
                List<T> list = mailBox.get(sendable.getTo());
                list.add(sendable.getContent());
                mailBox.put(sendable.getTo(), list);
            } else {
                List<T> list = new ArrayList<>();
                list.add(sendable.getContent());
                mailBox.put(sendable.getTo(), list);
            }

//            mailBox.computeIfAbsent(sendableClass.getTo(), b -> Collections.singletonList(sendableClass.getContent()));
//            if (mailBox.containsKey(sendableClass.getTo())) {
//                List<T> values = mailBox.get(sendableClass.getTo());
//                values.add(sendableClass.getContent());
//                mailBox.put(sendableClass.getTo(), values);
//            } else {
//                List<T> values = new LinkedList<>();
//                mailBox.put(sendableClass.getTo(), values);
//            }

        }
    }

    public static void main(String[] args) {
//        // Random variables
//
//        String randomFrom = "..."; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
//        String randomTo = "...";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
//        int randomSalary = 100;  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.
//
//        // Создание списка из трех почтовых сообщений.
//        MailMessage firstMessage = new MailMessage(
//                "Robert Howard",
//                "H.P. Lovecraft",
//                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
//        );
//
//        assert firstMessage.getFrom().equals("Robert Howard"): "Wrong firstMessage from address";
//        assert firstMessage.getTo().equals("H.P. Lovecraft"): "Wrong firstMessage to address";
//        assert firstMessage.getContent().endsWith("Howard!"): "Wrong firstMessage content ending";
//
//        MailMessage secondMessage = new MailMessage(
//                "Jonathan Nolan",
//                "Christopher Nolan",
//                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
//        );
//
//        MailMessage thirdMessage = new MailMessage(
//                "Stephen Hawking",
//                "Christopher Nolan",
//                "Я так и не понял Интерстеллар."
//        );
//
//        List<MailMessage> messages = Arrays.asList(
//                firstMessage, secondMessage, thirdMessage
//        );
//
//// Создание почтового сервиса.
//        MailService<String> mailService = new MailService<>();
//
//// Обработка списка писем почтовым сервисом
//        messages.stream().forEachOrdered(mailService);
//
//// Получение и проверка словаря "почтового ящика",
////   где по получателю можно получить список сообщений, которые были ему отправлены
//        Map<String, List<String>> mailBox = mailService.getMailBox();
//
//        assert mailBox.get("H.P. Lovecraft").equals(
//                Arrays.asList(
//                        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
//                )
//        ): "wrong mailService mailbox content (1)";
//
//        assert mailBox.get("Christopher Nolan").equals(
//                Arrays.asList(
//                        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
//                        "Я так и не понял Интерстеллар."
//                )
//        ): "wrong mailService mailbox content (2)";
//
//        assert mailBox.get(randomTo).equals(Collections.<String>emptyList()): "wrong mailService mailbox content (3)";
//
//
//// Создание списка из трех зарплат.
//        Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
//        Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
//        Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);
//
//// Создание почтового сервиса, обрабатывающего зарплаты.
//        MailService<Integer> salaryService = new MailService<>();
//
//// Обработка списка зарплат почтовым сервисом
//        Arrays.asList(salary1, salary2, salary3).forEach(salaryService);
//
//// Получение и проверка словаря "почтового ящика",
////   где по получателю можно получить список зарплат, которые были ему отправлены.
//        Map<String, List<Integer>> salaries = salaryService.getMailBox();
//        assert salaries.get(salary1.getTo()).equals(Arrays.asList(1)): "wrong salaries mailbox content (1)";
//        assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)): "wrong salaries mailbox content (2)";
//        assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)): "wrong salaries mailbox content (3)";
    }
}
