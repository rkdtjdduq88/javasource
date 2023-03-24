package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		// Person 객체를 Set 구조에 담기
		Set<Person> set = new HashSet<>(); // <> 비어있는 이유는 <Person>과 같기때문에 생략
		
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set); // [Person [name=David, age=10], Person [name=David, age=10]]
		                         // 사용자가 정의 객체는 중복 저장을 허용함
		                         // 허용하지 않으려면 직접 만들어야함
		                         // 중복 저장이 안되도록 하고 싶다면 equals(), hashCode() 오버라이딩 해야 함
		
	}

}
