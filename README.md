# Shinhan GYC


### 1.1 프로그래밍 언어와 자바

고급 언어 ----(컴파일)>----저급 언어

#### 자바
- 애플리케이션, 웹 사이트 개발 등
- 모든 운영체제에서 실행 가능
- 객체지향 프로그래밍: 객체를 만들고 연결해서 프로그램 완성
- 메모리 자동 정리: RAM 자동 관리
- 풍부한 무료 라이브러리: 오픈 소스가 풍부

#### 1.2 운영체제별 JDK 설치
JDK (Java Development Kit)

#### 1.3 운영체제별 환경 변수 설정
운영체제는 프로그램들이 실행하며 사용할 수 있는 값들을 환경 변수 이름으로 관리한다.

#### 1.4 바이트코드 파일과 자바 가상 머신
.java는 텍스트 파일이므로 어떤 텍스트 에디터에서도 작성이 가능

(1) 바이트코드 파일
소스 파일 작성 -> javac 명령어 (컴파일) -> 바이트코드 파일(.class) 생성
*운영체제 상관 없이 동일한 소스 파일을 javac로 컴파일하면 모두 동일한 바이트코드 파일이 생성됨

(2) 자바 가상 머신
.class 파일 - java 명령어(기계어 변역) - 실행
java 명령어는 JVM(Java Virtual Machine) 구동

#### 1.5 소스 작성부터 실행
디렉토리 생성 - 소스파일 생성 - 코드 작성 - 컴파일 - javac 명령어 실행



### 5.6 배열(Array) 
p.167

* 배열은 연속된 공간에 값을 나열시키고, 인덱스를 부여해 놓은 자료구조

> number 배열
> {1, 2, 3, 4, 5}
> 인덱스는 차례대로 number[0], 1, 2, 3, 4

* 배열은 같은 타입의 값만 관리한다,
* 배열의 길이는 늘리거나 줄일 수 없다.

> int intArray[]; 혹은 int[] intArray; / double, String 동일
> 타입[] 변수 = null; 도 가능
> 변수[인덱스] = ㅇ; <- 항목 변경 가능

* 배열 변수를 미리 선언한 후에는 값 목록을 변수에 대입할 수 없음.
* 변수 = new 타입[] {값0, 1, ...};

* 타입[] 변수 = new 타입[길이];
* 변수 = new 타입[길이];
값은 없으나 배열 미리 생성 / 값은 초기값으로 초기화됨 (String은 null, Int는 0 등, boolean은 false가 초기값)

* 배열변수.length; 길이 읽기 -> 값을 변경할 수는 없음

다차원 배열
타입[][] 변수 = {
{값1, 값2} 0인덱스
{값3, 값4} 1인덱스
}

* 값1은 변수[0][0]


## SQL Plus

'''SQL
create user c##osaka(아이디) identified by 1234(비밀번호)
grant connect, resource to c##osaka
grant  // DB 접속 및 객체 생성 권한 부여
grant DBA to c##osaka; // 모든 권한을 부여
exit
'''


### 테이블 만들기
'''SQL
// 소문자로 작성해도 됨!

CREATE TABLE student (
  id   NUMBER PRIMARY KEY,	//유일한 키, number 범위 설정 가능
  name  VARCHAR2(20), 		//valuable character, 20글자 자릿수
  age  NUMBER				
);
'''

* 테이블 확인
'select table_name from user_tables;'

* 테이블 구조 확인
'desc student;'


#### DDL과 DML
* DDL은 데이터 정의어(DB 구조를 만들고, 바꾸고 지우기)
* DML은 데이터 조작어(테이블 안의 데이터를 추가, 수정, 삭제, 조회)


* **PRIMARY KEY**: 테이블에서 각 행을 유일하게 식별하는 컬럼, 중복X, NULL X, 한 테이블에 하나만
* **UNIQUE**: NULL 외 중복 안됨, 여러 컬러 지정 가능, (이메일이나 전화번호 등 고유값)
* **NOT NULL**: 값이 반드시 있어야 함, 필수 입력 컬럼
* **CHECK**: 값이 특정 조건이나 범위에 맞아야 저장 가능
* **FOREIGN KEY**: 다른 테이블의 프라이머리 키와 연결해서 데이터의 관계 유지, 부모 테이블의 값만 입력 가능
* **DEFAULT**: 값을 입력하지 않으면 자동으로 들어가는 기본값, 생략하면 지정된 값으로 자동 입력

'''javascript
CREATE TABLE member (
  id      NUMBER PRIMARY KEY,
  name    VARCHAR2(30) NOT NULL,
  email   VARCHAR2(100) UNIQUE,
  age     NUMBER CHECK (age >= 0 AND age <= 120),
  regdate DATE DEFAULT SYSDATE,
  deptno  NUMBER REFERENCES dept(deptno)
);
'''

* 테이블 지우기

'drop table student;  //세미콜론 잊지 않기'

* 데이터 한 행씩 넣기

'insert into student (id, name, age) values (5, '간장이', 1);'

* 데이터 수정

'update student set age=2 where id=5; // 수정할 값, 조건'

SQL에서는 작은 따옴표를 더 많이 쓴다!
* -- < 주석 처리

'select * from member order by name asc; // 한글도 ㄱㄴㄷ 순으로 정렬됨'


회원 중 가장 나이가 많은/적은 회원의 정보 조회
'''javascript
select * from member where age = (select max(age) from member);
selext * from member where age = (select min(age) from member);
'''