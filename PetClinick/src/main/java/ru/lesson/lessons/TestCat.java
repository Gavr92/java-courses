package ru.lesson.lessons;

/*
 *Класс для тестирования методов класса Cat и Animal
 */
public class TestCat{
    
    public static void main(String[] args){
        Pet sima = new Cat("Sima", 4);
        checkCat(sima);
        
        Pet bars = new Cat("Bars");
        checkCat(bars);
        
        //Тут ошибка компилятора
        //Cat lol = new Cat();
        //checkCat(lol);
    }
    
    public static void checkCat(Pet cat){
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getType());
        System.out.println("");
    }
}