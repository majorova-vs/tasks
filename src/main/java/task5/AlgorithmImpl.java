package task5;

import java.util.List;

public class AlgorithmImpl {
    public static int findMinPath(List<List<Integer>> triangle) {
        // Если нет вершин, то путь равен 0
        if (triangle == null || triangle.isEmpty()) {
            return 0;
        }

        // Массив для сохраения уже вычисленных результатов
        Integer[][] sizeCache = new Integer[triangle.size()][triangle.size()];

        //Рекурсивная функция поиска кратчайшего пути (алгоритм поиска в глубину)
        return dfs(triangle, 0, 0, sizeCache);
    }

    /**
     * Реализация алгоритма поиска в глубину
     */
    private static int dfs(List<List<Integer>> triangle, int row, int col, Integer[][] sizeCache) {
       //Выход из рекурсии, если достигнуто основание треугольника
        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }

        // Если  путь уже вычислен, то возвращаем его из sizeCache
        if (sizeCache[row][col] != null) {
            return sizeCache[row][col];
        }

        //Ищем минимальный путь (рекурсивно двигаемся на индекс i (влево) или индекс i + 1 (вправо) в следующей строке).
        int left = dfs(triangle, row + 1, col, sizeCache);
        int right = dfs(triangle, row + 1, col + 1, sizeCache);

        //Вычисляем минимальный результат и сохраняем его в кэш
        sizeCache[row][col] = triangle.get(row).get(col) + Math.min(left, right);
        return sizeCache[row][col];
    }
}
