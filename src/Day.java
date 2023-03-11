public enum Day {
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота"),
    SUNDAY ("Воскресенье");

    private String dayOfWeek;

    Day(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getRusName() {
        return dayOfWeek;
    }

    public boolean isWeekend() {
        return (getRusName().equals("Суббота") || getRusName().equals("Воскресенье"));
    }

}
