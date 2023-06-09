
class Solution 
{ public int[][] merge(int[][] intervals) 
  { Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
    List<int[]> ls=new ArrayList<>();
    int[] curr=intervals[0];
    ls.add(curr);
    for(int[] next:intervals)
    { if(curr[1]>=next[0])
      { curr[1]=Math.max(curr[1],next[1]);
      }
      else
      { curr=next;
        ls.add(curr);
      }
    } 
    return ls.toArray(new int[ls.size()][]);
  }
}