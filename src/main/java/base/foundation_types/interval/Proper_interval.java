package base.foundation_types.interval;

public class Proper_interval<T extends Comparable> extends Interval {

    public Proper_interval(T lower, T upper, Boolean lower_unbounded, Boolean upper_unbounded, Boolean lower_included, Boolean upper_included){
        super(lower, upper, lower_unbounded, upper_unbounded, lower_included, upper_included);
    }
}
