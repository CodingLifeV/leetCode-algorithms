package greedy.case_greedy;


/**
 * 活动类
 * @CreatTime 下午9:45:37
 *
 */

class Active implements Comparable<Active>{
    private int startTime;//活动开始时间
    private int endTime;//活动结束时间

    public Active(int startTime, int endTime) {
        super();
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Active [startTime=" + startTime + ", endTime=" + endTime + "]";
    }

    //活动排序时按照结束时间升序
    //重写compareTo()方法之后,sort()方法使用该comparaTo()方法排序,默认升序
    @Override
    public int compareTo(Active o) {
        if(this.endTime>o.getEndTime()){
            return 1;
        }else if(this.endTime == o.endTime){
            return 0;
        }else{
            return -1;
        }
    }


}