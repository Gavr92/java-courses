/*
 *Класс-заглушка, описывает отсутствие питомца у клиента
 */
public class EmptyPet implements Pet{
    
    /*Свойство - тип питомца. В данном случае питомца нет*/
    private final String type = "empty";
    
    /*Свойство - имя питомца. В данном случае пустое*/
    private String name = "empty";
    
    /*Свойство - возраст питомца. В данном случае 0*/
    private final int age = 0;
    
    public String getType(){
        return this.type;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setName(String name){
        this.name = name;
    }

}