package ru.lesson.lessons;

import java.util.*;

/*
 *Класс для тестирования Menu
 */

public class TestMenu{
    
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Clinic clinic = new Clinic();
        Client client = null;
        Menu menu = new Menu();
        String input = "";
        String exit = "no";
        try{
            while(!exit.equals("yes")){
                //ArrayList<String> menu = new Menu();
                showMenu(menu);
                input = reader.next();
                switch(Integer.valueOf(input)){
                    case 0: // добавляем клиента
                        System.out.println("Введите имя и фамилию клиента");
                        input = reader.next();
                        String name = input;
                        System.out.println("Питомец клиента кошка или собака?");
                        Pet pet = new EmptyPet();
                        input = reader.next();
                        try{
                            Thread.sleep(10000);
                        }
                         catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        while(!input.equals("кошка") && !input.equals("собака")){
                            System.out.println("Неизвестный тип питомца, введите кошка или собака.");
                            input = reader.next();
                        }
                        if(input.equals("кошка")){
                            System.out.println("Введите имя питомца");
                            input = reader.next();
                            pet = new Cat(input);
                        }
                        else{
                            System.out.println("Введите имя питомца");
                            input = reader.next();
                            pet = new Dog(input);
                        }
                        client = new Client(name, pet);
                        clinic.addClient(client);
                        menu.setCurClient(client);
                        break;
                    case 1:
                        System.out.println("Введите имя клиента для поиска");
                        input = reader.next();
                        client = clinic.getClientByClientName(input);
                        if(!client.getId().equals("empty")){//проверка на заглушку
                            menu.setCurClient(client);
                        }
                        break;
                    case 2:
                        System.out.println("Введите имя питомца для поиска клиента");
                        input = reader.next();
                        ArrayList<Client> clients = clinic.getClientByPetName(input);
                        if(clients.size() == 0){
                            System.out.println("Не найдено клиентов, у которых есть питомец с таким именем");
                        }
                        else if(clients.size() == 1){
                            menu.setCurClient(client);
                        }
                        System.out.println("Список клиентов с питомцем по имени " + input);
                        for(int i = 0; i < clients.size(); i++){
                            System.out.println(i + " " + clients.get(i).getId());
                        }
                        System.out.println("Введите номер нужного клиента");
                        input = reader.next();
                        menu.setCurClient(clients.get(Integer.valueOf(input)));
                        break;
                    case 3:
                        if(menu.getCurClient() != null){
                            System.out.println("Введите новое имя клиента");
                            input = reader.next();
                            clinic.renameClient(menu.getCurClient(), input);
                        }
                        break;
                    case 4:
                        if(menu.getCurClient() != null){
                            System.out.println("Введите новое имя питомца");
                            input = reader.next();
                            clinic.renamePet(menu.getCurClient(), input);
                        }
                        break;
                    case 5:
                        if(menu.getCurClient() != null){
                            clinic.deletePet(menu.getCurClient());
                        }
                        break;
                    case 6:
                        if(menu.getCurClient() != null){
                            clinic.deleteClient(menu.getCurClient());
                            menu.clearCurClient();
                        }
                        break;
                    default:
                        System.out.println("Введена некорректная команда");
                        break;
                }
                //showMenu(menu);
            }
            
        }
        finally{
            reader.close();
        }
    }
    
    public static void showMenu(Menu menu){
        ArrayList<String> arrMenu =  menu.getMainMenu();
        for(int i = 0; i < arrMenu.size(); i++){
            System.out.println(i + " " + arrMenu.get(i));
        }
    }
}