# Java 簡單專案範例

在終端機編譯 Hello.java

```
$ javac Hello.java
$ java Hello
Hello Java!
$
```

其餘編譯 guess 、 cmd 兩個套件及 Main.java

```
$ javac -d . Guess.java
$ javac -d . CMD.java
$ javac Main.java
$ java Main
請猜出 0 到 9 之間的正整數...
總共有三次機會猜出正確數字...
準備好了嗎...
請輸入：
5
大一點！
請輸入：
8
小一點！
請輸入：
7
小一點！
猜了三次也沒猜對，答案是6。
$ 
```

