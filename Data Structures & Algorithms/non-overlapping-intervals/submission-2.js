class Solution {
    /**
     * @param {number[][]} intervals
     * @return {number}
     */
    eraseOverlapIntervals(intervals) {
        intervals.sort((a, b) => a[1] - b[1]);
        const n = intervals.length;
        let count = 0;
        let prevEnd = -Infinity;
        // for(let i=1; i<n;i++){
        //  if(intervals[i-1][1]>intervals[i][0]){
        //     count++;
        //  }
       
        for (const [start, end] of intervals) {
            if (start >= prevEnd) {
                count++;
                prevEnd = end;
                 console.log(prevEnd);
            }
            
        }
        return n-count;
    }
}
