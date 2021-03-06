package com.company.factoryMethodPattern.concrete;

import com.company.factoryMethodPattern.framework.Item;
import com.company.factoryMethodPattern.framework.ItemCreator;

import java.util.Date;

public class MpCreator extends ItemCreator {
  @Override
  protected void requestItemInfo() {
    System.out.println("데이터베이스에서 마력 회복 물약의 정보를 가져온다.");
  }

  @Override
  protected void createItemLog() {
    System.out.println("마력 회복 물약을 생성 했습니다. "+ new Date());
  }

  @Override
  protected Item createItem() {
    return new MpPotion();
  }
}
