class Solution:
    def kidsWithCandies(self, candies, extraCandies):
        result = []
        max_candies = max(candies)
        for candy in candies:
            if candy + extraCandies >= max_candies:
                result.append(True)
            else:
                result.append(False)
        return result