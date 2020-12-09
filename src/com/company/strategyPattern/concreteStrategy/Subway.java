package com.company.strategyPattern.concreteStrategy;

import com.company.strategyPattern.strategy.Vehicle;

public class Subway implements Vehicle {
  @Override
  public void ride() {
    System.out.println("지하철을 탄다.");
  }
}
