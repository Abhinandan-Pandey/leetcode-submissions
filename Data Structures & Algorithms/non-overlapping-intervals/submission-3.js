class Solution {
    /**
     * @param {number[][]} intervals
     * @return {number}
     */
    eraseOverlapIntervals(intervals) {
        const n = intervals.length;
        let count = 0;
        let prevEnd = -Infinity;

       intervals.sort((a, b) => a[1] - b[1]);
        for (const [start, end] of intervals) {
            if (start >= prevEnd) {
                count++;
                prevEnd = end;
            }
            
        }
        return n-count;
    }
}
