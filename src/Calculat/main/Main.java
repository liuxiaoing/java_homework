package main;
public class Main {
    public int add(int op1, int op2){
        return op1+op2;
    }
    public int sub(int op1,int op2){
        return op1-op2;
    }
    public int mul(int op1,int op2){
        return op1*op2;
    }
    public int div(int op1,int op2){
        if(op2!=0)return op1/op2;
        return 0;
    }
    public int exp(int op1,int op2){
        int answer = op1;
        for (int i = 1; i < op2; i++) {
            answer=answer*op1;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}