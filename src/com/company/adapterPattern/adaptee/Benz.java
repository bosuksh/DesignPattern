package com.company.adapterPattern.adaptee;

public class Benz implements Movable{
  @Override
  public float getSpeed() {
    return 230f;
  }
}
