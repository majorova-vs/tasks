package task5;

import java.util.ArrayList;
import java.util.List;

public class TriangleUtils {
    /**
     * Метод для преобразования строки в список списков
     */
    public static List<List<Integer>> parseTriangleStrToList(String triangleStr) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Удаляем внешние скобки и разбиваем по строкам
        String cleaned = triangleStr.substring(1, triangleStr.length() - 1);
        String[] levels = cleaned.split("\\],\\[");

        for (String level : levels) {
            // Удаляем оставшиеся скобки и разбиваем по запятым
            level = level.replace("[", "").replace("]", "");
            String[] numbers = level.split(",");

            List<Integer> row = new ArrayList<>();
            for (String num : numbers) {
                row.add(Integer.parseInt(num.trim()));
            }
            triangle.add(row);
        }

        return triangle;
    }
}
