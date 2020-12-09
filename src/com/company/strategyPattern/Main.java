package com.company.strategyPattern;

import com.company.strategyPattern.concreteStrategy.Bicycle;
import com.company.strategyPattern.concreteStrategy.Car;
import com.company.strategyPattern.concreteStrategy.Subway;
import com.company.strategyPattern.context.Student;

public class Main {
  public static void main(String[] args) {
    Student student = new Student();
    student.goToSchool();
    //전략으로 자전거를 세팅한다.
    student.setVehicle(new Bicycle());
    student.goToSchool();

    //전략으로 지하철을 세팅한다.
    student.setVehicle(new Subway());
    student.goToSchool();

    //전략으로 자동차를 세팅한다.
    student.setVehicle(new Car());
    student.goToSchool();

  }
}
