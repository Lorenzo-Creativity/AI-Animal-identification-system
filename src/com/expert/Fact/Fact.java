package com.expert.Fact;

import java.util.Arrays;
import java.util.Objects;

/**
 * 事实实体类
 * @author lorenzo
 * @date 2022/03/09 15:10
 **/
public class Fact {
    /**
     * 事实索引
     */
    private int factNum;
    /**
     * 事实数组
     */
    private int[] fact;

    public Fact() {
        factNum = 0;
        fact = new int[0];
    }

    public int getFactNum() {
        return factNum;
    }

    public void setFactNum(int factNum) {
        this.factNum = factNum;
    }

    public int[] getFact() {
        return fact;
    }

    public void setFact(int[] fact) {
        this.fact = fact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fact fact1 = (Fact) o;
        return factNum == fact1.factNum && Arrays.equals(fact, fact1.fact);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(factNum);
        result = 31 * result + Arrays.hashCode(fact);
        return result;
    }

    @Override
    public String toString() {
        return "Fact{" +
                "factNum=" + factNum +
                ", fact=" + Arrays.toString(fact) +
                '}';
    }
}
