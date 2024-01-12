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

---
<details>
<summary>개발 과정 #1 : 기본 결제 기능 </summary>

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

![image](https://github.com/dev-Seonghwan/convpay/assets/91909986/af80592c-4c32-4e8d-aa6a-7ac8a1143676)


</details>

---

<details>
<summary>개발 과정 #2 : 결제 수단 추가</summary>

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

![image](https://github.com/dev-Seonghwan/convpay/assets/91909986/bb6fa20b-4c09-4cfd-a41b-12b8d2caa901)

</details>

---

<details>
<summary>개발 과정 #3 : 할인 기능 추가</summary>

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
![image](https://github.com/dev-Seonghwan/convpay/assets/91909986/01f55419-e4ac-4278-9b2e-243ee4321c50)

</details>






## 결과

### 현재 클래스 UML

---

![image](https://github.com/dev-Seonghwan/convpay/assets/91909986/444283c2-1391-4618-99da-de79a2339b76)

### 현 코드에서 느낀 문제점

- 위 코드를 구현하다보면 중간에 Interface를 두지만 결국 구현체를 결제서비스가 직접 선택
하여 의존
- 결제서비스가 구현체를 직접 선택하지 않도록 하려면 어떻게 하면 될까?


### 새로운 역할의 도출

어떤 클래스가 어떤 구현체를 사용하는가 하는 설정
→ 설정을 별도의 클래스로 분리하자 (SRP : 단일 책임 원칙)


