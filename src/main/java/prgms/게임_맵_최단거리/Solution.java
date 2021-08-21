package prgms.게임_맵_최단거리;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Solution {
    int answer;
    int m, n;
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    int[][] dp;

    public int solution(int[][] maps) {

        m = maps.length;
        n = maps[0].length;
        answer = m * n + 1;
        dp = new int[m][n];
        for (int i = 0; i < m; i++)
            Arrays.fill(dp[i], answer);
        dfs(maps, 0, 0, 1, new boolean[m][n]);
        if (answer == m * n + 1)
            answer = -1;
        return answer;
    }


    void dfs(int[][] maps, int x, int y, int cnt, boolean[][] visited) {
        if(cnt<dp[x][y])
            dp[x][y] = cnt;
        else
            return;


        if (x == m - 1 && y == n - 1) {
            answer = Math.min(answer, cnt);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nX = x + dx[i];
            int nY = y + dy[i];
            if (nX >= 0 && nX < m && nY >= 0 && nY < n && maps[nX][nY] != 0) {
//                visited[nX][nY] = true;
                dfs(maps, nX, nY, cnt + 1, visited);
//                visited[nX][nY] = false;
            }
        }
    }

    @Test
    void test() {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        Assertions.assertEquals(11, solution(maps));

    }
}
