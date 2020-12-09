package com.company.strategyPattern.concreteStrategy;

import com.company.strategyPattern.strategy.Vehicle;

public class Bicycle implements Vehicle {

  @Override
  public void ride() {
    System.out.println("자전거를 탄다.");
  }
}
