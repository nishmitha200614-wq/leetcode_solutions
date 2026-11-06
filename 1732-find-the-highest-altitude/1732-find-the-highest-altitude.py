class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        altitude = 0
        highest = 0

        for i in range(len(gain)):
            altitude += gain[i]

            if altitude > highest:
                highest = altitude

        return highest