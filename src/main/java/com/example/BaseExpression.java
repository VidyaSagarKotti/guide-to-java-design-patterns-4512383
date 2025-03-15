package com.example;

public class BaseExpression implements Expression {

  Expression nextExpression;

  @Override
  public String interpret(String context) {
    char firstLetter = context.charAt(0);
    if (firstLetter < 'A' || firstLetter > 'Z') {
      nextExpression = new CapitalizeFirstLetter();
      return nextExpression.interpret(context);
    }
    return context;
  }

}