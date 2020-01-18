package base.foundation_types.interval;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Interval abstraction, featuring upper and lower limits that may be open or closed,
 * included or not included.Interval of ordered items.
 * @author Priyash
 */
public class Interval<T extends Comparable> {
    private T lower;
    private T upper;
    private Boolean lower_unbounded;
    private Boolean upper_unbounded;
    private Boolean lower_included;
    private Boolean upper_included;

    public Interval(){

    }

    public Interval(T lower, T upper, Boolean lower_unbounded, Boolean upper_unbounded, Boolean lower_included, Boolean upper_included){
        this.lower = lower;
        this.upper = upper;
        this.lower_included = lower_included;
        this.upper_included = upper_included;
        this.lower_unbounded = lower_unbounded;
        this.upper_unbounded = upper_unbounded;
    }


    public T getLower() {
        return lower;
    }

    public T getUpper() {
        return upper;
    }

    public Boolean isLower_unbounded() {
        return lower_unbounded;
    }

    public Boolean isUpper_unbounded() {
        return upper_unbounded;
    }

    public Boolean isLower_included() {
        return lower_included;
    }

    public Boolean isUpper_included() {
        return upper_included;
    }

    public Boolean has(T v){
        if(v == null){
            throw new IllegalArgumentException("null value in Interval<T>");
        }
        return (this.lower_unbounded || this.lower_included ) && (v.compareTo(lower) >= 0 ) || (v.compareTo(lower) > 0) &&
                (this.upper_unbounded || this.upper_included) && (v.compareTo(upper) <= 0) || (v.compareTo(upper) < 0);
    }

    public Boolean intersects(Interval other){
        if(other == null){
            throw new IllegalArgumentException("Null Object args being passed in intersects method");
        }
        return (this.lower.compareTo(other.lower) >= 0 || this.upper.compareTo(other.upper) <= 0);
    }

    public Boolean contains(Interval other){
        if(other == null){
            throw new IllegalArgumentException("Null Object args being passed in contains method");
        }
        return (this.lower.compareTo(other.lower) >= 0 || this.upper.compareTo(other.upper) <= 0);
    }

    public Boolean is_equal(Object other){
        if(this == other) return true;
        else if(!(other instanceof Interval)) return false;
        Interval obj = (Interval) other;
        return (this.lower == obj.lower && this.upper == obj.upper &&
                this.lower_included == obj.lower_included &&
                this.upper_included == obj.upper_included &&
                this.lower_unbounded == obj.lower_unbounded &&
                this.upper_unbounded == obj.upper_unbounded);
    }

}
