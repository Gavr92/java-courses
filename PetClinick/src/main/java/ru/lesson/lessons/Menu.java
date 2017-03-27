package ru.lesson.lessons;

import java.util.ArrayList;
/*
 *Класс для построения меню в консоли для взаимодействия с пользователем
 */
public class Menu{
   
    /*Свойство, содержащее пункты главного меню*/
    private ArrayList<String> mainMenu = new ArrayList<String>();
    
    /*Свойство - выбранный клиент*/
    private Client curClient;
    /*Конструктор. Заполняем пункты меню*/
    public Menu(){
        this.mainMenu.add("Добавить клиента.");
        this.mainMenu.add("Найти клиента по имени.");
        this.mainMenu.add("Найти клиента по имени питомца.");
    }
    
    /*метод для получения меню
     *@return список с пунктами меню
     */
    public ArrayList<String> getMainMenu(){
        if(this.curClient != null){
            System.out.println("Текущий клиент - " + this.curClient.getId() + ", его питомец " + this.curClient.getPet().getName());
        }
        return this.mainMenu;
    }
    
    /*
     *Метод дорисовывает пункты меню, если выбран конкретный клиент
     *@param client - выбранный клиент
     */
    public void setCurClient(Client client){
        if(this.curClient == null){
            this.mainMenu.add("Переименовать клиента.");
            this.mainMenu.add("Переименовать питомца.");
            this.mainMenu.add("Удалить питомца.");
            this.mainMenu.add("Удалить клиента");
        }
        this.curClient = client;
    }
    
    /*
     *метод очищает текущего клиента и чистит меню от пунктов, которые идут ниже чем три основных пункта
     */
    public void clearCurClient(){
        if(this.curClient != null){
            this.curClient = null;
            for(int i = this.mainMenu.size()-1; i > 3; i--){
                this.mainMenu.remove(i);
            }
        }
    }
    
    /*
    Метод возвращает текщего клиента
    @return клиент
    */
    public Client getCurClient(){
        return this.curClient;   
    }
}