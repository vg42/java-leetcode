# Java LeetCode
Java solutions for LeetCode problems.

| # | Title | Solution | Test cases | Time | Space | Description | Difficulty | 
| --- | --- | --- | --- | --- | --- | --- | --- | 
| 0001 | [Two Sum](https://leetcode.com/problems/two-sum/) | [Two sum solution](./src/main/java/com/leetcode/TwoSum.java) | [Two sum tests](./src/test/java/com/leetcode/TwoSumTest.java) | _O(n)_ | _O(n)_ | n = nums.length | Easy |
| 0002 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | [Add Two Numbers solution](./src/main/java/com/leetcode/AddTwoNumbers.java) | [Add Two Numbers tests](./src/test/java/com/leetcode/AddTwoNumbersTest.java) | _O(n)_ | _O(n)_ | n = max(len(l1), len(l2)), where len(l) - number elements in the list l | Medium |
| 0003 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | [Longest Substring Without Repeating Characters solution](./src/main/java/com/leetcode/LongestSubstringWithoutRepeatingCharacters.java) | [Longest Substring Without Repeating Characters tests](./src/test/java/com/leetcode/LongestSubstringWithoutRepeatingCharactersTest.java) | _O(n)_ | _O(k)_ | n = s.length(); k - number of possible characters | Medium |
| 0004 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | [Median of Two Sorted Arrays solution](./src/main/java/com/leetcode/MedianOfTwoSortedArrays.java) | [Median of Two Sorted Arrays tests](./src/test/java/com/leetcode/MedianOfTwoSortedArraysTest.java) | _O(log(min(l1, l2)))_ | _O(1)_ | l1 = nums1.length, l2 = nums2.length | Hard |
| 0005 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | [Longest Palindromic Substring solution](./src/main/java/com/leetcode/LongestPalindromicSubstring.java) | [Longest Palindromic Substring tests](./src/test/java/com/leetcode/LongestPalindromicSubstringTest.java) | _O(n^2)_ | _O(1)_ | n = s.length(); worst case - all chars are same | Medium |
| 0006 | [ZigZag Conversion](https://leetcode.com/problems/zigzag-conversion/) | [ZigZag Conversion solution](./src/main/java/com/leetcode/ZigZagConversion.java) | [ZigZag Conversion tests](./src/test/java/com/leetcode/ZigZagConversionTest.java) | _O(n)_ | _O(n)_ | n = s.length() | Medium |
| 0007 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | [Reverse Integer solution](./src/main/java/com/leetcode/ReverseInteger.java) | [Reverse Integer tests](./src/test/java/com/leetcode/ReverseIntegerTest.java) | _O(log10(x))_ | _O(1)_ |  | Easy |
| 0010 | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) | [Regular Expression Matching solution](./src/main/java/com/leetcode/RegularExpressionMatching.java) | [Regular Expression Matching tests](./src/test/java/com/leetcode/RegularExpressionMatchingTest.java) | O(n * m) | O(n * m) | n=s.length, m=p.length | Hard |
| 0015 | [3Sum](https://leetcode.com/problems/3sum/) | [3Sum solution](./src/main/java/com/leetcode/ThreeSum.java) | [3Sum tests](./src/test/java/com/leetcode/ThreeSumTest.java) | O(n^2) | O(1) | n=nums.length | Medium |
| 0020 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | [Valid Parentheses solution](./src/main/java/com/leetcode/ValidParentheses.java) | [Valid Parentheses tests](./src/test/java/com/leetcode/ValidParenthesesTest.java) | O(n) | O(n) | n=s.length() | Easy |
| 0023 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | [Merge k Sorted Lists solution](./src/main/java/com/leetcode/MergeKSortedLists.java) | [Merge k Sorted Lists tests](./src/test/java/com/leetcode/MergeKSortedListsTest.java) | O(n * log(k) | O(1) | n - number of all ListNode in the lists, k=lists.length() | Hard |
| 0050 | [Pow(x, n)](https://leetcode.com/problems/powx-n/) | [Pow(x, n) solution](./src/main/java/com/leetcode/PowXN.java) | [Pow(x, n) tests](./src/test/java/com/leetcode/PowXNTest.java) | O(log(n)) | O(log(n)) | - | Easy |
| 0056 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | [Merge Intervals solution](./src/main/java/com/leetcode/MergeIntervals.java) | [Merge Intervals tests](./src/test/java/com/leetcode/MergeIntervalsTest.java) | O(n * log(n)) | O(n) | n=interval.length() | Medium |
| 0069 | [Sqrt(x)](https://leetcode.com/problems/sqrtx/) | [Sqrt(x) solution](./src/main/java/com/leetcode/SqrtX.java) | [Sqrt(x) tests](./src/test/java/com/leetcode/SqrtXTest.java) | O(log(x)) | O(1) | - | Medium |
| 0088 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | [Merge Sorted Array solution](./src/main/java/com/leetcode/MergeSortedArray.java) | [Merge Sorted Array tests](./src/test/java/com/leetcode/MergeSortedArrayTest.java) | O(n + m) | O(1) | - | Medium |
| 0100 | [Same Tree](https://leetcode.com/problems/same-tree/) | [Same Tree solution](./src/main/java/com/leetcode/SameTree.java) | [Same Tree tests](./src/test/java/com/leetcode/SameTreeTest.java) | O(min(n,m)) | O(min(n,m)) | n, m - numbers elements in the trees p and q | Easy |
| 0121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Best Time to Buy and Sell Stock solution](./src/main/java/com/leetcode/BestTimeToBuyAndSellStock.java) | [Best Time to Buy and Sell Stock tests](./src/test/java/com/leetcode/BestTimeToBuyAndSellStockTest.java) | O(n) | O(1) | n=prices.length | Easy |
| 0146 | [LRU Cache](https://leetcode.com/problems/lru-cache/) | [LRU Cache solution](./src/main/java/com/leetcode/LRUCache.java) | [LRU Cache tests](./src/test/java/com/leetcode/LRUCacheTest.java) | O(1) | O(capacity) |   | Hard |
| 0200 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | [Number of Islands solution](./src/main/java/com/leetcode/NumberOfIslands.java) | [Number of Islands tests](./src/test/java/com/leetcode/NumberOfIslandsTest.java) | O(n * m) |O(n * m) | n * m - number of cells in the grid  | Medium |
| 0206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | [Reverse Linked List solution](./src/main/java/com/leetcode/ReverseLinkedList.java) | [Reverse Linked List tests](./src/test/java/com/leetcode/ReverseLinkedListTest.java) | O(n) | O(1) - iterative, O(n) - recursive | n - number elements in the list | Easy |
| 0238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | [Product of Array Except Self solution](./src/main/java/com/leetcode/ProductOfArrayExceptSelf.java) | [Product of Array Except Self tests](./src/test/java/com/leetcode/ProductOfArrayExceptSelfTest.java) | O(n) | O(n) | n=nums.length | Medium |
| 0253 | [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/) | [Meeting Rooms II solution](./src/main/java/com/leetcode/MeetingRoomsII.java) | [Meeting Rooms II tests](./src/test/java/com/leetcode/MeetingRoomsIITest.java) | O(n * log(n)) | O(n) | n=intervals.length | Medium |
| 0273 | [Integer to English Words](https://leetcode.com/problems/integer-to-english-words/) | [Integer to English Words solution](./src/main/java/com/leetcode/IntegerToEnglishWords.java) | [Integer to English Words tests](./src/test/java/com/leetcode/IntegerToEnglishWordsTest.java) | O(n) | O(1) | n - number of digits in num | Hard |
| 0283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | [Move Zeroes solution](./src/main/java/com/leetcode/MoveZeroes.java) | [Move Zeroes tests](./src/test/java/com/leetcode/MoveZeroesTest.java) | O(n) | O(1) | n=nums.length | Easy |
| 0301 | [Remove Invalid Parentheses](https://leetcode.com/problems/move-zeroes/) | [Remove Invalid Parentheses solution](./src/main/java/com/leetcode/RemoveInvalidParentheses.java) | [Remove Invalid Parentheses tests](./src/test/java/com/leetcode/RemoveInvalidParenthesesTest.java) | O(2^n) | O(n^2) - without result list | n=s.length() | Hard |
| 0461 | [Hamming Distance](https://leetcode.com/problems/hamming-distance/) | [Hamming Distance solution](./src/main/java/com/leetcode/HammingDistance.java) | [Hamming Distance tests](./src/test/java/com/leetcode/HammingDistanceTest.java) | O(n) | O(n) | n - number of bits in (x or y) | Easy |
| 0973 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/) | [K Closest Points to Origin solution](./src/main/java/com/leetcode/KClosestPointsToOrigin.java) | [K Closest Points to Origin tests](./src/test/java/com/leetcode/KClosestPointsToOriginTest.java) | O(n) | O(1) | n=points.length | Medium |
| 1012 | [Complement of Base 10 Integer](https://leetcode.com/problems/complement-of-base-10-integer/) | [Complement of Base 10 Integer solution](./src/main/java/com/leetcode/ComplementOfBase10Integer.java) | [Complement of Base 10 Integer tests](./src/test/java/com/leetcode/ComplementOfBase10IntegerTest.java) | O(n) | O(n) | n - number of bits in N | Easy |
| 1013 | [Pairs of Songs With Total Durations Divisible by 60](https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/) | [Pairs of Songs With Total Durations Divisible by 60 solution](./src/main/java/com/leetcode/PairsOfSongsWithTotalDurationsDivisibleBy60.java) | [Pairs of Songs With Total Durations Divisible by 60 tests](./src/test/java/com/leetcode/PairsOfSongsWithTotalDurationsDivisibleBy60Test.java) | O(n) | O(1) | n=time.length | Easy |
| 1014 | [Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | [Capacity To Ship Packages Within D Days solution](./src/main/java/com/leetcode/CapacityToShipPackagesWithinDDays.java) | [Capacity To Ship Packages Within D Days tests](./src/test/java/com/leetcode/CapacityToShipPackagesWithinDDaysTest.java) | O(n * log(sum * (D - 1) / D) | O(1) | n=weights.length, sum=sum(weights) | Medium |
