import java.util.stream.IntStream;

class Solution {
    public double solution(int[] numbers) {
        return IntStream.of(numbers)
                .average() // 평균 계산
                .orElse(0.0); // 값이 없을 경우 0.0 반환
    }
}
