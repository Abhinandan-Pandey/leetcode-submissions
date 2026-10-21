/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    /**
     * @param {TreeNode} root
     * @return {number[][]}
     */
    levelOrder(root: TreeNode | null): number[][] {
        const queue = [root];
        const bfs = [];
        if (!root) return bfs;

        while (queue.length) {
            let level=[];
            const levelSize = queue.length;
            for (let i=0;i<levelSize; i++) {
                const curr = queue.shift();
                level.push(curr.val);
                if (curr.left) queue.push(curr.left);
                if (curr.right) queue.push(curr.right);
            }
           if(level.length) bfs.push(level);
        }
        return bfs;
    }
}
