package com.company.adapterPattern.adapter;

import com.company.adapterPattern.adaptee.Movable;

public class KoreanCar implements MovableAdapter{
  private Movable koreanCar;

  public KoreanCar(Movable car) {
    koreanCar = car;
  }

  @Override
  public float getSpeed() {
    return koreanCar.getSpeed()*1.6f;
  }
}
