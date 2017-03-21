public class Calculate{
    public static void main(String[] args){
        System.out.println("calculate...");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int summ = first + second;
        System.out.println("Сумма " + summ);
        
        int min = first - second;
        System.out.println("Разность " + min);
        
        float deg = first / second;
        System.out.println("Деление " + deg);
        
        int multi = first * second;
        System.out.println("Умножение " + multi);
        
        int exp = 1;
        
        for(int i = 0; i < second; i++){
            exp = first * exp; 
        }
        
        System.out.println("Степень " + exp);
    }
}