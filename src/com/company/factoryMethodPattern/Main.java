package com.company.factoryMethodPattern;

import com.company.factoryMethodPattern.concrete.HpCreator;
import com.company.factoryMethodPattern.concrete.MpCreator;
import com.company.factoryMethodPattern.framework.Item;
import com.company.factoryMethodPattern.framework.ItemCreator;

public class Main {
  public static void main(String[] args) {
    ItemCreator creator = new HpCreator();
    Item item = creator.create();
    item.use();

    creator = new MpCreator();
    item = creator.create();
    item.use();
  }
}


