package day22inheritancepolymorphism.day32maps;

public class EnumRunner {
    public static void main(String[] args) {

        String capital = UsStates.CALIFORNIA.getCapital();
        System.out.println(capital);

        String abbr = UsStates.FLORIDA.getAbbreviation();
        System.out.println(abbr);

        String state = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state);

        String capital1 = UsStates.getStateNameFromCapital("Salt Lake City");
        System.out.println(capital1);

        String abbr1 = UsStates.getAbbrFromCapital("San Juan");
        System.out.println(abbr1);

    }
}
