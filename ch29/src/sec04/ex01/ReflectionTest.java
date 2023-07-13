package sec04.ex01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("sec04.ex01.Student");
		
		//생성자 찾기
		Constructor[]  constructors = clazz.getDeclaredConstructors();
		
		for(Constructor c : constructors) {
			System.out.println(c.getParameterCount()); //생성자의 매개변수 갯수를 출력합니다.
		}
		System.out.println();
		
		//메소드 찾기
		Method[] methods = clazz.getDeclaredMethods();  
		for(Method m : methods) {
			System.out.println(m.getName()); //메소드 이름을 출력합니다.
		}
		System.out.println();
		
		//필드 가져오기
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f.getName() +", " +f.getModifiers()); //메소드 이름을 출력합니다.
		}
	}

}
