package com.company.adapterPattern.adapter;

import com.company.adapterPattern.adaptee.Movable;

public class KoreanCar implements MovableAdapter{
  Movable koreanCar;

  public KoreanCar(Movable car) {
    koreanCar = car;
  }

  @Override
  public float getSpeed() {
    return koreanCar.getSpeed()*1.6f;
  }
}
