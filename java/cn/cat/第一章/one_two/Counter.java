package cn.cat.第一章.one_two;

public class Counter {
    public int id = 0;
    private int addCount = 0;

    public Counter(int id) {
        this.id = id;
    }

    /**
     * 将当前数加一
     */
    void increment() {
        id++;
        addCount++;
    }

    /**
     * 该对象创建后被加以的次数
     */
    int tally() {
        return addCount;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "id=" + id +
                '}';
    }

}
