package com.company.adapterPattern;

import com.company.adapterPattern.adaptee.Benz;
import com.company.adapterPattern.adaptee.Movable;
import com.company.adapterPattern.adapter.KoreanCar;
import com.company.adapterPattern.adapter.MovableAdapter;

public class Main {
  public static void main(String[] args) {
    Movable benz = new Benz();
    MovableAdapter koreanBenz = new KoreanCar(benz);
    System.out.println(benz.getSpeed());
    System.out.println(koreanBenz.getSpeed());

  }
}
