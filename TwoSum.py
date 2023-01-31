class Solution(object):
    def twoSum(self, nums, target):
        diff  = {}
        for idx in range(len(nums)):
            if nums[idx] in diff:
                return [diff[nums[idx]], idx]
            else:
                diff[target - nums[idx]] = idx
        return []