package com.company.singletonPattern;

public class Main {
  public static void main(String[] args) {
    SystemSpeaker systemSpeaker1 = SystemSpeaker.getInstance();
    SystemSpeaker systemSpeaker2 = SystemSpeaker.getInstance();

    System.out.println(systemSpeaker1.getVolume());
    System.out.println(systemSpeaker2.getVolume());

    //1번 볼륨 업
    systemSpeaker1.volumeUp();
    System.out.println(systemSpeaker1.getVolume());
    System.out.println(systemSpeaker2.getVolume());

    //2번 볼륨 다운
    systemSpeaker2.volumeDown();
    System.out.println(systemSpeaker1.getVolume());
    System.out.println(systemSpeaker2.getVolume());


    System.out.println(systemSpeaker1);
    System.out.println(systemSpeaker2);

  }
}
