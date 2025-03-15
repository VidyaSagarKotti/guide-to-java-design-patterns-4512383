package com.example;

public class AddDotToEndTheSentence extends BaseExpression {

  @Override
  public String interpret(String context) {
    return context.concat(".");
  }

}