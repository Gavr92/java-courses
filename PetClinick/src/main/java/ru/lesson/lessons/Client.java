package ru.lesson.lessons;
/*
 *Класс, описывающий клиента
 */
public class Client{
    
    /*Свойство, содержащее имя и фамилию клиента*/
    private String id;
    
    /*Свойство, содержащее питомца*/
    private Pet pet;
    
    /*
     *Конструктор
     *@param id - имя и фамилия клиента
     *@param pet - питомец
     */
    
    public Client(String id, Pet pet){
        this.id = id;
        this.pet = pet;
    }
    
    /*Геттер имени клиента*/
    public String getId(){
        return id;
    }
    
    /*Геттер питомца*/
    public Pet getPet(){
        return this.pet;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setPet(Pet pet){
        this.pet = pet;
    }
}