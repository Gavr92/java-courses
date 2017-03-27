package ru.lesson.lessons;

/*
 * Класс описывает животных
 */
public abstract class Animal implements Pet{
     
     /*Свойство - имя животного*/
     protected String name;
     
     /*Свойство - тип животного*/
     protected final String type;
     
     /*Свойство - возраст животного*/
     protected final int age;
     
     /*
      * Конструктор
      * @param name - имя животного
      * @param age - возраст животного
     */
     protected Animal(String type ,String name, int age){
        this.name = name;
        this.type = type;
        this.age = age;
     }
     
     protected Animal(String type ,String name){
        this.name = name;
        this.type = type;
        this.age = 0;
     }
     
     /*
      *Геттер к свойству age
     */
     public String getName(){
        return this.name;
     }
     
     public void setName(String name){
          this.name = name;
     }
     
     /*
      *Геттер к свойству age
     */
     public int getAge(){
        return this.age;
     }
     
     public String getType(){
        return this.type;
     }
     
}