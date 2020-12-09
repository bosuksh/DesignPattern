package com.company.strategyPattern.concreteStrategy;

import com.company.strategyPattern.strategy.Vehicle;

public class Car implements Vehicle {
  @Override
  public void ride() {
    System.out.println("자동차를 탄다.");
  }
}
