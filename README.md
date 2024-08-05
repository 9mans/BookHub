<h1>온라인도서 판매 웹애플리케이션 BookHub 입니다. </h1>
중앙 HTA 아카데미에서 진행한 파이널프로젝트 입니다.

프로젝트명: BookHub<br>
참여인원:  6명<br>
사용 기술:  Java, JS, MySQL, Mybatis, Spring Boot, thymeleaf, AWS EC2, AWS RDS<br>
프로젝트 기간:  2024.04.08 ~ 2024.05.16<br>

**담당역할 및 기능개발**
---
/src/main/bookhub/board package
+ AWS RDS를 이용한 DB 구축
+ CS센터
+ 커뮤니티 게시판
+ 이벤트와 쿠폰생성
+ AWS EC2와 Jenkins를 이용한 배포 
---

**중요포인트와 개선사항**<br>
---
<br>
<h3>- AWS EC2 인스턴스와 Jenkins를 활용한 CI/CD 파이프 라인 구축</h3><br>
<h3>- AWS EC2 인스턴스를 사용한 배포 시 메모리 부족 현상을 방지하기 위한 설정</h3>
      ㅇ swap 메모리 2gb 추가, gradle daemon의 비활성화, jvm 메모리 옵션조정<br>
      ㅇ DB server 분리 AWS RDS를 이용하여 DB 구축
<h3>- Database의 부하 분산을 위한 이중화 설정  </h3><br>
      ㅇ 데이터 누적으로 발생화는 DB의 부하를 분산 시키기 위해 읽기 작업만을위한<br>
      slave DB 생성, master DB에 장애 발생시 승격하여 지속적인 서비스 제공 가능 
<h3>- CS센터의 FAQ 목록 캐싱처리 </h3><br>
<h3>- DTO 클래스를 활용한 반복작업 감소와 유지보수에 용이한 코딩</h3><br>
<h3>- jasypt를 활용한 중요정보 암호화 처리</h3><br>



