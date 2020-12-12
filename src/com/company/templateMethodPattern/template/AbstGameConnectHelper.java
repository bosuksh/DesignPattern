package com.company.templateMethodPattern.template;

public abstract class AbstGameConnectHelper {

   protected abstract String doSecurity(String string);
   protected abstract boolean authorization(String id, String password);
   protected abstract int authentication(String userName);
   protected abstract String connection(String info);

   public String requestConnection(String encoded) throws Exception {

      //보안 작업 -> 암호화 된 문자열을 복호화
      String decodedInfo = doSecurity(encoded);

      //decode된 정보로 id, password 가져왔다고 가정
      String id = "aaa";
      String password = "bbb";
      if(!authorization(id, password)) {
         throw new Exception("인증 실패");
      }
      //decode된 정보로 userName 가져왔다고 가정
      String userName = "aaa";
      int level = authentication(userName);
      //레벨별 로직 설정
      switch (level) {
         case 0:
            break;
         case 1:
            break;
         case 2:
            break;
         case 3:
            break;
         default:
            break;
      }
      return connection(decodedInfo);
   }
}
