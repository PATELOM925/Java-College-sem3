//Passing by returning value
import java.util.*;

Public Change {
        int x, y;
        void var(int a, int b) {
        x = a;
        y = b; }
        int ReturnVal() {
        return x % y;
        }
        
public static void main(String args[]) {
        Change in = new Change();
        in.var(5, 10);
        System.out.println("return :  " + in.ReturnVal());
        } }