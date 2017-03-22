/*
 * Класс для выполнения различных математических операций
 */

public class Calculator{
    /*Свойство - результат выполнения операций*/
    private final double result;
    
    /*
     * Функция для выполнения операции сложения
     * @param arg1 - первый аргумент
     * @param arg2 - второй аргумент
     */
    public void sum(int arg1, int arg2){
        this.result = arg1 + arg2;
    }
    
    /*
     * Функция для выполнения операции вычитания
     * @param arg1 - первый аргумент
     * @param arg2 - второй аргумент
     */
    public void min(int arg1, int arg2){
        this.result = arg1 - arg2;
    }
    
    /*
     * Функция для выполнения операции деления
     * @param arg1 - первый аргумент
     * @param arg2 - второй аргумент
     */
    public void deg(int arg1, int arg2){
        this.result = arg1 / arg2;
    }
    
    /*
     * Функция для выполнения операции умножения
     * @param arg1 - первый аргумент
     * @param arg2 - второй аргумент
     */
    public void multi(int arg1, int arg2){
        this.result = arg1 * arg2;
    }
    
    /*
     * Функция для выполнения операции возведения в степень
     * @param arg1 - первый аргумент
     * @param arg2 - степень в которую нужно возвести arg1
     */
    public void exp(int arg1, int arg2){
        int res = 1;
        for(int i = 0; i < arg2; i++){
            res = arg1 * res; 
        }
        this.result = res;
    }
    
    /*
     * Функция для получения результата
     * @return возвращает результат
     */
    public double getResult(){
        return this.result;
    }
    
    /*
     * Функция для очищения результата
     */
    public void clearResult(){
        this.result = 0;
    }
}