import java.util.Arrays;

public class OOP {

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            this.sayHello();
            cat.sayHello();
        }
    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }


    public static class Human {

        private int age;
        private String name;
        private String secondName;
        private String favoriteSport;

        Human() {
        }

        Human(int age, String name, String secondName, String favoriteSport) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
            this.favoriteSport = favoriteSport;
        }

        Human(int age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }

    }

    public static class Student {
        protected final String studying;
        protected Student(String work) {
            this.studying = work;
        }
        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }
        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }
    public static class JavaStudent extends Student {
        public JavaStudent() {
            super("Прохожу курс по Java");
        }

    }


    public static class LazyStudent extends Student {
        public LazyStudent() {
            super("Сегодня не учусь, мне лень.");
        }

        @Override
        public void study() {
            System.out.println(studying);
        }

        public void notStudy() {
            System.out.println("not study");
        }

    }
    public static void main(String[] args) {
        Human chelik1 = new Human();
        Human chelik2 = new Human(25, "Nigmat", "Nigmatullin");
        Human chelik3 = new Human(1, "Assaf", "Josef", "Golf");


        Student ayusha = new Student();
//        LazyStudent ls = (LazyStudent) ayusha;

//        ls.notStudy();
        char ii = '1';
        char[] iiii = {'a', 'b', 'c', 'd'};
        byte[] bArray = {97, 98, 99, 100, 101, 102};



        String s1 = "Cat";
        String s = "Cat";

        StringBuilder sb = new StringBuilder();
        String s2 = s.toUpperCase();
        s = s1 + s2 + s;
        int a = 65000;
        short by = (short) a;
        System.out.println(by);

//        System.out.println(s.intern() == s2.intern());

//        System.out.println(Arrays.toString(bArray));

//        System.out.println(s == s2);

//        byte by = 127;
        short sh = 32767;

        float piValue = (float)Math.PI;
        double piValueExt = Math.PI;
//        System.out.println("Float value: " + piValue );
//        System.out.println("Double value: " + piValueExt );

        Integer i = null;




    }
}
