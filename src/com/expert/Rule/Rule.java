package com.expert.Rule;

import java.util.Arrays;
import java.util.Objects;

/**
 * 规则实体类
 * @author lorenzo
 * @date 2022/03/09 15:00
 **/
public class Rule {
    /**
    * 初始化成员变量
    * */
    private int factNum;
    /**
     * 事实数组
     */
    private int[] fact;
    /**
     * 判断规则是否使用
     * */
    private boolean used;
    /**
     * 判断是否可能符合
     */
    private boolean possible;
    /**
     * 最终结果
     */
    private boolean endResult;
    /**
     * 结果Id
     */
    private int resultId;
    /**
     * 记录下一次需验证的特征位置
     */
    private int nextFactPos;

    public Rule(int factNum, int[] fact, boolean endResult, int resultId) {
        this.factNum = factNum;
        this.fact = fact;
        this.used = false;
        this.possible = true;
        this.endResult = endResult;
        this.resultId = resultId;
        this.nextFactPos = 0;
    }

    public Rule() {
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

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public boolean isPossible() {
        return possible;
    }

    public void setPossible(boolean possible) {
        this.possible = possible;
    }

    public boolean isEndResult() {
        return endResult;
    }

    public void setEndResult(boolean endResult) {
        this.endResult = endResult;
    }

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getNextFactPos() {
        return nextFactPos;
    }

    public void setNextFactPos(int nextFactPos) {
        this.nextFactPos = nextFactPos;
    }

    public static Rule[] intRules(){
        Rule[] rules= new Rule[15];
        //以下为结果集
        //rule0
        int[] fact0 ={3,12,22,23};
        rules[0]=new Rule(4,fact0,true,7);
        //rule1
        int[] fact1 ={3,12,21,23};
        rules[1]=new Rule(4,fact1,true,6);
        //rule2
        int[] fact2 ={11,19,20,22};
        rules[2]=new Rule(4,fact2,true,5);
        //rule3
        int[] fact3 ={11,21};
        rules[3]=new Rule(2,fact3,true,4);
        //rule4
        int[] fact4 ={17,19,20,13,-9};
        rules[4]=new Rule(5,fact4,true,3);
        //rule5
        int[] fact5 ={17,18,13,-9};
        rules[5]=new Rule(4,fact5,true,2);
        //rule6
        int[] fact6 ={16,13};
        rules[6]=new Rule(2,fact6,true,1);

        //以下为非结果集
        int[] fact7 ={15};
        rules[7]=new Rule(1,fact7,false,3);

        int[] fact8 ={14};
        rules[8]=new Rule(1,fact8,false,3);

        int[] fact9 ={10};
        rules[9]=new Rule(1,fact9,false,13);

        int[] fact10 ={8,9};
        rules[10]=new Rule(2,fact10,false,13);

        int[] fact11 ={1,7};
        rules[11]=new Rule(2,fact11,false,12);

        int[] fact12 ={4,5,6};
        rules[12]=new Rule(3,fact12,false,12);

        int[] fact13 ={2,3};
        rules[13]=new Rule(2,fact13,false,11);

        int[] fact14 ={1,3};
        rules[14]=new Rule(2,fact14,false,11);

        return rules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rule rule = (Rule) o;
        return factNum == rule.factNum && used == rule.used && possible == rule.possible && endResult == rule.endResult && resultId == rule.resultId && nextFactPos == rule.nextFactPos && Arrays.equals(fact, rule.fact);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(factNum, used, possible, endResult, resultId, nextFactPos);
        result = 31 * result + Arrays.hashCode(fact);
        return result;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "factNum=" + factNum +
                ", fact=" + Arrays.toString(fact) +
                ", used=" + used +
                ", possible=" + possible +
                ", endResult=" + endResult +
                ", resultId=" + resultId +
                ", nextFactPos=" + nextFactPos +
                '}';
    }
}
