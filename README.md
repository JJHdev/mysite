1. springBoot만들기. (https://start.spring.io/)

2. 인텔리J IDE 사용할것으로 컨트롤러, thmyleaf test 용 만들고 > 서버연동하여 제대로 작동하는지 확인하기.

3. oracle를 사용하여 프로젝트에 연동하기.
   -. 가장 DBMS중 현재 회사에서 많이 사용하기도 하며, 대용량 DB처리시 용이하여
   -. Oracle 설치하기, SQLDevleloper 설치하기 > 계정 접속하기
   -. gradle설정에서 JPA 설정을 추가하여 라이브러리를 만들어주기
   -. 크게 문제 없이 잘 성공하였지만, 방언 설정시 문제점 발생하였음
      -. 인터넷에 나온대로 방언을 설정하였지만 자꾸 찾지를 못한다. 그리하여 계속 서칭해보니 하이버네이트 최신 기술에서는 spring.jpa.database-platform=org.hibernate.dialect.OracleDialect으로 방언설정으로 해야 오류 뜨지 않는다는 것을 발견하였다.

4. 부트스트랩 사용하기

5. CI-CD 연결

6. docker 이미지 자동화배포 (gitauction을 이용하여 배포시)

7. aws클라우드에 임시로만 배포하기.

8. 로그인 기능 구현하기.

9. 
