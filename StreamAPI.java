import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

class StreamAPI {
        public static void main(String[] args) {
                // String s = " Hello I am Vivek \n I am very very unique. \n Hello \n Hello ";
                // Stream<String> lines = s.lines();
                // lines.map(String::strip).forEach(System.out::println);

                List<String> names = Arrays.asList("Vivek", "Smriti", "Aashutosh", "Sarthak", "Babu");
                // List<String> result = names.stream()
                // .filter(name -> name.startsWith("S"))
                // .map(String::toUpperCase)
                // .sorted()
                // .collect(Collectors.toList());

                // System.out.println(result);

                // 1. Creating Streams from Different Sources
                // a. From a Collection
                // b. From Arrays
                int[] numbers = { 1, 2, 3, 4, 5 };

                // c. Using Stream.of()
                Stream<String> streamOfStrings = Stream.of("Hello", "World");

                // d. Using Stream.generate() (infinite stream)
                Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);

                // e. Using Stream.iterate() (infinite stream)
                Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2).limit(5);

                // f. From Files (commented out because it requires a file)
                // try (Stream<String> lines = Files.lines(Paths.get("path/to/file.txt"))) {
                // lines.forEach(System.out::println);
                // } catch (IOException e) {
                // e.printStackTrace();
                // }

                // 2. Intermediate Operations
                // a. map() - Transform elements
                List<String> upperNames = names.stream()
                                .map(String::toUpperCase)
                                .collect(Collectors.toList());
                System.out.println("Names in Uppercase: " + upperNames);

                // b. filter() - Filter elements based on a predicate
                List<String> filteredNames = names.stream()
                                .filter(name -> name.startsWith("S"))
                                .collect(Collectors.toList());
                System.out.println("Names starting with 'S': " + filteredNames);

                // c. sorted() - Sort elements
                List<String> sortedNames = names.stream()
                                .sorted()
                                .collect(Collectors.toList());
                System.out.println("Sorted Names: " + sortedNames);

                // d. distinct() - Remove duplicates
                List<String> distinctNames = names.stream()
                                .distinct()
                                .collect(Collectors.toList());
                System.out.println("Distinct Names: " + distinctNames);

                // e. limit() and skip() - Limit and skip elements
                List<String> limitedNames = names.stream()
                                .limit(3)
                                .collect(Collectors.toList());
                System.out.println("First 3 Names: " + limitedNames);

                List<String> skippedNames = names.stream()
                                .skip(2)
                                .collect(Collectors.toList());
                System.out.println("Skipping First 2 Names: " + skippedNames);

                // f. flatMap() - Flatten nested structures
                List<List<String>> nestedList = Arrays.asList(
                                Arrays.asList("A", "B", "C"),
                                Arrays.asList("D", "E", "F"));
                List<String> flatList = nestedList.stream()
                                .flatMap(Collection::stream)
                                .collect(Collectors.toList());
                System.out.println("Flattened List: " + flatList);

                // 3. Terminal Operations
                // a. forEach() - Perform an action for each element
                System.out.println("Names:");
                names.stream().forEach(System.out::println);

                // b. collect() - Collect stream elements to a collection
                Set<String> nameSet = names.stream().collect(Collectors.toSet());
                System.out.println("Names as Set: " + nameSet);

                // c. reduce() - Reduce stream elements to a single value
                int sum = Arrays.stream(numbers).reduce(0, Integer::sum);
                System.out.println("Sum of numbers: " + sum);

                // d. count() - Count elements in a stream
                long count = names.stream().count();
                System.out.println("Total Names: " + count);

                // e. anyMatch(), allMatch(), noneMatch() - Check elements with predicates
                boolean anyStartsWithS = names.stream().anyMatch(name -> name.startsWith("S"));
                boolean allStartWithS = names.stream().allMatch(name -> name.startsWith("S"));
                boolean noneStartWithX = names.stream().noneMatch(name -> name.startsWith("X"));

                System.out.println("Any name starts with 'S': " + anyStartsWithS);
                System.out.println("All names start with 'S': " + allStartWithS);
                System.out.println("No name starts with 'X': " + noneStartWithX);

                // f. findFirst() and findAny() - Find elements
                Optional<String> firstName = names.stream().findFirst();
                firstName.ifPresent(name -> System.out.println("First Name: " + name));

                Optional<String> anyName = names.stream().findAny();
                anyName.ifPresent(name -> System.out.println("Any Name: " + name));

                // 4. Parallel Streams
                List<String> parallelFilteredNames = names.parallelStream()
                                .filter(name -> name.startsWith("S"))
                                .collect(Collectors.toList());
                System.out.println("Names starting with 'S' (Parallel): " + parallelFilteredNames);

                // 5. Infinite Streams with Stream.generate and iterate
                Stream<String> infiniteStream = Stream.generate(() -> "Hello").limit(3);
                infiniteStream.forEach(System.out::println);

                Stream<Integer> iterativeStream = Stream.iterate(1, i -> i + 1).limit(5);
                iterativeStream.forEach(System.out::println);

                // 6. Custom Collectors
                Map<Integer, List<String>> groupedByLength = names.stream()
                                .collect(Collectors.groupingBy(String::length));
                System.out.println("Grouped by length: " + groupedByLength);

                String joinedNames = names.stream()
                                .collect(Collectors.joining(", "));
                System.out.println("Joined Names: " + joinedNames);

                // 7. Stream of Primitive Types
                IntStream intStream = IntStream.range(1, 5); // 1, 2, 3, 4
                intStream.forEach(System.out::println);

                LongStream longStream = LongStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5
                longStream.forEach(System.out::println);

                DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3);
                doubleStream.forEach(System.out::println);

                // 8. Custom Terminal Operation: Summary Statistics
                IntSummaryStatistics stats = Arrays.stream(numbers)
                                .summaryStatistics();
                System.out.println("Int Summary Statistics:");
                System.out.println("Max: " + stats.getMax());
                System.out.println("Min: " + stats.getMin());
                System.out.println("Sum: " + stats.getSum());
                System.out.println("Average: " + stats.getAverage());
        }

}