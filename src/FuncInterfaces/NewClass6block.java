package FuncInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

interface NumberGenerator<T extends Number> {
    public boolean cond(T arg);

}
public class NewClass6block {

//1. Копируем в ИДЕЮ пример использования метода из задания в psvm() в Main, делаем импорты, которые просит ИДЕЯ.
//2. За пределами psvm создаем копируем метод из окошка где пишем решение, добавив static (его и в решении надо добавить)
//3. Пишем как в прошлой задаче return и лямбда выражение с тенарным оператором.
//Лямбда выглядит так x-> названиеПредиката.методПредиката(х) ? названиеФункцПриТру.метод(х) : названиеФункцПриФолс(х);

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }


    public static NumberGenerator<? super Number> getGenerator() {
        NumberGenerator<? super Number> numberGenerator = x -> x.intValue() > 0;
        System.out.println(numberGenerator.cond(0));
        return numberGenerator;
    }
    public static UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }



    public static void main(String[] args) {
        getGenerator();
        UnaryOperator<Integer> unaryOperator = x -> (x * x);
        System.out.println(sqrt());

    }
}
