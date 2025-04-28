import java.util.*;

class Solution {
    private static List<Integer>[] tree;
    private static class Info {
        int node, sheep, wolf;
        HashSet<Integer> adjacent;

        public Info (int node, int sheep, int wolf, HashSet<Integer> adjacent) {
            this.node = node;
            this.sheep = sheep;
            this.wolf = wolf;
            this.adjacent = adjacent;
        }
    }
		
    // 트리 구축 메소드
    private static void buildTree(int[] info, int[][] edges) {
        tree = new ArrayList[info.length];
        for(int i = 0; i < tree.length; i++) {
            tree[i] = new ArrayList<>();
        }

        for(int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
        }
    }

    public int solution(int[] info, int[][] edges) {
        buildTree(info, edges); // 트리 생성

        int answer = 0; // 최대 양의 수 저장

        // 큐 생성, 초기 상태 설정
        ArrayDeque<Info> queue = new ArrayDeque<>();
        queue.add(new Info(0, 1, 0, new HashSet<>()));

        while(!queue.isEmpty()) {
            // 큐에서 현재 노드 꺼내기
            Info now = queue.poll();
            // 최대 양의 수 업데이트
            answer = Math.max(answer, now.sheep);
            // 인접한 노드 집합에 현재 노드의 이웃 노드 추가
            now.adjacent.addAll(tree[now.node]);

            // 인접한 노드들에 대해 탐색
            for(int next : now.adjacent) {
                // 기존 해시셋의 데이터를 복사하고 현재 방문한 정점을 해시셋에서 제거
                HashSet<Integer> set = new HashSet<>(now.adjacent);
                set.remove(next);

                // 늑대일 경우
                if(info[next] == 1) { 
                    if(now.sheep != now.wolf +1) {
                        queue.add(new Info(next, now.sheep, now.wolf+1, set));
                    }
                }
                // 양일 경우
                else {
                    queue.add(new Info(next, now.sheep+1, now.wolf, set));
                }
            }

        }
        return answer;
    }
}