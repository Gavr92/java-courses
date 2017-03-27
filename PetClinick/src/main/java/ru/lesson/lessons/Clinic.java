package ru.lesson.lessons;

import java.util.ArrayList;
/*
 *Класс поликлиники для хранения клиентов
 */
public class Clinic{
    
    /*Свойство содержит клиентов поликлиники*/
    private ArrayList<Client> clients = new ArrayList<Client>();
    
    /*
     *Метод для добавления клиентов в клинику
     *@param client - client
     *@return false, если клиент с таким именем уже есть в поликлинике
     *@return true, если клиент успешно добавлен
     */
    public boolean addClient(Client client){
        //тут можно прикрутить сортировку, и далее искать бинарным поиском клиента. Пока оставим перебор.
        boolean addClientSuccess = true;
        if (checkUniquenessIdClient(client.getId())){
            this.clients.add(client);
        }
        else{
            addClientSuccess = false;
        }
        return addClientSuccess;
    }
    
    /*
     *Поиск клиента по его имени
     *@param name - имя клиента
     *@return пустой объект client, если клиент не найден. Иначе вернет не пустой объект client
     */
    public Client getClientByClientName(String name){
        Client сlient = new Client("empty", new EmptyPet());
        for (Client item : this.clients) {
           if(item.getId().equals(name)){
                сlient = item;
           }
        }
        return сlient;
    }
    /*
     *Поиск клиента по имени его питомца
     *@param name - имя питомца
     *@return массив с клиентами, у которых есть питомцы с данными кличками.
     */
    public ArrayList<Client> getClientByPetName(String name){
        //Пока пойдем перебором по клиентам. В БУДУЩЕМ ИЗМЕНИТЬ НА КОРРЕТНЫЕ АЛГОРИТМЫ!!!
        ArrayList<Client> resClients = new ArrayList<Client>();
        for (Client item : this.clients) {
           if(item.getPet().getName().equals(name)){
                resClients.add(item);
           }
        }
        return resClients;
    }
    
    /*
     *Метод для удаления клиента из массива clients
     *@param client - клиент, которого нужно удалить из списка clients
     */
    public void deleteClient(Client client){
        this.clients.remove(client);
    }
    
    /*
     *Метод для переименования(изменения id) клиента
     *@param client - клиент которого небходимо переименовать
     *@param newId - новый id(имя) клиента
     *@return true - если клиент переименован, false - если клиент с таким id(именем) существует
     */
    public boolean renameClient(Client client, String newId){
        //Проверим нет ли нового имени клиента в списке clients
        boolean renameSuccess = false;
        if(checkUniquenessIdClient(newId)){
            client.setId(newId);
            renameSuccess = true;
        }
        return renameSuccess;
    }
    
    /*
     *Метод для удаленияя питомца у клиента(в свойство клиента Pet помещает не null, а специальный объект)
     *@param client - клиент
     */
    public void deletePet(Client client){
        //Pet emptyPet = new EmptyPet();
        client.setPet(new EmptyPet());
        
    }
    
    /*
     *Метод для переименования питомца у клиента
     *@param client - клиент
     */
    public void renamePet(Client client, String newName){
        Pet pet = client.getPet();
        if (!pet.getType().equals("empty")){ //если у клиента есть питомец 
            pet.setName(newName);
        }
    }
    
    /*
     *Метод для проверки уникальности имени клиента в массиве clients
     *@return true - если имя уникально
     *@return false - если имя не уникально
     */
    private boolean checkUniquenessIdClient(String Id){
        boolean UniquenessId = true;
        for(int i = 0; i < this.clients.size(); i++){ // ищем в массиве имена, если клиент уже есть, не дублируем его
            if(this.clients.get(i).getId().equals(Id)){
                 UniquenessId = false;
                 break;
            }
        }
        return UniquenessId;
    }
    
    /*
     *Метод для получения текущего списка клиентов
     *@return возвращает список текущих клиентов клиники
     */
    public ArrayList<Client> getClients(){
        return this.clients;
    }
}