package iii__Behavioural.h__interpreter;

public class Main {
    public static void main(String[] args) {
        // Grammar: move AND left
        Expression move = new MoveExpression();
        Expression left = new LeftExpression();
        Expression moveAndLeft = new AndExpression(move, left);

        System.out.println("Interpret 'move left': " + moveAndLeft.interpret("move left"));     // true
        System.out.println("Interpret 'move right': " + moveAndLeft.interpret("move right"));   // false

        // Grammar: NOT move
        Expression notMove = new NotExpression(move);
        System.out.println("Interpret 'jump': " + notMove.interpret("jump"));                   // true
    }
}
