package base.foundation_types.interval;

public class Multiplicity_interval extends Proper_interval<Integer> {
    private static final String MULTIPLICITY_RANGE_MARKER = "..";
    private static final char MULTIPLICITY_UNBOUNDED_MARKER = '*';

    public Multiplicity_interval(Integer lower, Integer upper, Boolean lower_unbounded, Boolean upper_unbounded, Boolean lower_included, Boolean upper_included){
        super(lower, upper, lower_unbounded, upper_unbounded, lower_included, upper_included);
    }

    Multiplicity_interval createOpen(){
        return new Multiplicity_interval(0, null, false, true, true, false);
    }

    Boolean is_open(){
        return (Integer.valueOf(0).equals(getLower()) && isLower_included() && isUpper_unbounded());
    }

    Multiplicity_interval createOptional(){
        return new Multiplicity_interval(0, 1, false, false, true, true);
    }

    Boolean is_optional(){
        return (Integer.valueOf(0).equals(getLower()) && Integer.valueOf(1).equals(getUpper()) && isLower_included() && isUpper_included());
    }

    Multiplicity_interval createMandatory(){
        return new Multiplicity_interval(1, 1, false, false, true, true);
    }

    Boolean is_mandatory (){
        return (Integer.valueOf(1).equals(getLower()) && Integer.valueOf(1).equals(getUpper()) && isLower_included() && isUpper_included());
    }


    Multiplicity_interval createProhibited(){
        return new Multiplicity_interval(0, 0, false, false, true, true);
    }

    Boolean is_prohibited(){
        return (Integer.valueOf(0).equals(getLower()) && Integer.valueOf(0).equals(getUpper()) && isLower_included() && isUpper_included());
    }

}
