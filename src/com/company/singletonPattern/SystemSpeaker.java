package com.company.singletonPattern;

public class SystemSpeaker {
  private static SystemSpeaker instance;
  private int volume;

  private SystemSpeaker() {
    volume = 5;
  }

  public static SystemSpeaker getInstance() {
    if(instance == null) {
      instance = new SystemSpeaker();
    }

    return instance;
  }

  public int getVolume() {
    return volume;
  }

  public void volumeUp() {
    volume++;
  }
  public void volumeDown() {
    if(volume > 0)
      volume--;
  }
}
