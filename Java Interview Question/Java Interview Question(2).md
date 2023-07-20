## （2）Interview questions about containers.
* What exactly are Java containers?<br>
-><br>
Java container란 java.awt 패키지 내의 Container 클래스도 있고 List,Set,Map등 컬렉션 자료구조를 말하는 container도 있다.
 ***
* What is the distinction between a Collection and a Collections?<br>
-><br>
`Collection`은 자바에서 모든 컬렉션 클래스와 인터페이스를 포함하는 `Collection Framework`이다.(Map은 Collection에 포함되지 않지만 Collection으로 분류) 반면에 `Collections`는 static메소드로 이루어진 클래스이며 sort(), reverse()등의 <b>컬렉션 관련 메소드</b>를 제공한다.
***
* What is the distinction between a List, a Set, and a Map?<br>
-><br>
셋 모두는 컬렉션 자료구조로 데이터의 집합이다. List는 순서가 있고 중복을 허용하며, Set은 순서가 없고 중복을 허용하지 않게 데이터를 저장한다. Map은 key-value 쌍으로 이루어진 데이터의 집합이며 key를 통하여 데이터에 접근한다. 따라서 key는 중복이 허용되지 않는다 (value는 데이터중복 허용)
***
* What’s the distinction between HashMap and Hashtable?<br>
-><br>
HashMap과 Hashtable은 동일한 내부 구조를 가지고있다. 이 둘의 가장 큰 차이는 동기화 여부다. Hashtable은 동기화된 메소드로 구성되어 있기 때문에 멀티스레드가 동시에 Hashtable의 메소드를 실행할 수 없다.
***
* How do I choose between HashMap and TreeMap?<br>
-><br>
TreeMap은 이진트리를 기반으로한 Map 컬렉션이다. 이는 key값을 기준으로 이진트리 형태로 자동으로 정렬된다. 만약 속도나 성능을 중요시 할 경우에는 HashMap을 사용하는게 성능이 좋고 데이터의 순서나 범위를 통한 검색이 요구되면 TreeMap을 사용하는게 유리할 수 있다.
***
* What is the HashMap implementation principle?<br>
-><br>
hashMap은 해시함수를 이용하여 key의 해시값을 계산한다. 해시함수는 주어진 키를 해시버킷의 인덱스로 변환을 한다. 따라서 해시값을 통해 데이터들의 value에 접근하는 것이다. 이때 해시함수의 반환값이 중복되는 해시 충돌이 일어날 수가 있다. 따라서 LinkedList를 이용하여 각 버킷을 연결리스트로 구현한다.
***
* What is the HashSet implementation principle?<br>
-><br>
HashSet은 내부적으로 HashMap으로 구현되어 있다. HashMap의 Key는 중복을 허용하지 않기 떄문에 Key에 객체를 저장하고 Value에는 dummy data를 저장한다.
***
* What is the distinction between an ArrayList and a LinkedList?<br>
-><br>
ArrayList는 내부적으로 배열을 사용하여 요소를 저장하고 배열의 크기가 가변적으로 조정이 된다. 연결리스트는 내부적으로 연결리스트를 사용하여 다음 요소를 가리키는 포인터로 연결이 된다. LinkedList같은 경우는 삽입/삭제 작업에 유리하고 ArrayList같은 경우는 배열기반으로 인덱스에 바로 접근하기 때문에 조회에 유리하다. 또한 LinkedList는 내부적으로 다음 노드를 가리키는 주소가 필요하므로 메모리 오버헤드가 발생하여 ArrayList보다는 메모리를 더 사용한다.
***
* How do I convert between an Array and a List?<br>
-><br>
배열을 리스트로 변환하는 경우에는 `java.util.Arrays` 클래스의 `asList()` 메서드를 사용하면 된다.
리스트를 배열로 변환하는 경우에는 `List`인터페이스의 `toArray()` 메서드를 이용하면 된다. 이때 toArray()메서드의 파라미터로 배열의 타입을 전달해야 한다. 크기가 0인 배열을 전달하면, 새로운 배열이 동적으로 생성되어 리스트의 요소를 저장한다.<br>
ex) String[] array = list.toArray(new String[0]);
***
* What is the distinction between an ArrayList and a Vector?<br>
-><br>
둘의 차이점에는 동기화 유무에 있다.Vector는 thread-safe하며 ArrayList는 그렇지 않다. 따라서 동기화된 Vector보다 ArrayList의 속도가 더욱 빠르다고 할 수 있다. 또한 ArrayList는 최대 인덱스를 초과하는 경우 현재 배열의 크기의 50%늘리는 반면 Vector는 생성자를 이용하여 그 크기를 직접 설정할 수 있다(default = 100%).
***
* What is the distinction between an array and an arraylist?<br>
-><br>

***
* In Queue, what is the difference between poll() and remove()?<br>
-><br>

***
* What are the thread-safe collection classes?<br>
-><br>

***
* What exactly is an iterator?<br>
-><br>

***
* What is the purpose of Iterator? What are the characteristics?<br>
-><br>

***
* What is the distinction between an Iterator and a ListIterator?<br>
-><br>

***
