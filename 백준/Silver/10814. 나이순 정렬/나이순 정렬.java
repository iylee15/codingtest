import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Person> people = new ArrayList<Person>();
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			people.add(new Person(i, age, name));
		}
		
		people.sort(new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				if(p1.age == p2.age) return p1.order - p2.order;
				return p1.age - p2.age;
			}
		});
		
		for(int i = 0; i < N; i++) {
			System.out.println(people.get(i).toString());
		}
	}

}

class Person {
	int order;
	int age;
	String name;
	
	Person(int order, int age, String name){
		this.order = order;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.age + " " + this.name);
		return sb.toString();
	}
}
