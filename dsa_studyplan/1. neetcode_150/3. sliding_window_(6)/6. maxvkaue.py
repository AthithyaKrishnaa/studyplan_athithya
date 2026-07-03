from collections import deque

class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        dq = deque()      # stores indices
        res = []

        for i in range(len(nums)):

            # Remove indices that are out of this window
            if dq and dq[0] <= i - k:
                dq.popleft()

            # Remove all smaller elements from the back
            while dq and nums[dq[-1]] < nums[i]:
                dq.pop()

            # Add current index
            dq.append(i)

            # Window is complete
            if i >= k - 1:
                res.append(nums[dq[0]])

        return res