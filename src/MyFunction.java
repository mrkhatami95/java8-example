import java.util.function.Function;

public class MyFunction implements Function<Long, Long> {

    @Override
    public Long apply(Long aLong) {
        return aLong + 3;
    }
}
