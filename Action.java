import java.util.Scanner;

public class Action{
    
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String first = "";
        String operation = "";
        String second = "";
        double result = 0;
        try{
            Calculator calc = new Calculator();
            String exit = "no";
            boolean errorOperation = false;
            while(!exit.equals("yes")){
                if(!errorOperation){
                    if(first.equals("")){
                        System.out.println("Enter first arg: ");
                        first = reader.next();
                    }
                
                    System.out.println("Enter operation(+, -, /, *, ^): ");
                    operation = reader.next();
                    
                    System.out.println("Enter second arg: ");
                    second = reader.next();
                }
                else{
                   operation = reader.next(); 
                }
                
                if(operation.equals("+")){
                    calc.sum(Integer.valueOf(first), Integer.valueOf(second));
                    result = calc.getResult();
                }
                else if(operation.equals("-")){
                    calc.min(Integer.valueOf(first), Integer.valueOf(second));
                    result = calc.getResult();
                }
                else if(operation.equals("/")){
                    calc.deg(Integer.valueOf(first), Integer.valueOf(second));
                    result = calc.getResult();
                }
                else if(operation.equals("*")){
                    calc.multi(Integer.valueOf(first), Integer.valueOf(second));
                    result = calc.getResult();
                }
                else if(operation.equals("^")){
                    calc.exp(Integer.valueOf(first), Integer.valueOf(second));
                    result = calc.getResult();
                }
                else{
                    System.out.println("Operation undefined. Please try again:");
                    errorOperation = true;
                    continue;
                }
                errorOperation = false;
                System.out.println("Result: " + result);
                
                System.out.println("Clear result?(yes/no)");
                String clearResult = reader.next();
                if(clearResult.equals("yes")){
                   calc.clearResult();
                   first = "";
                }
                else{
                  first = String.valueOf((int)result);
                  System.out.println(first);
                }
                System.out.println("Exit?");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
    
}