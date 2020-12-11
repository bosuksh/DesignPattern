package com.company.templateMethodPattern;

import com.company.templateMethodPattern.template.AbstGameConnectHelper;
import com.company.templateMethodPattern.template.DefaultGameConnectionHelper;

public class Main {
  public static void main(String[] args) throws Exception {
    AbstGameConnectHelper helper = new DefaultGameConnectionHelper();

    helper.requestConnection("접속 정보");
  }
}
