package Greedy;
import java.util.*;

public class JobSequencing {
    public static class Job{
        int profit;
        int deadline;
        int id; //0,1,2..

        public Job(int i,int d,int p){
            profit = p;
            deadline = d;
            id = i;
        }
    }
    public static void main(String[] args) {
        int jobsinfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobsinfo.length;i++){
            jobs.add(new Job(i,jobsinfo[i][0],jobsinfo[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2) -> obj2.profit - obj1.profit); //In desc order of Profits 
        //if want in asc order than obj1.profit - obj2.profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        //Print Sequence
        System.out.println("Max Jobs that can be done in sequence is " + seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i) + " ");
        }
    }
}
