# commit 방식

본인이름 날짜 본인이 추가한 내용 순서로 작성<br>
ex) 홍길동 2024-03-19 로그인페이지ui추가


# git 명령어 
- `git init` : git을 시작한다는 것을 의미하는 명령어
- `git config —global —list` : 현재 git에 설정된 설정요소(처음에 설정 하는것들)를 보는 명령어
- `git add .` :  현재 프로젝트를 git에 저장시키는 명령어
- `git commit -m ‘버전의 이름’` : 현재 프로젝트를 git에 버전이름을 설정해서 commit하는 명령어
- `git remote add origin ‘해당 github프로젝트 url’` : origin이라는 이름으로 해당 github프로젝트를 원격(remote)으로 조정하겠다는 명령어 → origin은 다른 이름으로 변경가능
- `git push origin master` : 해당 github에 master라는 branch에 올리는 명령어
- `git clone (github에서 프로젝트의 주소)` : 해당 github의 주소에 해당하는 프로젝트를 다운로드해오는 명령어


# 오라클 연동 방법
<!--	오라클 연동 시작	-->
			<dependency>
				<groupId>com.oracle.database.jdbc</groupId>
				<artifactId>ojdbc11</artifactId>
				<version>23.2.0.0</version>
			</dependency>
			<dependency>
				<groupId>commons-dbcp</groupId>
				<artifactId>commons-dbcp</artifactId>
				<version>1.3</version>
			</dependency>
			<dependency>
				<groupId>org.projectlombok</groupId>
				<artifactId>lombok</artifactId>
				<version>1.18.30</version>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>junit</groupId>
				<artifactId>junit</artifactId>
				<version>4.12</version>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>org.jline</groupId>
				<artifactId>jline</artifactId>
				<version>3.1.3</version>
			</dependency>
			<dependency>
				<groupId>log4j</groupId>
				<artifactId>log4j</artifactId>
				<version>1.2.17</version>
			</dependency>
		<!--  오라클 연동 끝	-->
추가를 한다.
src/test/java/com/snakeproject/com.project.SnakeProject 밑에 TestJava.java 파일에 최종적으로 연동하는 클래스

- 연동하려는 아이다와 비밀번호는 본인 환경에 맞춰서 수정 후 테스트
