package com.example;

import java.beans.Expression;

public class CapitalizeFirstLetter extends BaseExpression {

  public CapitalizeFirstLetter() {
    nextExpression = new AddDotToEndTheSentence();
  }

  @Override
  public String interpret(String context) {
    String firstLetter = context.substring(0, 1);
    context = context.replaceFirst(firstLetter, firstLetter.toUpperCase());
    if (!context.endsWith(".")) {
      return nextExpression.interpret(context);
    }
    return context;
  }

}