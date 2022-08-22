package practice;

public final class ImmutableClass {
    private final String value;  //already immutable
    private final StringBuffer sb;  //mutable

    public ImmutableClass(String value, StringBuffer sb)
    {
        this.value = value;
        this.sb = new StringBuffer(sb.toString()); // here i return copy of the instance variable so its doesnt affect original one
    }

    public String getValue()
    {
        return value;
    }

    public StringBuffer getSb()
    {
        return new StringBuffer(sb.toString());
    }

}

