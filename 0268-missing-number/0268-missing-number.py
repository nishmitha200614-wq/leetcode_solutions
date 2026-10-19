class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        sumOfn=n*(n+1)//2
        sumOfnums=sum(nums)
        return sumOfn-sumOfnums