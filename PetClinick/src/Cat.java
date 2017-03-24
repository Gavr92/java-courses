/*
 * Класс, расширяющий класс Animal и реализующий интерфейс Pet
 */

public class Cat extends Animal{
    
    /*Свойство - тип домашнего питомца*/
    //private final String type = "cat";
    
    public Cat(String name, int age){
        super("cat", name, age);
    }
    
    public Cat(String name){
        super("cat", name);
    }
}