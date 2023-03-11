public class Lesson628 {
    public static void main(String[] args) {

    }

    public class Human {
        private final String secret; //секретики
        private final String news; //новости
        private final String experience; //опыт
        private final String gossip; //сплетни

        public Human(String secret, String news, String experience, String gossip) {
            this.secret = secret;
            this.news = news;
            this.experience = experience;
            this.gossip = gossip;
        }

        private String getSecret() {
            return this.secret;
        }

        public String getNews() {
            return this.news;
        }

        String getGossip() {
            return this.gossip;
        }

        protected String getExperience() {
            return this.experience;
        }
    }

    public static boolean isWeekend(String dayName) {

        return (dayName.equals("Sunday") || dayName.equals("Saturday"));
    }

    public static int weekendCount(String[] days) {
        int counter = 0;
        for (String x : days) {
            if (isWeekend(x)) {
                counter++;
            }
        }
        return counter;
    }

    public static int weekdayCount(String[] days) {
        int counter = 0;

        for (String x : days) {
            if (!isWeekend(x)) {
                counter++;
            }
        }
        return counter;
    }

}
