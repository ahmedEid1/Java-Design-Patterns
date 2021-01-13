package Behavioral.Interpreter;

public class InterpreterDemo {
    static Expression buildInterpreterTree() {

        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("tigers");
        Expression terminal3 = new TerminalExpression("tigers");

        Expression or = new OrExpression(terminal1, terminal2);
        Expression complex = new AndExpression(or, terminal2);

        return complex;
    }

    public static void main(String[] args) {
        String context = "tigers";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }
}
