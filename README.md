# java-blackjack

블랙잭 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 요구사항 분석

1. 입력
    - [x] 사람의 이름을 입력 받는다.
        - 안내 문구를 출력한다.
        - 쉼표로 분리
        - 이름의 개수는 20개를 넘지않는다.
        - 이름의 길이는 1 ~ 20글자로 제한한다.
    - [x] 카드 수령 동의 여부
        - 안내 문구를 출력한다.
        - 예는 y, 아니오는 n
    - [x] 배팅 금액을 입력 받는다.
        - 안내 문구를 출력한다.
        - 금액은 정수 범위로 받는다.
2. 출력
    - [x] 게임 시작 시 받는 두장의 카드를 출력한다.
    - [x] 각 플레이어, 딜러가 가지고 있는 카드의 종류를 출력한다.
    - [x] 딜러의 추가 수령 여부를 출력한다.
    - [x] 게임 종료 후 결과를 출력한다.
    - [x] 최종 승패를 출력한다.

3. 비즈니스 로직
    - [x] 플레이어 등록
    - [x] 카드 수령
        - 카드 풀에서 랜덤으로 카드를 수령한다.
        - 카드 중복은 허용되지 않는다.
    - [x] 결과 계산
        - 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.
    - [x] 최종 승패 판단
        - 21이 넘으면 무조건 패배한다.
        - 21에 가까운 값이 승리한다.
    - [x] 딜러 카드 수령 조건
        - 딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 추가로 받아야 하고, 17점 이상이면 추가로 받을 수 없다.
        - 딜러가 Ace를 뽑은 경우 합계에서는 1로 간주한다.
    - [x] 배팅
        - 배팅 금액을 등록
        - 카드를 추가로 뽑아 21을 초과할 경우 배팅 금액을 모두 잃게 된다.
        - 처음 두 장의 카드 합이 21일 경우 블랙잭이 되면 베팅 금액의 1.5 배를 딜러에게 받는다.
        - 딜러와 플레이어가 모두 동시에 블랙잭인 경우 플레이어는 베팅한 금액을 돌려받는다.
        - 그 외에 플레이어가 승리할 경우, 배팅 금액을 돌려받는다.
        - 플레이어가 패배할 경우, 배팅 금액을 잃는다.
    - [x] 최종 수익 계산
        - 각 플레이어는 위의 규칙에 따라 수익을 계산한다.
        - 딜러의 수익은 모든 플레이어의 수익의 합에 -1을 곱한 값이다.
