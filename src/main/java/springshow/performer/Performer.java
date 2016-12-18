package springshow.performer;

import springshow.PerformanceException;

public interface Performer {
    public void setName(String name);
    public void perform() throws PerformanceException;
}
