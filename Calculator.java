public class Calculator{
    private double result;
    
    public void sum(int arg1, int arg2){
        result = arg1 + arg2;
    }
    
    public void min(int arg1, int arg2){
        result = arg1 - arg2;
    }
    
    public void deg(int arg1, int arg2){
        result = arg1 / arg2;
    }
    
    public void multi(int arg1, int arg2){
        result = arg1 * arg2;
    }
    
    public void exp(int arg1, int arg2){
        int res = 1;
        for(int i = 0; i < arg2; i++){
            res = arg1 * res; 
        }
        result = res;
    }
    
    public double getResult(){
        return result;
    }
    
    public void clearResult(){
        result = 0;
    }
}