/*
 * Класс, расширяющий класс Animal и реализующий интерфейс Pet
 */

public class Dog extends Animal{
    
    /*Свойство - тип домашнего питомца*/
    //private final String type = "cat";
    
    public Dog(String name, int age){
        super("dog", name, age);
    }
    
    public Dog(String name){
        super("dog", name);
    }
}
