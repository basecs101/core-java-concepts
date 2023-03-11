public class OptionalMethods {
    //Java8 Functional Interfaces
    //1. Predicate -> Condition checking using test method
    //2. Function -> Mapper or mapping to different object or perform transformation and returns result of apply method
    //3. Consumer -> Consumes a value using accept method
    //4. Supplier -> Produces a value using get method
    public static void main(String[] args) throws Exception {
        String name = "PraTIK";

        Optional<String> stringOptional = Optional.ofNullable(name);//of and empty

        System.out.println(stringOptional.isPresent());

        stringOptional.ifPresentOrElse(s -> {
                    System.out.println("Optional is having value "+s);
                }, () -> {
                    System.out.println("Optional container is  empty");
                }
        );

        System.out.println(stringOptional.get());

        stringOptional.map(
                s -> {
                    char firstChar = s.charAt(0);
                    System.out.println(firstChar);
                    return firstChar;
                }
        ).ifPresentOrElse(character -> {
            String charString = String.valueOf(character);
            System.out.println(charString);
        }, () -> System.out.println("Empty optional"));

        stringOptional.filter(s -> s.length() > 10).ifPresentOrElse(s -> {
            int length = s.length();
            System.out.println(length);
        }, () -> System.out.println("Empty optional after filter"));

        System.out.println("String from optional: "+stringOptional.orElseThrow(() -> new Exception("Execution occurred")));
    }
}