import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 5, 77, 53, 27, 38, 50);
		List<Double> productList = Arrays.asList(800.0, 500.0, 700.0, 530.0, 270.0, 580.0, 500.0);
		List<String> nameList = Arrays.asList("Aradhya", "OM", "Arti", "Sahil", "Amol");
		List<String> strList = Arrays.asList("Aradhya", "", "Om", " ", "Arti");

		
		
		// Filter
		System.out.println("Odd number");
		list.stream().filter(num -> num % 2 == 1).collect(Collectors.toList())
				.forEach(num -> System.out.print(num + " ,"));

		System.out.println("Even number");
		list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList())
				.forEach(num -> System.out.print(num + " ,"));

		System.out.println("\n\nNumber greater than 30");
		list.stream().filter(num -> num > 30).collect(Collectors.toList()).forEach(num -> System.out.print(num + " ,"));

		System.out.println("\n\nPrint list of name start with A");
		nameList.stream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList())
				.forEach(num -> System.out.print(num + " ,"));

		System.out.println("\n\nPrint list By filtering empty or black space");
		nameList.stream().filter(str -> !str.contains(" ") || !str.isEmpty() || !str.isBlank())
				.collect(Collectors.toList()).forEach(num -> System.out.print(num + " ,"));
		
		
		System.out.println("\n\na list of products with prices, print only those that cost more than ₹500");
		productList.stream().filter(price -> price >= 500).collect(Collectors.toList()).forEach(price -> System.out.println(price + ", "));
		

		// Map
		System.out.println("\n\nPrint list of name start with A and apply uppercase on it");
		nameList.stream().filter(name -> name.charAt(0) == 'A').map(String::toUpperCase).collect(Collectors.toList())
				.forEach(num -> System.out.print(num + " ,"));

		System.out.println("\n\nSquare each number");
		List<Integer> newList = list.stream().map(num -> num * num).collect(Collectors.toList());
		System.out.println(newList);

		System.out.println("\n\nPrefix each name with Mr. or Ms.");
		nameList.stream().map(name -> ("Mr./Ms." + name)).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("\n\nProduct prices, apply 10% discount");
		productList.stream().map(price -> price - (price * 0.1)).collect(Collectors.toList())
				.forEach(price -> System.out.print(price + "  "));

		System.out.println("\n\nMultiply by 10 for each element");
		list.stream().map(num -> num * 10).collect(Collectors.toList())
				.forEach(price -> System.out.print(price + "  "));

		// count

		System.out.println("\n\nCount Number greater than 30");
		Long count = list.stream().filter(num -> num > 30).count();
		System.out.println("Count : " + count);

		System.out.println("\n\nCount odd number : " + list.stream().filter(num -> num % 2 == 1).count());

		System.out.println("Count even number : " + list.stream().filter(num -> num % 2 == 0).count());
		
		System.out.println("\n\n count name start with A and apply uppercase on it");
		System.out.println(nameList.stream().filter(name -> name.charAt(0) == 'A').map(String::toUpperCase).count());
		
		System.out.println("\n\nCount Product prices apply 20% discount more than 500");
		System.out.println(productList.stream().map(price -> price - (price * 0.2)).filter(price -> price + price >= 500).count());
		
		
		

		// Sort
		System.out.println("\n\nNormal sorting ...");
		list.stream().sorted().forEach(num -> System.out.print(num + ", "));

		System.out.println("\n\nSort string by length in revesed ...");
		nameList.stream().sorted(Comparator.comparing(String::length).reversed())
				.forEach(name -> System.out.print(name + ", "));

		System.out.println("\n\nOdd number");
		list.stream().filter(num -> num % 2 == 1).sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.forEach(num -> System.out.print(num + " ,"));

		System.out.println("\n\nEven number");
		list.stream().filter(num -> num % 2 == 0).sorted().collect(Collectors.toList())
				.forEach(num -> System.out.print(num + " ,"));
		
		
		

		// MIN MAX

		System.out.println("\n\nMin");
		System.out.println(list.stream().min(Comparator.comparing(Integer::intValue)));
		
		System.out.println("\n\nLargest Even number");
		System.out.println(list.stream().filter(num -> num%2 == 0).max(Comparator.naturalOrder()));
		
		System.out.println("\n\nMax.");
		System.out.println(list.stream().max(Comparator.comparing(Integer::intValue)));
		
		
		
		//toArray()
		
		System.out.println("\nlist to array : " + list.toArray());
		
		int[] arr = {2,74,12,5,3,52};
		System.out.println("\nArrays sum : " + Arrays.stream(arr).sum());
		
		String[] strArr = {"om" , "sai" , "bye"};
		Arrays.stream(strArr).map(str -> str.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		
		//skip
		
		System.out.println("\n\nskip\n");
		nameList.stream().skip(3).forEach(System.out::println);
		
		System.out.println("\nFilter even numbers from a list and skip the first 2 elements");
		list.stream().filter(num -> num%2==0).skip(2).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("\n\nSalaries Descending order\n");
		productList.stream().sorted(Comparator.reverseOrder()).skip(2).forEach(System.out::println);
		
		
		System.out.println("\n\nProduct objects, filter products with price > 500, and skip first 2 products.");
		productList.stream().filter(price -> price > 500).skip(2).forEach(System.out::println);
		
		
		
		//limit
		System.out.println("\n\ndescending length and display only the first 3 longest words");
		nameList.stream().sorted(Comparator.comparing(String::length).reversed()).limit(3).forEach(System.out::println);
		
		System.out.println("\n\nProduct objects, filter products with price > 500, and limit the result to only 2 products.");
		productList.stream().filter(price -> price > 500).limit(2).forEach(System.out::println);
		
		
		System.out.println("\n\nskip the first 2 products priced above ₹500 and print the rest");
		nameList.stream().skip(2).forEach(System.out::println);
		
		
		
		
		
		//skip,distinct,limit
		
		System.out.println("\n\n2nd largest element");
		list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
		
		
		
		
		//findFirst()
		System.out.println("First element in string : " + nameList.stream().findFirst());
		
		System.out.println("First element in even integers : " + list.stream().filter(num -> num%2==0).findFirst());
		
		System.out.println("First product that costs more than ₹500." + productList.stream().filter(num -> num > 500).findFirst());
		
		System.out.println("First element in string starting with A : " + nameList.stream().filter(name -> name.startsWith("a") || name.startsWith("A")).findFirst());
		
		
		
		
		//anyMatch()
		System.out.println("Any element in even integers : " + list.stream().anyMatch(num -> num%2==0));
		
		System.out.println("Any  string starting with A : " + nameList.stream().anyMatch(name -> name.startsWith("A")));
		
		System.out.println("Any  string is entirely upper case : " + nameList.stream().anyMatch(name -> name.equals(name.toUpperCase())));
		
		
		

	}
}
