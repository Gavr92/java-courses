import java.util.ArrayList;
/*
 *Класс для тестирования класса Clinic
 */
public class TestClinic{
    public static void main(String[] args){
        Clinic clinic = new Clinic();
        
        //создадим несколько клиентов
        System.out.println("Добавляем клиента");
        clinic.addClient(new Client("Антон Гавриков", new Cat("Сима")));
        ArrayList<Client> clients = clinic.getClients();
        printClients(clients);
        
        System.out.println("Добавляем клиента 2");
        clinic.addClient(new Client("Магдалена Гаважук", new Dog("Тима")));
        //ArrayList<Client> clients = clinic.getClients();
        printClients(clients);
        
        System.out.println("Добавляем клиента 3");
        clinic.addClient(new Client("Иван Иванов", new Dog("Сима")));
        //ArrayList<Client> clients = clinic.getClients();
        printClients(clients);
        
        System.out.println("Добавляем клиента 4 не должен добавится");
        clinic.addClient(new Client("Антон Гавриков", new Cat("Сима")));
        //ArrayList<Client> clients = clinic.getClients();
        printClients(clients);
        
        //попробуем найти клиента
        System.out.println("Ищем клиента");
        Client anton = clinic.getClientByClientName("Антон Гавриков");
        printClient(anton);
        
        //изменим имя клиента
        System.out.println("Изменим имя клиента");
        clinic.renameClient(anton, "Антонио Гавриков");
        printClient(anton);
        
        //найдем всех клиентов по кличке питомцев
        System.out.println("Найдем клиентов по питомцу");
        ArrayList<Client> clientsByPetName = clinic.getClientByPetName("Сима");
        printClients(clientsByPetName);
        
        System.out.println("Изменим имя питомца");
        clinic.renamePet(anton, "Шифу");
        printClient(anton);
        
        
        System.out.println("Удалим питомца");
        clinic.deletePet(anton);
        printClient(anton);
        
        System.out.println("Удалим клиента");
        clinic.deleteClient(anton);
        printClients(clients);      
    }
    
    public static void printClients(ArrayList<Client> clients){
         for(int i=0; i < clients.size(); i++){
            Client curClient = clients.get(i);
            System.out.println("Клиент " + curClient.getId() + " его питомец " + curClient.getPet().getType() + " по имени " + curClient.getPet().getName());
        }
    }
    
    public static void printClient(Client curClient){
        System.out.println("Найден клиент " + curClient.getId() + " его питомец " + curClient.getPet().getType() + " по имени " + curClient.getPet().getName());
    }
}