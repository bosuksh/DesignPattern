package com.company.factoryMethodPattern.framework;

public abstract class ItemCreator {

  //팩토리 메소드 (템플릭 메소드 패턴처럼 사용)
  public Item create() {
    //아이템 정보 가져오기
    requestItemInfo();
    //아이템 생성
    Item item = createItem();
    //로그 찍기
    createItemLog();
    return item;
  }
  //아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청
  protected abstract void requestItemInfo();
  //아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터 베이스에 아이템을 생성
  protected abstract void createItemLog();
  //아이템을 생성하는 알고리즘
  protected abstract Item createItem();
}
