package com.company.factoryMethodPattern.concrete;

import com.company.factoryMethodPattern.framework.Item;

public class MpPotion implements Item {
  @Override
  public void use() {
    System.out.println("마력 회복");
  }
}
