import java.util.List;

import static task5.AlgorithmImpl.findMinPath;
import static task5.TriangleUtils.parseTriangleStrToList;

public class Main {
    public static void main(String[] args) {
        String triangleStr = "[[2],[3,4],[6,5,7],[4,1,8,3]]";
        List<List<Integer>> triangle = parseTriangleStrToList(triangleStr);

        System.out.println("Минимальная сумма пути: " + findMinPath(triangle));
    }
}
