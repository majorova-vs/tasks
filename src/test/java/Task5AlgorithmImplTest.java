import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static task5.AlgorithmImpl.findMinPath;
import static task5.TriangleUtils.parseTriangleStrToList;

import java.util.*;
public class Task5AlgorithmImplTest {

    @Test
    void emptyTriangleTest() {
        List<List<Integer>> triangle = new ArrayList<>();
        int result = findMinPath(triangle);
        assertEquals(0, result);
    }

    @Test
    void triangleTest() {
        String triangleStr = "[[2],[3,4],[6,5,7],[4,1,8,3]]";
        List<List<Integer>> triangle = parseTriangleStrToList(triangleStr);
        int result = findMinPath(triangle);
        assertEquals(11, result);
    }

    @Test
    void triangleNegativeNodesTest() {
        String triangleStr = "[[-1],[2,3],[1,-1,-3],[4,2,1,3]]";
        List<List<Integer>> triangle = parseTriangleStrToList(triangleStr);
        int result = findMinPath(triangle);
        assertEquals(0, result);
    }
}
