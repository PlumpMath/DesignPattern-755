package interceptingFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Filter chain carries multiple filters and help to execute them in defined order on target
 */
public class FilterChain {
    private List<Filter> filterList = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public void execute(String request) {
        filterList.stream().forEach(f -> f.execute(request));
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
