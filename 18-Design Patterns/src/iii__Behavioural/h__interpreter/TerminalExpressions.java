package iii__Behavioural.h__interpreter;

public class TerminalExpressions {

}


//Step 2: Terminal Expressions
class MoveExpression implements Expression {
 public boolean interpret(String context) {
     return context.contains("move");
 }
}

class LeftExpression implements Expression {
 public boolean interpret(String context) {
     return context.contains("left");
 }
}