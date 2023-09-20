# JobTender
![잡텐더](./DOCS/잡텐더.png)
---

## JobTender 바로가기 : [https://jobtender.shop](https://jobtender.shop/)

## UCC 보러가기 : [UCC!!](https://www.youtube.com/watch?v=tmNf5c00J8Q)

## 프로젝트 진행 기간

2023.02.20(월) ~ 2023.04.07(금)

SSAFY 8기 2학기 특화프로젝트

## 기획 의도 및 배경

이전과 다르게 저희는 취업 정보의 홍수 속에서 살고 있습니다. 기업에 대한 연봉, 성격, 하는 일, 매출, 전망 등 다양한 정보 속에서 자신과 잘 맞는 기업을 찾아 취업하기 위해 노력하고 있습니다. 하지만 분석에 따르면 퇴사의 이유 중 압도적 1위를 차지하는 항목은 “자신과 일이 맞지 않아서” 라고 합니다. 왜 그런 걸까요? 저희는 이것이 “가치관 정보의 부재” 라고 결론지었습니다. 저희는 자신을 객관적으로 알 기회가 없었으며, 기업이 어떤 가치관을 가지고 있는지 찾아보지도 않고, 알려주는 사람도 없었습니다. 잡텐더는 “가치관”에 대한 서비스를 제공합니다. 설문 조사를 통해 자신의 가치관에 대해 알려주며, 자신의 가치관과 가장 잘 맞는 기업을 추천해 줍니다. 여러분도 이번 기회에 자신에 대해 알아가 보는 게 어떨까요?

## 주요 기능

- 설문조사
    - 57가지 설문 조사를 통해 자신의 가치관에 대해 알 수 있습니다.
- 기업 추천
    - 선택한 3가지 키워드를 바탕으로 이용자의 성향과 비슷한 회사를 추천해줍니다.
    - 57가지 설문 조사를 바탕으로 이용자의 성향과 비슷한 회사를 추천해줍니다.
- 데이터 시각화
    - 설문 조사, 키워드를 바탕으로 사용자가 어떤 사람인지, 어떤 특성을 가지고 있는지, 어디에 속해있는지 시각적으로 확인할 수 있습니다.
    

## 💡주목 포인트

- 양질의 통계 자료를 바탕으로 한 신뢰있는 데이터
- 정교한 자연어 처리 기술을 바탕으로한 정확한 추천 알고리즘
- ORM을 이용한 빠르고 정교한 데이터 처리
- 책임과 역할이 분리된 다중 서버 구축
- 사용자 친화적 디자인
- 다양한 애니메이션

## 주요 기술

**Backend - Spring, Flask**

- IntelliJ Ultimate 2022.3.3
- Pycharm Community Edition 2022.3.1
- Spring Boot Gradle 2.7.9
- Spring Data JPA
- QueryDSL 1.0.10
- Flask
- JWT
- OAuth
- MySQL 8.0.31

**Frontend - React**

- Visual Studio Code IDE
- node v18.13.0
- React 18.0.2
- React-Router-Dom 6.8.2
- Redux 8.0.5
- ChakraUI
- GSAP
- D3

**CI/CD**

- AWS EC2
- NGINX
- Docker
- SSL (certbot)

## 프로젝트 파일 구조
```
S08P22A203
├── backend
│   ├── gradle
│   │   └── wrapper
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── ssafy
│       │   │           └── jobtender
│       │   │               ├── config
│       │   │               ├── controller
│       │   │               ├── dao
│       │   │               │   └── impl
│       │   │               ├── dto
│       │   │               │   ├── input
│       │   │               │   └── output
│       │   │               ├── entity
│       │   │               │   └── common
│       │   │               ├── jwt
│       │   │               ├── oauth
│       │   │               ├── repo
│       │   │               └── service
│       │   │                   └── impl
│       │   └── resources
│       └── test
│           └── java
│               └── com
│                   └── ssafy
│                       └── jobtender
│                           ├── dao
│                           │   └── impl
│                           ├── repo
│                           └── service
│                               └── impl
├── data
│   ├── certbot
│   │   ├── conf
│   │   └── www
│   └── nginx
├── database
│   └── mysql
│       └── sql
├── frontend
│   ├── public
│   │   ├── companyLogo
│   │   ├── font
│   │   └── images
│   │       └── welcome
│   └── src
│       ├── api
│       ├── components
│       │   ├── home
│       │   ├── keyword
│       │   ├── login
│       │   ├── mypage
│       │   ├── result
│       │   │   ├── 1
│       │   │   ├── 2
│       │   │   ├── 3
│       │   │   ├── 4
│       │   │   └── 5
│       │   ├── survey
│       │   └── welcome
│       ├── hooks
│       ├── pages
│       │   └── router
│       ├── redux
│       │   ├── counter
│       │   ├── home
│       │   ├── keyword
│       │   ├── mypage
│       │   ├── result
│       │   ├── survey
│       │   └── user
│       └── styles
│           ├── keyword
│           ├── loading
│           ├── result
│           └── survey
└── python
    ├── crow
    │   └── companyLogo
    └── python_backend
        ├── Dao
        │   └── __pycache__
        └── Logic
            └── __pycache__
```

## 협업 툴

- GitLab
- Notion
- Gather Town
- JIRA
- MatterMost
- Flip

## 협업 환경

- Gitlab
    - 코드의 버전을 관리
- JIRA
    - 매주 Sprint 진행
    - 업무마다 Story Point를 부여하고 주당 40point씩 수행
- 회의
    - 아침마다 스크럼 회의 진행
    - 전날 한 일과 당일 할 일 브리핑
    - 서로 담당 업무와 진행 상황을 알아 문제 발생 시 빠르게 대처
- Notion
    - 회의록을 기록하여 보관
    - 아이디어, 와이어프레임, ERD, API 명세서 등 모두가 공유해야 하는 문서 관리
    - 컨벤션 정리
    

## 컨벤션

## **Git**

### 커밋 분류 규칙

- **************************************************Init -************************************************** 프로젝트 시작
- **Feat** - 새로운 기능 추가
- **Fix** - 버그 수정
- **Build** - 빌드 관련 파일 수정
- **Ci** - CI관련 설정 수정
- **Docs** - 문서 (문서 추가, 수정, 삭제)
- **Style** - 스타일 (코드 형식, 폴더 이름, 세미콜론 추가: 비즈니스 로직에 변경 없는 경우)
- **Refac** - 코드 리팩토링
- **Test** - 테스트 (테스트 코드 추가, 수정, 삭제: 비즈니스 로직에 변경 없는 경우)
- **Chore** - 기타 변경사항 (빌드 스크립트 수정 등)

### 커밋 규칙

1. 메시지 규칙
    1. [분류] 기능 : 상세 설명
    2. ex) [Feat] 로그인 : User 정보를 서버에서 받는  Rest API 추가
    3. 무조건 명사형으로 마무리 ex) 작성, 추가 등
2. 커밋 시기
    1. 개인이 알아서
    2. 1일 1커밋 권장
    3. 커밋 시 모두에게 언급하기

### 브랜치

1. Master
2. Develop
    1. BE
        - Feature1 (기능 단위로 나누기)
        - Feature2
        - …
3. Release
4. Hotfix

## Jira

### Issue

에픽, 스토리만 사용

### Label (대분류)

기획, 학습, BE, FE, CI/CD 중 선택해서 작성

### Epic

기획, 학습, BE, FE, CI/CD 으로 시작하는 기능 단위로 작성

ex) BE - 유저 컨트롤러

ex) BE - 기업 분석 알고리즘 구현

ex) FE - 로그인 페이지

### Story

[Label] 스토리

ex) [BE] 회원 정보 수정 api 구현

ex) [BE] tf-idf 알고리즘 코드화 

ex) [FE] 카카오 로그인 api 구현 

### 우선 순위

할일의 우선 순위를 나누어 다섯 단계로 정확히 분류

### Stroy point

하루 8시간을 story 별로 나누기

story를 잘 예측하여 진행 시간 세분화 하기

## FE

### 파일

- 파스칼 케이스
- 파일명, 최상단 함수명, export 명 동일하게 하기

### 변수

- 변수 타입은 const로 하고 필요시, let으로 하기
- 카멜 케이스
- 의미 없는 변수명 금지
- 단어 줄이지 말기

### 메서드

- 카멜 케이스 (동사로 시작하는 이름)
- 화살표 함수로 작성하기 () ⇒ function()
- **메서드는 하나의 기능만 수행**

### 주석

- 메서드 위에 주석으로 설명하기, 모든 위치마다 상단에 주석달아서 설명하기

### import

- react랑 멀어질 수록 하단에 작성 (react - api - componet - css)
    - 대문자로 시작하는 이름
    

## BE

### 파일

- 파스칼 케이스 사용

### 변수

- 카멜 케이스 사용
- 의미 없는 변수명 금지
- 누구나 알법한 단어 제외 줄이지 말기

### 메서드

- 카멜 케이스 사용
- create / read / update / delete 형식으로 메서드 이름 쓰기
- **메서드는 하나의 기능만 수행**

### DTO 네이밍

- 비즈니스 로직과 관련된 이름으로 정하기
- 앞은 대문자, 끝은 DTO로 마무리

### REST API URL

- RESTful하게 쓰기
- URL 끝은 항상 명사

### 주석

- 컨트롤러에서 API 단위로 메서드 만들면 Swagger 명세 꼭 적어주기
- 컨트롤러 외에는 Class 위, 메서드 위에 문단 주석으로 설명하기
    - 카멜 케이스
    - 줄임말 지양 ex) cnt (X) count (O)

## 프로젝트 산출물

- [아키텍처](./DOCS/architecture)
- [와이어프레임](./DOCS/wireframe)
- [API](./DOCS/api)
- [ERD](./DOCS/erd)

## 프로젝트 결과물

- [포팅메뉴얼](./exec)
- [최종발표자료](./DOCS/presentation/jobtender_presentation.pdf)
