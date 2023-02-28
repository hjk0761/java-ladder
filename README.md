# java-ladder

사다리 타기 미션 저장소

### 기능 목록

- 사용자 입력
    - [x] 게임에 참여하는 사람을 입력받는다.
        - [x] `,`로 사람을 구분한다.
        - [x] 사람 이름은 최소 1글자 최대 5글자까지 가능하다.
        - [x] 사람 이름은 중복을 허용하지 않는다.
        - [x] 이름에 공백이 있는 경우 예외를 발생시키고 다시 입력받는다.
        - [x] 게임 참여자 수는 최소 2명 최대 50명까지 가능하다.

    - [x] 실행 결과를 입력받는다.
        - [x] `,`로 결과를 구분한다.
        - [x] 참가자 수와 다른 크기의 결과를 입력한 경우 예외를 발생시킨다.

    - [x] 사다리 높이를 입력받는다.
        - [x] 사다리 높이는 1이상 100이하의 자연수만 가능하다.

    - [x] 결과를 보고 싶은 사람을 입력받는다.
        - [x] 해당 사람이 참가자에 없는 경우 예외를 발생시킨다.

- 결과 출력
    - [x] 게임 참가자를 5자 기준으로 출력한다.
    - [x] 생성된 사다리를 출력한다.
    - [x] 입력된 참가자의 결과를 출력한다.
        - [x] 한 명 이상의 참가자가 입력되면 예외를 발생시킨다.
        - [x] `all`이 입력된 경우 모든 참가자의 결과를 출력한다.


- 사다리 생성
    - [x] 다리는 생성될 수도 있고 생성되지 않을 수도 있다.
    - [x] 높이 하나마다 랜덤한 값을 추출해 생성 할지 말지 결정한 후, 생성할 수 있는 조건이면 생성한다.
        - [x] 랜덤 함수에서 false가 나오면 다리를 생성하지 않는다.
        - [x] 랜덤 함수에서 true가 나오는 경우
            - [x] Line의 첫 번째 인덱스인 경우 다리를 생성한다.
            - [x] 첫 번째 인덱스가 아니면, 이전 인덱스의 다리가 생성되지 않은 경우에만 다리를 생성한다.

- 사다리 타기
    - [x] 참가자의 초기 위치에 따라 line을 이동하며 최종 위치를 찾는다.
      - [x] 참가자의 좌, 우 point를 탐색해 이동할 수 있는 방향으로 이동한다. 
        - [x] 참가자가 Line의 첫 번째에 위치한 경우 왼쪽으로 이동할 수 없다.
        - [x] 참가자가 Line의 끝에 위치한 경우 오른쪽으로 이동할 수 없다.
      - [x] 좌, 우로 이동할 수 없는 경우 아래 Line으로 이동한다.

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
