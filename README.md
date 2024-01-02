# 프로젝트 소개 및 생성
### 프로젝트 설명
---

- 편의점 결제 서비스
- 사용자가 편의점에서 간편 결제로 결제할 수 있는 시스템 개발
- 사용자 → 서비스 → 결제 수단 시스템 호출

### 개발환경

---

- Windows
- IDE : IntelliJ Community
- Language : Java( jdk 17 )
- Project : Gradle Project
- Spring Boot : 3.2.1

## 개발 과정  #1

### 기획자의 요구사항

---

- 편의점은 GS25, CU, 세븐일레븐 입니다.
- 결제만 되면 됩니다.

### 요구사항 분석 결과

---

- 편의점은 정확히 정해져 있으니 enum으로 관리
- 결제수단은 가장 간단한 money만 사용

### 클래스 UML

---

![image](https://github.com/dev-Seonghwan/coding-test/assets/91909986/3175a90f-0f8a-4562-bfbc-8b28ed87ddd1)


## 개발 과정 #2

### 기획자의 요구사항

---

- 사용자들이 카드 결제도 하고싶어합니다.
- 결제수단에 카드를 추가해주세요.

### 요구사항 분석 결과

---

- 사용자의 결제 요청에 결제수단 정보 추가 ( 머니/카드 )

<aside>
☝ 나중에 결제수단이 계속 추가되지 않을까?
→ DIP(의존성 역전 원칙)를 따라 규인터페이스를 정의하고, 각 결제수단은 해당 인터페이스를 구현하는 어댑터를 가지게 구현

</aside>

### 클래스 UML

---

![image](https://github.com/dev-Seonghwan/coding-test/assets/91909986/6c309a70-1427-4e78-8956-5fd64df754dd)
## 개발 과정 #3

### 기획자의 요구사항

---

- 할인 기능이 필요합니다.
- 하지만 아직 할인 정책을 정하지 못했어요.

### 요구사항 분석 결과

---

- 할인 기능이 필요하나, 지금은 정해진게 없다.

<aside>
☝ 먼저 개발에 들어가 나중에 구현체를 선택
→ OCP(개방 패쇄 원칙)를 따라 정책별 클래스를 구현

</aside>

### 클래스 UML

---
![image](https://github.com/dev-Seonghwan/coding-test/assets/91909986/2ddb89b9-00ee-4916-a25f-bec0b28b340a)
