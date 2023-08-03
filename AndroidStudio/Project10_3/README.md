## 양방향 액티비티

##### 1. 메인 액티비티에서 세컨드 액티비티로 데이터를 보낸다.

##### 2. 세컨드 액티비티에서 데이터를 변환(계산)한다.

##### 3. 세컨드 액티비티에서 메인 액티비티에 변환한 데이터를 보낸다.

다른 액티비티로 데이터를 보내기 위해 인텐트의 putExtra()를 사용했다.

일정 메서드를 수행한 데이터를 다시 돌려받기 위해 startActivity()가 아닌 registerForActivityResult()를 사용한다는 것이 일방향 액티비티와 달랐다.

데이터를 다시 돌려줄 때는 setResult, 다시 받을 때는 getResult를 사용한다.

공부하고 있는 책에서는 이제 쓰이지 않는 startActivityForResult()를 사용해 설명해주어서 애먹었다ㅠㅠ 자바 초보라 구글링하면서 어찌저찌 잘 바꾸었는데 왜 되는지 사실 잘 모르겠다^^

```java
//MainActivity.java
// 주는 함수
Button calculate = (Button) findViewById(R.id.calculate);
calculate.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), CalculateActivity.class);
        intent.putExtra("n1", Integer.parseInt(num1.getText().toString()));
        intent.putExtra("n2", Integer.parseInt(num2.getText().toString()));
        intent.putExtra("s", s[0]);
        startActivityResult.launch(intent);
    }
});

```

```java
//CalculateActivity.java
//받는 함수
Intent intent = getIntent();
int n1 = intent.getIntExtra("n1", 0);
int n2 = intent.getIntExtra("n2", 0);
String s = intent.getStringExtra("s");


// 다시 주는 함수
Intent resultIntent = new Intent(getApplicationContext(), MainActivity.class);
resultIntent.putExtra("result", result[0]);
setResult(RESULT_OK, resultIntent);
finish();
```

```java
//MainActivity.java
//받는 함수

ActivityResultLauncher<Intent> startActivityResult = registerForActivityResult(
    new ActivityResultContracts.StartActivityForResult(),
    new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if (result.getResultCode() == RESULT_OK) {
                Intent resultIntent = result.getData();
                Toast.makeText(getApplicationContext(), "합계 : " + resultIntent.getIntExtra("result", 0), Toast.LENGTH_LONG).show();
            }
        }
});
```



EditText에 적힌 숫자를 사용하기 위해 Integer.parseInt(id.getText().toString())을 사용했는데, 앱이 시작하자 마자 실행하는 위치에 둬버려서 에러가 발생했다.(""을 int로 바꿀 수 없음)
