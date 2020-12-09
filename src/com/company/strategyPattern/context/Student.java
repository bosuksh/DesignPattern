package com.company.strategyPattern.context;

import com.company.strategyPattern.strategy.Vehicle;

public class Student {
  private Vehicle vehicle;

  public void setVehicle(Vehicle vehicle) {
    //구체적인 전략을 위임받는다.(delegate)
    this.vehicle = vehicle;
  }

  public void goToSchool() {
    System.out.println("집에서 출발한다.");
    if(vehicle == null)
      System.out.println("걸어 간다.");
    else
      vehicle.ride();
    System.out.println("학교에 도착한다.");
    System.out.println();

  }
}
