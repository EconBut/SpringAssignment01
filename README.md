# SpringAssignment01
# StudySpring2

# 요구사항
1. 아래의 요구사항을 기반으로 Use Case 그려보기
    - 손으로 그려도 됩니다.
    - cf. [https://narup.tistory.com/70](https://narup.tistory.com/70)
2. 전체 게시글 목록 조회 API
    - 제목, 작성자명, 작성 내용, 작성 날짜를 조회하기
    - 작성 날짜 기 내림차순으로 정렬하기
3. 게시글 작성 API
    - 제목, 작성자명, 비밀번호, 작성 내용을 저장하고
    - 저장된 게시글을 Client 로 반환하기
4. 선택한 게시글 조회 API
    - 선택한 게시글의 제목, 작성자명, 작성 날짜, 작성 내용을 조회하기 
    (검색 기능이 아닙니다. 간단한 게시글 조회만 구현해주세요.)
5. 선택한 게시글 수정 API
    - 수정을 요청할 때 수정할 데이터와 비밀번호를 같이 보내서 서버에서 비밀번호 일치 여부를 확인 한 후
    - 제목, 작성자명, 작성 내용을 수정하고 수정된 게시글을 Client 로 반환하기
6. 선택한 게시글 삭제 API
    - 삭제를 요청할 때 비밀번호를 같이 보내서 서버에서 비밀번호 일치 여부를 확인 한 후
    - 선택한 게시글을 삭제하고 Client 로 성공했다는 표시 반환하기

# 환경
- Java 11
- Spring Boot 2.6.7
- IntelliJ Ultimate 2022.2.3
- Spring Web
- Lombok
- H2
- JPA
- MySQL

# API 설계
|화면|기능|Method|URL|
|---|---|---|---|
|메인화면|전체게시글 목록조회|GET|/api/memos|
|메인화면|게시글 조회|GET|/api/memos/{id}|
|메인화면|게시글 작성|POST|/api/memos|Post|
|메인화면|게시글 수정|PUT|/api/update/{id}|
|메인화면|게시글 삭제|DELETE|/api/delete/{id}|
