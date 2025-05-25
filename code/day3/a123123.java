public class a123123
{
    public static void main(String[] args) {
        String seasonName = "Summer";
        int numLetters = switch (seasonName) {

            case "Spring" -> {
                System.out.println("spring time!");
                yield 6;
            }

            case "Summer", "Winter" -> 6;

            case "Fall" -> 4;

            default -> -1;

        };
        System.out.println(numLetters);
    }
}
