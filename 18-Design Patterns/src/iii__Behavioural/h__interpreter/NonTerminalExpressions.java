package iii__Behavioural.h__interpreter;

public class NonTerminalExpressions {

}


//Step 3: Non-Terminal Expressions (Composite Grammar)


//or
class OrExpression implements Expression {
 private Expression expr1;
 private Expression expr2;

 public OrExpression(Expression expr1, Expression expr2) {
     this.expr1 = expr1;
     this.expr2 = expr2;
 }

 public boolean interpret(String context) {
     return expr1.interpret(context) || expr2.interpret(context);
 }
}




//and
class AndExpression implements Expression {
 private Expression expr1;
 private Expression expr2;

 public AndExpression(Expression expr1, Expression expr2) {
     this.expr1 = expr1;
     this.expr2 = expr2;
 }

 public boolean interpret(String context) {
     return expr1.interpret(context) && expr2.interpret(context);
 }
}





//not
class NotExpression implements Expression {
 private Expression expr;

 public NotExpression(Expression expr) {
     this.expr = expr;
 }

 public boolean interpret(String context) {
     return !expr.interpret(context);
 }
}