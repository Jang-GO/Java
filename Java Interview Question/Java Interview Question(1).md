## （1）Interview questions about the Java Foundation.
* <i>What is the distinction between JDK and JRE?</i><br>
  -><br>`JRE(Java Runtime Environment)`는 자바 실행환경의 약자로 <br><b>자바로 만들어진 프로그램을 실행시키는데 필요한</b> 라이브러리들과 각종 API, JVM이 포함되어있다.<br>
  `JDK(Java Development Kit)`는 자바 개발키트의 약자로 이름 그대로 <b>개발자들이 자바로 개발하는데 사용된다.</b>
  JDK에는 javac, javadoc 등의 개발 도구들이 포함되어있고 개발을 하려면 당연히 실행도 시켜줘야 하기 때문에 JRE도 함께 포함되어있다.
  ***

* <i>What’s the distinction between == and equals?</i><br>
  -><br>
  '=='은 `primitive type`에 대해서는 값을 비교한다. 그러나 `reference type`에 대해서는 주소값을 비교한다. **equals()의 경우는 두 참조변수의 값을 비교하는 목적**으로 사용된다.
  ***
* <i>Equals() must be true if two objects have the same hashCode(), right?</i><br>
  -><br>
  아니다. hashCode가 같아도 서로 다른객체일 수 있다. hashCode() 메서드는 int형 정수를
  반환하는데 만일 8byte의 주소값을 hashCode()를 이용해 반환하면 4바이트로 강제 캐스팅이 일어날 수 있기에 hashCode의 값이 겹칠 수 있다.
  ***
* <i>Is String a fundamental data type?</i><br>
  -><br>String은 참조타입이다. String은 java.lang 패키지에 속한 클래스이며 문자열을 나타는데 사용된다.
  ***
* <i>In Java, what are the classes for manipulating strings? What is the distinction between them?</i><br>
-><br>
문자열을 조작하는 대표적인 클래스로는 `String`,`StringBuilder`,`StringBuffer`가 있다.<br>
String클래스는 immutable한 문자열이며 한 번 생성된 String객체의 값을 변경할 수 없다.<br>
StringBuilder클래스와 StringBuffer클래스는 mutable하며 문자열을 효율적으로 수정할 수 있다.<br>
두 클래스의 차이로는 StringBuilder는 thread-safe하지않아 멀티스레드에서 적합하지않고 StringBuffer는 멀티스레드에서 안전하다
  ***
* <i>Is String str=“i” synonymous with String str=new String(“i”)?</i><br>
-><br>
아니다. str="i"는 문자열의 리터럴 생성방식, str = new String("i")는 문자열 객체 생성방식이다.<br>
리터럴 생성 방식으로 생성된 문자열은 String Constant Pool에 존재하게 위치하며 같은 문자열이라면 같은 주소값을 공유한다.<br>
그러나 객체 생성 방식으로 생성시 객체가 **Heap영역에 할당**되며 같은 문자열 내용이 생성되어도 이러한 방식으로 생성할 시 주솟값이 서로 다르다.
  ***
* <i>What is the best way to invert a string?</i><br>
-><br>
사실 StringBuilder의 reverse 메서드를 사용하는 방법이 있지만, Java api doc의 AbstractStringBuilder를 보면 배열을 문자열을 배열로 바꾼뒤 문자열의 절반까지 맨 앞의 인덱스와 맨 뒤의 인덱스를 교환하는 방식으로 reverse를 구현한다.
  ***
* <i>What are the String class’s common methods?
* <i>Is it necessary to have abstract methods in abstract classes?
* <i>What is the distinction between a regular class and an abstract class?
* <i>Can final be used to modify abstract classes?
