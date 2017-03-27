package ru.lesson.lessons;

/*
 *Класс для тестирования методов класса Dog и Animal
 */
public class TestDog{
    
    public static void main(String[] args){
        Dog sima = new Dog("Sima", 4);
        checkCat(sima);
        
        Dog bars = new Dog("Bars");
        checkCat(bars);
        
        //Тут ошибка компилятора
        //Cat lol = new Cat();
        //checkCat(lol);
    }
    
    public static void checkCat(Dog dog){
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getType());
        System.out.println("");
    }
}