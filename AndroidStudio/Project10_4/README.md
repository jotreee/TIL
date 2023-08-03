### 암시적 인텐트

##### 인텐트를 받을 액티비티를 콕 집어 지정하는 명시적 인텐트와 달리 인텐트를 수행할 수 있는 액티비티를 모두 찾아 그 중에서 고른다. 휴대폰에서 인터넷 링크를 열 때 삼성 인터넷으로 열 것인지 네이버 어플로 열 것인지 고르는 것이 그 예. 만약 액션을 수행할 수 있는 액티비티가 하나라면(기존 안드로이드 응용 프로그램) 자동으로 선택되어 수행한다.

```java
//두 번째 액티비티로 명시적 인텐트를 보낼 때
Intent intent = new Intent(getApplicationContext(), SecondActivity.class);


//암시적 인텐트를 보낼 때
Uri uri = Uri.parse(" ");
Intent intent = new Intent(Intent.ACTION, uri);
or
Intent intent = new Intent(Intent.ACTION);
intent.setData(Uri.parse(" "));
```

ACTION 메서드?(ctrl+click해보니 string이라고 나온다. 명령어인가,,,)는 uri와 세트로 쓰이는 경우가 많은 것 같다. 파싱한 uri를 한 번에 Intent를 선언하면서 넣는 방법과 선언 후 setData로 넣는 방법 두 가지가 있다.

ACTION_WEB_SEARCH 같은 경우에는 액션만 선언하고 putExtra로 검색어를 집어넣길래 ACTION_DIAL에서 똑같이 해보았는데, DIAL은 uri를 필요로 하는 액션이고 putExtra에는 string이 들어가서 적용되지 않았다. 인텐트에 uri를 넣을 수 있는 putData를 사용하니 잘 적용이 되었다.

```java
Button btn = (Button) findViewById(R.id.btn);
```

지금까지 책에 적힌 코드대로 java에서 위젯을 선언할 때 위의 방식으로 선언했었다.

그런데 생각해보니 나는 xml파일에서 이미 btn을 버튼으로 만들었는데 굳이 (Button)을 써서 형변환을 다시 해야하나? 싶어 떼보니 잘 돌아갔다ㅎㅎ

스스로 생각하고 고민해보는 법을 점점 익혀가는 것 같아 뿌듯하다

얼른 자바공부하면서 더 많이, 깊게 고민해보고 싶다 히힣

해보니 위젯을 다른 위젯으로 형변환이 되는것도 아니었다... 그럼 왜 붙이는거지?0?
