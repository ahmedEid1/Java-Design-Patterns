package Behavioral.Interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer st = new StringTokenizer(context);
        while (st.hasMoreTokens()){
            String test = st.nextToken();
            if (test.equals(data)){
                return true;
            }
        }
        return false;
    }
}
